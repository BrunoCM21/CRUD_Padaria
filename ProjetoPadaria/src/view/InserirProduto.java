package view;

import controller.ProdutoDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.Produto;

public class InserirProduto extends javax.swing.JFrame {

    public InserirProduto() {
        initComponents();
        configuraFormularioInserir();
        txtId.setEditable(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        labelGrandeInserir = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        labelGrandeInserir.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelGrandeInserir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrandeInserir.setText("Inserir Produto");
        labelGrandeInserir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(labelGrandeInserir);
        labelGrandeInserir.setBounds(0, 0, 670, 60);

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
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        desktopPane.add(btnNovo);
        btnNovo.setBounds(280, 250, 110, 30);
        btnNovo.setBorder(new RoundedBorder(10));
        btnNovo.setForeground(Color.BLACK);

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        desktopPane.add(btnCancelar);
        btnCancelar.setBounds(520, 250, 110, 30);
        btnCancelar.setBorder(new RoundedBorder(10));
        btnCancelar.setForeground(Color.BLACK);

        btnInserir.setBackground(new java.awt.Color(255, 255, 255));
        btnInserir.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        desktopPane.add(btnInserir);
        btnInserir.setBounds(400, 250, 110, 30);
        btnInserir.setBorder(new RoundedBorder(10));
        btnInserir.setForeground(Color.BLACK);

        txtPeso.setToolTipText("Insira o peso do Paciente");
        desktopPane.add(txtPeso);
        txtPeso.setBounds(160, 210, 470, 30);
        txtPeso.getAccessibleContext().setAccessibleDescription("Insira o peso do Produto");

        txtId.setToolTipText("Insira o identificador do Paciente");
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
        controleEstado(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        controleEstado(false);
        limpaFormularioInserir();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            if(retorno != -1) {
                JOptionPane.showMessageDialog(null, "Produto inserido com sucesso.", "Produtos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível inserir o registro.", "Produtos", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            retorno = pDAO.alteraProduto(p);
            if(retorno != -1) {
                JOptionPane.showMessageDialog(null, "Produto alterado com sucesso.", "Produtos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível alterar o registro.", "Produtos", JOptionPane.ERROR_MESSAGE);
            }
        }
        controleEstado(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelGrandeInserir;
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
        this.setTitle("Inserir Produto");
        this.setLocationRelativeTo(null);
        txtValor.setToolTipText("Insira o valor do Produto");
        txtNome.setToolTipText("Insira o nome do Produto/Marca");
        txtId.setToolTipText("Insira o identificador do Produto");
        txtPeso.setToolTipText("Insira o peso do Produto");
        
        controleEstado(false);
    }
    
    private void controleEstado(boolean controlador){    
        txtValor.setEditable(controlador);       
        txtPeso.setEditable(controlador);
        txtNome.setEditable(controlador);
        btnCancelar.setEnabled(controlador);
        btnInserir.setEnabled(controlador);
        btnNovo.setEnabled(!controlador);
        if(controlador) {
            limpaFormularioInserir();
        }
    }
    
    private void limpaFormularioInserir() {
        txtValor.setText("");
        txtId.setText("");
        txtNome.setText("");
        txtPeso.setText("");
    }
}
