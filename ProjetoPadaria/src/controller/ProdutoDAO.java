package controller;

import com.mysql.cj.xdevapi.SqlResultBuilder;
import java.awt.HeadlessException;
import model.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    private Connection conexao;
    private PreparedStatement cmd;

    public ProdutoDAO() {
        this.conexao = Conexao.ConectarBD();
    }

    public int insereProduto(Produto p) {
        try {
            String sql = "insert into produto(nome_marca, peso, valor) values (?,?,?)";
            cmd = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, p.getNomeMarca());
            cmd.setDouble(2, p.getPeso());
            cmd.setDouble(3, p.getValor());

            if (cmd.executeUpdate() > 0) {
                ResultSet rs = cmd.getGeneratedKeys();
                return rs.next() ? rs.getInt(1) : -1;

            } else {
                return -1;
            }
        } catch (SQLException e) {
            System.out.println("ERRO" + e.getMessage());
            return -1;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
    }

    public int deletaProduto(Produto p) {
        try {
            String sql = "delete from produto where id = ?";
            cmd = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, p.getId());
            cmd.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso.");
        } catch (SQLException sqlE) {
            System.out.println("ERRO" + sqlE.getMessage());
            return -1;
        } catch (HeadlessException he) {
            System.out.println("ERRO" + he.getMessage());
            return -1;
        } catch (Exception e) {
            System.out.println("ERRO" + e.getMessage());
            return -1;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
        return 0;
    }

    public List<Produto> listaProdutos() {
        List<Produto> lista = new ArrayList<Produto>();
        try {
            String sql = "select * from produto";
            cmd = conexao.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNomeMarca(rs.getString("nome_marca"));
                p.setPeso(rs.getDouble("peso"));
                p.setValor(rs.getDouble("valor"));

                lista.add(p);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("ERRO" + e.getMessage());
            return null;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
    }

    public List<Produto> pesquisaProdutoID(Produto prod, boolean selecionarPorParteId) {
        List<Produto> lista = new ArrayList<Produto>();
        try {
            String sql;
            if (selecionarPorParteId) {
                sql = "select * from produto where id like ?";
                cmd = conexao.prepareStatement(sql);
                cmd.setString(1, "%" + prod.getId() + "%");
            } else {
                sql = "select * from produto where id = ?";
                cmd = conexao.prepareStatement(sql);
                cmd.setInt(1, prod.getId());
            }
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNomeMarca(rs.getString("nome_marca"));
                p.setPeso(rs.getDouble("peso"));
                p.setValor(rs.getDouble("valor"));

                lista.add(p);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("ERRO" + e.getMessage());
            return null;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
    }

    public List<Produto> pesquisaProdutoNome(Produto prod, boolean selecionarPorParteNome) {
        List<Produto> lista = new ArrayList<Produto>();
        try {
            String sql;
            if (selecionarPorParteNome) {
                //TODO verificar nomeMarca
                sql = "select * from produto where nomeMarca like ?";
                cmd = conexao.prepareStatement(sql);
                cmd.setString(1, "%" + prod.getNomeMarca() + "%");
            } else {
                sql = "select * from produto where nomeMarca = ?";
                cmd = conexao.prepareStatement(sql);
                cmd.setString(1, prod.getNomeMarca());
            }
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNomeMarca(rs.getString("nome_marca"));
                p.setPeso(rs.getDouble("peso"));
                p.setValor(rs.getDouble("valor"));

                lista.add(p);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("ERRO" + e.getMessage());
            return null;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
    }

    public List<Produto> pesquisaDuploValorProduto(Produto prod, Double valorAte, Double pesoAte) {
        List<Produto> lista = new ArrayList<Produto>();
        List<String> wheres = new ArrayList<String>();
        List<Double> obj = new ArrayList<Double>();
        System.out.println(prod.getValor());
        System.out.println(valorAte);
        try {
            String sql = "select * from produto where ";
            
            if(prod.getValor() != 0.0) {
                wheres.add("valor >= ? ");
                obj.add(prod.getValor());
            } 
            if(valorAte != 0.0) {
                wheres.add("valor <= ? ");
                obj.add(valorAte);
            }
            System.out.println(wheres);
            if(!wheres.isEmpty()) {
                for(String w : wheres) {
                    if(wheres.get(0).equals(w)) {
                        sql += w;
                    } else {
                        sql += "and " + w;
                    }
                }
            }
            System.out.println(wheres);
            System.out.println(obj);
            cmd = conexao.prepareStatement(sql);
            int contador = 1;
            for(Double v : obj) {
                cmd.setDouble(contador, v);
                contador++;
            }
            System.out.println(sql);
            ResultSet rs = cmd.executeQuery();
            System.out.println(sql);
            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNomeMarca(rs.getString("nome_marca"));
                p.setPeso(rs.getDouble("peso"));
                p.setValor(rs.getDouble("valor"));

                lista.add(p);
            }
            return lista;
        } catch (SQLException e) {
            System.out.println("ERRO" + e.getMessage());
            return null;
        } finally {
            Conexao.DesconectarBD(conexao);
        }
    }
    
    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public PreparedStatement getCmd() {
        return cmd;
    }

    public void setCmd(PreparedStatement cmd) {
        this.cmd = cmd;
    }
}
