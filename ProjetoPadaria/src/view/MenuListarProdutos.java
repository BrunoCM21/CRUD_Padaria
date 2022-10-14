package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.Border;

public class MenuListarProdutos extends javax.swing.JFrame {

    public MenuListarProdutos() {
        initComponents();
        iniciaComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        labelGrandeMenu = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnListaTodos = new javax.swing.JButton();
        btnPesquisaValor = new javax.swing.JButton();
        btnPesquisaNome = new javax.swing.JButton();
        btnPesquisaId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        labelGrandeMenu.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        labelGrandeMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrandeMenu.setText("SELECIONE A LISTAGEM DESEJADA");
        labelGrandeMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnListaTodos.setBackground(new java.awt.Color(255, 255, 255));
        btnListaTodos.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnListaTodos.setText("Lista Tudo");
        btnListaTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaTodosActionPerformed(evt);
            }
        });

        btnPesquisaValor.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisaValor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnPesquisaValor.setText("Pesquisa por Valor ou Peso");
        btnPesquisaValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaValorActionPerformed(evt);
            }
        });

        btnPesquisaNome.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisaNome.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnPesquisaNome.setText("Pesquisa por Nome");
        btnPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaNomeActionPerformed(evt);
            }
        });

        btnPesquisaId.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisaId.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        btnPesquisaId.setText("Pesquisa por Identificador");
        btnPesquisaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaIdActionPerformed(evt);
            }
        });

        desktopPane.setLayer(labelGrandeMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(btnListaTodos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(btnPesquisaValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(btnPesquisaNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(btnPesquisaId, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGrandeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnListaTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(labelGrandeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnListaTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisaId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVoltar.setBorder(new RoundedBorder(10));
        btnVoltar.setForeground(Color.BLACK);
        btnListaTodos.setBorder(new RoundedBorder(10));
        btnListaTodos.setForeground(Color.BLACK);
        btnPesquisaValor.setBorder(new RoundedBorder(10));
        btnPesquisaValor.setForeground(Color.BLACK);
        btnPesquisaNome.setBorder(new RoundedBorder(10));
        btnPesquisaNome.setForeground(Color.BLACK);
        btnPesquisaId.setBorder(new RoundedBorder(10));
        btnPesquisaId.setForeground(Color.BLACK);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaTodosActionPerformed
        ListarTodosProdutos ltp = new ListarTodosProdutos();
        ltp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnListaTodosActionPerformed

    private void btnPesquisaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaIdActionPerformed
        PesquisarProdutoId pp = new PesquisarProdutoId();
        pp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPesquisaIdActionPerformed

    private void btnPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeActionPerformed
        PesquisarProdutoNome ppn = new PesquisarProdutoNome();
        ppn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPesquisaNomeActionPerformed

    private void btnPesquisaValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaValorActionPerformed
        PesquisarProdutoValorPeso ppvp = new PesquisarProdutoValorPeso();
        ppvp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPesquisaValorActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuListarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaTodos;
    private javax.swing.JButton btnPesquisaId;
    private javax.swing.JButton btnPesquisaNome;
    private javax.swing.JButton btnPesquisaValor;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelGrandeMenu;
    // End of variables declaration//GEN-END:variables

    private void iniciaComponentes() {
        this.setResizable(false);
        this.setTitle("Menu de Listagens");
        this.setLocationRelativeTo(null);
        
    }
}
