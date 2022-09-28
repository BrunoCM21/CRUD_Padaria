package view;

import controller.ProdutoDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Produto;

public class PesquisarProdutoNome extends javax.swing.JFrame {

    private List<Produto> listaProduto;
    private ProdutoDAO pDAO;

    public PesquisarProdutoNome() {
        initComponents();
        configuraJanela();
        configuraTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        labelGrandeDeletar = new javax.swing.JLabel();
        gridProdutos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelNomeSel = new javax.swing.JLabel();
        fldNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        ckbSelecionarPorParte = new javax.swing.JCheckBox();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        labelGrandeDeletar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelGrandeDeletar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrandeDeletar.setText("PESQUISA POR NOME");
        labelGrandeDeletar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        gridProdutos.setViewportView(jTable1);

        labelNomeSel.setText("jLabel1");

        fldNome.setText("jTextField1");
        fldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNomeActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        ckbSelecionarPorParte.setText("jCheckBox1");

        jDesktopPane1.setLayer(labelGrandeDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(gridProdutos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelNomeSel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fldNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ckbSelecionarPorParte, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelGrandeDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gridProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelNomeSel)
                        .addGap(18, 18, 18)
                        .addComponent(fldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ckbSelecionarPorParte)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(labelGrandeDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(gridProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeSel)
                    .addComponent(fldNome)
                    .addComponent(ckbSelecionarPorParte))
                .addContainerGap())
        );

        btnPesquisar.setBorder(new RoundedBorder(10));
        btnPesquisar.setForeground(Color.BLACK);

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        MenuListarProdutos mlp = new MenuListarProdutos();
        mlp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void fldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNomeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Produto prod = new Produto();
        preencherTabela(null);
        if (!"".equals(fldNome.getText()) && fldNome.getText() != null) {
            prod.setNomeMarca(fldNome.getText());
            preencherTabela(new ProdutoDAO().pesquisaProdutoNome(prod, ckbSelecionarPorParte.isSelected()));
        } else {
            preencherTabela(new ProdutoDAO().listaProdutos());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PesquisarProdutoNome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbSelecionarPorParte;
    private javax.swing.JTextField fldNome;
    private javax.swing.JScrollPane gridProdutos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelGrandeDeletar;
    private javax.swing.JLabel labelNomeSel;
    // End of variables declaration//GEN-END:variables

    private void configuraJanela() {
        this.pDAO = new ProdutoDAO();
        this.setTitle("Pesquisando Produtos por Nome");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.fldNome.setText("");
        this.labelNomeSel.setText("Nome: ");
        this.ckbSelecionarPorParte.setText("Deseja selecionar por parte do NOME?");

    }

    private void configuraTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        m.addColumn("Id");
        m.addColumn("Nome");
        m.addColumn("Peso");
        m.addColumn("Valor");

        jTable1.setModel(m);
    }

    private void preencherTabela(List<Produto> lista) {
        if (lista != null && lista.size() > 0) {
            configuraTabela();
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            for (Produto p : lista) {
                m.addRow(new Object[]{
                    p.getId(), p.getNomeMarca(), p.getPeso(), p.getValor()
                });
            }
            jTable1.setModel(m);
        } else {
            configuraTabela();
            DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
            jTable1.setModel(m);
        }
    }

    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public ProdutoDAO getpDAO() {
        return pDAO;
    }

    public void setpDAO(ProdutoDAO pDAO) {
        this.pDAO = pDAO;
    }
}
