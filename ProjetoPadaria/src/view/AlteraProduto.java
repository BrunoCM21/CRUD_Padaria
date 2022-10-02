package view;

import controller.ProdutoDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;

public class AlteraProduto extends javax.swing.JFrame {
    
    private String idAntigo = "";

    public AlteraProduto() {
        initComponents();
        configuraFormularioInserir();
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
        btnVoltar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnPesquisarNovamente = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        labelGrandeAlterar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelGrandeAlterar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrandeAlterar.setText("Alterar Produto");
        labelGrandeAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(labelGrandeAlterar);
        labelGrandeAlterar.setBounds(0, 0, 670, 60);

        labelPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelPeso.setText("Peso:");
        desktopPane.add(labelPeso);
        labelPeso.setBounds(30, 210, 190, 30);

        labelId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelId.setText("Identificador:");
        desktopPane.add(labelId);
        labelId.setBounds(30, 90, 190, 30);

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNome.setText("Nome:");
        desktopPane.add(labelNome);
        labelNome.setBounds(30, 130, 190, 30);
        labelNome.getAccessibleContext().setAccessibleDescription("");

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelValor.setText("Valor: ");
        desktopPane.add(labelValor);
        labelValor.setBounds(30, 170, 190, 30);

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        desktopPane.add(btnVoltar);
        btnVoltar.setBounds(0, 270, 110, 30);
        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);

        btnNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnNovo.setText("Criar Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        desktopPane.add(btnNovo);
        btnNovo.setBounds(230, 250, 110, 30);
        btnNovo.setBorder(new RoundedBorder(10));
        btnNovo.setForeground(Color.BLACK);

        btnPesquisarNovamente.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisarNovamente.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnPesquisarNovamente.setText("Pesquisar Outro ID");
        btnPesquisarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarNovamenteActionPerformed(evt);
            }
        });
        desktopPane.add(btnPesquisarNovamente);
        btnPesquisarNovamente.setBounds(350, 250, 160, 30);
        btnNovo.setBorder(new RoundedBorder(10));
        btnNovo.setForeground(Color.BLACK);

        btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        desktopPane.add(btnAlterar);
        btnAlterar.setBounds(520, 250, 110, 30);
        btnAlterar.setBorder(new RoundedBorder(10));
        btnAlterar.setForeground(Color.BLACK);

        txtPeso.setToolTipText("Insira o peso do Paciente");
        desktopPane.add(txtPeso);
        txtPeso.setBounds(160, 210, 470, 30);
        txtPeso.getAccessibleContext().setAccessibleDescription("Insira o peso do Produto");

        txtId.setToolTipText("Insira o identificador do Paciente");
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        desktopPane.add(txtId);
        txtId.setBounds(160, 90, 470, 30);
        txtId.getAccessibleContext().setAccessibleDescription("Insira o identificador do Produto");

        txtNome.setToolTipText("Insira o nome do Paciente");
        desktopPane.add(txtNome);
        txtNome.setBounds(160, 130, 470, 30);
        txtNome.getAccessibleContext().setAccessibleDescription("Insira o nome do Produto");

        txtValor.setToolTipText("Insira a altura do Paciente");
        desktopPane.add(txtValor);
        txtValor.setBounds(160, 170, 470, 30);
        txtValor.getAccessibleContext().setAccessibleDescription("Insira o valor do Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        InserirProduto ip = new InserirProduto();
        ip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtId.setText("");
        txtNome.setText("");
        txtPeso.setText("");
        txtValor.setText("");
        controleEstado(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
        Produto prod = new Produto();
        System.out.println("Teste entrada");
        String id = txtId.getText();
        System.out.println(id);
        prod.setId(Integer.parseInt(id));
        System.out.println(!id.equals(""));
        System.out.println(!id.equals(idAntigo));
        if (!id.equals("") && !id.equals(idAntigo)) {
            ProdutoDAO pDao = new ProdutoDAO();
            List<Produto> listaRet = pDao.pesquisaProdutoID(prod, false);
            System.out.println(listaRet);
            if(!listaRet.isEmpty()){
                System.out.println(prod.getId());
                Produto prodRet = listaRet.get(0);
                txtNome.setText(prodRet.getNomeMarca());
                txtPeso.setText(String.valueOf(prodRet.getPeso()));
                txtValor.setText(String.valueOf(prodRet.getValor()));
                controleEstado(true);
                idAntigo = txtId.getText();
            }
        }
    }//GEN-LAST:event_txtIdFocusLost

    private void btnPesquisarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNovamenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarNovamenteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlteraProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarNovamente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelGrandeAlterar;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelValor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    /**
     * Inicia o formulário da tela
     */
    private void configuraFormularioInserir() {
        this.setResizable(false);
        this.setTitle("Inserir Paciente");
        this.setLocationRelativeTo(null);
        controleEstado(false);
    }
    
    private void controleEstado(boolean controlador){    
        txtValor.setEditable(controlador);       
        txtPeso.setEditable(controlador);
        txtNome.setEditable(controlador);
        txtId.setEditable(!controlador);
        btnAlterar.setEnabled(controlador);
        btnNovo.setEnabled(!controlador);
        if(controlador) {
            prencheFormularioInserir();
        } else {
            limpaFormularioInserir();
        }
    }
    
    private void limpaFormularioInserir() {
        txtValor.setText("Insira o valor do Produto");
        txtId.setText("");
        txtNome.setText("Insira o nome do Produto");
        txtPeso.setText("Insira o peso do Produto");
        txtValor.setToolTipText("");
        txtNome.setToolTipText("");
        txtId.setToolTipText("");
        txtPeso.setToolTipText("");
    }
    
    private void prencheFormularioInserir() {
        txtValor.setText("");
        txtId.setText("Insira o identificador do Produto");
        txtNome.setText("");
        txtPeso.setText("");
        txtValor.setToolTipText("Insira a altura do Paciente");
        txtNome.setToolTipText("Insira o nome do Paciente");
        txtId.setToolTipText("Insira o identificador do Paciente");
        txtPeso.setToolTipText("Insira o peso do Paciente");
    }
}
