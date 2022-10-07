package view;

import controller.ProdutoDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

public class ProdutoCRUD extends javax.swing.JFrame {
    
    private String idAntigo = "";

    public ProdutoCRUD() {
        initComponents();
        configuraFormulario();
        txtId.setEditable(true); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        labelGrandeAlterar = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        gridProdutos = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        labelGrandeAlterar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelGrandeAlterar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrandeAlterar.setText("Produto");
        labelGrandeAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(labelGrandeAlterar);
        labelGrandeAlterar.setBounds(0, 0, 690, 60);

        labelPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPeso.setText("Peso:");
        desktopPane.add(labelPeso);
        labelPeso.setBounds(350, 120, 60, 40);

        labelId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelId.setText("Identificador:");
        desktopPane.add(labelId);
        labelId.setBounds(50, 60, 80, 40);

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNome.setText("Nome:");
        desktopPane.add(labelNome);
        labelNome.setBounds(170, 60, 90, 40);
        labelNome.getAccessibleContext().setAccessibleDescription("");

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelValor.setText("Valor: ");
        desktopPane.add(labelValor);
        labelValor.setBounds(50, 120, 70, 40);

        txtPeso.setToolTipText("Insira o peso do Paciente");
        desktopPane.add(txtPeso);
        txtPeso.setBounds(350, 150, 290, 30);
        txtPeso.getAccessibleContext().setAccessibleDescription("Insira o peso do Produto");

        txtId.setToolTipText("Insira o identificador do Paciente");
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        desktopPane.add(txtId);
        txtId.setBounds(50, 90, 110, 30);

        txtNome.setToolTipText("Insira o nome do Paciente");
        desktopPane.add(txtNome);
        txtNome.setBounds(170, 90, 470, 30);
        txtNome.getAccessibleContext().setAccessibleDescription("Insira o nome do Produto");

        txtValor.setToolTipText("Insira a altura do Paciente");
        desktopPane.add(txtValor);
        txtValor.setBounds(50, 150, 290, 30);
        txtValor.getAccessibleContext().setAccessibleDescription("Insira o valor do Produto");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        desktopPane.add(btnVoltar);
        btnVoltar.setBounds(0, 410, 110, 30);
        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);

        btnListar.setBackground(new java.awt.Color(255, 255, 255));
        btnListar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        desktopPane.add(btnListar);
        btnListar.setBounds(530, 370, 110, 30);
        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);

        btnNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        desktopPane.add(btnNovo);
        btnNovo.setBounds(50, 370, 110, 30);
        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);

        btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        desktopPane.add(btnAlterar);
        btnAlterar.setBounds(290, 370, 110, 30);
        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);

        btnRemover.setBackground(new java.awt.Color(255, 255, 255));
        btnRemover.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        desktopPane.add(btnRemover);
        btnRemover.setBounds(410, 370, 110, 30);
        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);

        btnInserir.setBackground(new java.awt.Color(255, 255, 255));
        btnInserir.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        desktopPane.add(btnInserir);
        btnInserir.setBounds(170, 370, 110, 30);
        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        gridProdutos.setViewportView(tabelaProdutos);

        desktopPane.add(gridProdutos);
        gridProdutos.setBounds(50, 200, 590, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        ProdutoDAO pDAO = new ProdutoDAO();
        Produto p = new Produto();
        if(!txtId.getText().isEmpty() && !txtId.getText().equals("0")) {
            p.setId(Integer.valueOf(txtId.getText()));
        }
        p.setNomeMarca(txtNome.getText());
        p.setPeso(Double.valueOf(txtPeso.getText()));
        p.setValor(Double.valueOf(txtValor.getText()));
        
        int retorno = -1;
        
        if(p.getId() == 0) {
            retorno = pDAO.insereProduto(p);
            txtId.setText(retorno != -1 ? String.valueOf(retorno) : "0");
        } else {
            //retorno = pDAO.alteraPaciente(p);
        }
        
        if(retorno != -1) {
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso.", "Produtos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir o registro.", "Produtos", JOptionPane.ERROR_MESSAGE);
        }
        controleEstadoBotoes(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
        Produto prod = new Produto();
        String id = txtId.getText();
        if (!id.equals("") && !id.equals(idAntigo)) {
            prod.setId(Integer.parseInt(id));
            ProdutoDAO pDao = new ProdutoDAO();
            List<Produto> listaRet = pDao.pesquisaProdutoID(prod, false);
            if(!listaRet.isEmpty()){
                Produto prodRet = listaRet.get(0);
                txtNome.setText(prodRet.getNomeMarca());
                txtPeso.setText(String.valueOf(prodRet.getPeso()));
                txtValor.setText(String.valueOf(prodRet.getValor()));
                idAntigo = txtId.getText();
                controleEstadoFormulario(true);
                controleEstadoBotoes(false);
            }
        }
    }//GEN-LAST:event_txtIdFocusLost

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        Produto prod = new Produto();
        ProdutoDAO pDAO = new ProdutoDAO();
        prod.setId(Integer.parseInt(txtId.getText()));
        pDAO.deletaProduto(prod);
        configuraFormulario();
        limpaFormulario();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        controleEstadoFormulario(true);
        controleEstadoBotoes(true);
        limpaFormulario();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        preencherTabela(new ProdutoDAO().listaProdutos());
    }//GEN-LAST:event_btnListarActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        controleEstadoBotoes(false);
        int linha = tabelaProdutos.getSelectedRow();
        if (linha >= 0) {
            txtId.setText(tabelaProdutos.getValueAt(linha, 0).toString());
            txtNome.setText(tabelaProdutos.getValueAt(linha, 1).toString());
            txtPeso.setText(tabelaProdutos.getValueAt(linha, 2).toString());
            txtValor.setText(tabelaProdutos.getValueAt(linha, 3).toString());
        }
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JScrollPane gridProdutos;
    private javax.swing.JLabel labelGrandeAlterar;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    /**
     * Inicia o formulário da tela
     */
    private void configuraFormulario() {
        this.setResizable(false);
        this.setTitle("Produto");
        this.setLocationRelativeTo(null);
        txtValor.setToolTipText("Insira a altura do Paciente");
        txtNome.setToolTipText("Insira o nome do Paciente");
        txtId.setToolTipText("Insira o identificador do Paciente");
        txtPeso.setToolTipText("Insira o peso do Paciente");
        controleEstadoFormulario(true);
        controleEstadoBotoes(true);
    }
    
    private void controleEstadoFormulario(boolean controlador){    
        txtValor.setEditable(controlador);       
        txtPeso.setEditable(controlador);
        txtNome.setEditable(controlador);
        if(!controlador) {
            limpaFormulario();
        }
    }
    
    private void controleEstadoBotoes(boolean controlador) {
        btnInserir.setEnabled(controlador);
        btnAlterar.setEnabled(!controlador);
        btnRemover.setEnabled(!controlador);
    }
    
    private void limpaFormulario() {
        txtValor.setText("");
        txtNome.setText("");
        txtPeso.setText("");
        txtId.setText("");
    }
    
    private void preencherTabela(List<Produto> lista){
        if(lista.size()>0){
            configuraTabela();
            DefaultTableModel m = (DefaultTableModel)tabelaProdutos.getModel();
            for(Produto p : lista){
                m.addRow(new Object[]{
                p.getId(), p.getNomeMarca(), p.getPeso(), p.getValor()
            });
            }
            tabelaProdutos.setModel(m);
        }
    }
    
    private void configuraTabela() {
        DefaultTableModel m = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            
            m.addColumn("Id");
            m.addColumn("Nome");
            m.addColumn("Peso");
            m.addColumn("Valor"); 

            tabelaProdutos.setModel(m); 
    }
}
