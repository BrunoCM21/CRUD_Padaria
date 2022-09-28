package view;

import controller.ProdutoDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Produto;

public class PesquisarProdutoValorPeso extends javax.swing.JFrame {

    private List<Produto> listaProduto;
    private ProdutoDAO pDAO;

    public PesquisarProdutoValorPeso() {
        initComponents();
        configuraJanela();
        configuraTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        labelGrandePesquisa = new javax.swing.JLabel();
        gridProdutos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelValor = new javax.swing.JLabel();
        fldValor = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        labelValorAte = new javax.swing.JLabel();
        fldValorAte = new javax.swing.JTextField();
        fldPeso = new javax.swing.JTextField();
        labelPeso = new javax.swing.JLabel();
        labelPesoAte = new javax.swing.JLabel();
        fldPesoAte = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        labelGrandePesquisa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelGrandePesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrandePesquisa.setText("PESQUISA POR VALOR OU PESO");
        labelGrandePesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        labelValor.setText("jLabel1");

        fldValor.setText("jTextField1");
        fldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldValorActionPerformed(evt);
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

        labelValorAte.setText("jLabel1");

        fldValorAte.setText("jTextField1");
        fldValorAte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldValorAteActionPerformed(evt);
            }
        });

        fldPeso.setText("jTextField1");
        fldPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldPesoActionPerformed(evt);
            }
        });

        labelPeso.setText("jLabel1");

        labelPesoAte.setText("jLabel1");

        fldPesoAte.setText("jTextField1");
        fldPesoAte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldPesoAteActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(labelGrandePesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(gridProdutos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fldValor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelValorAte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fldValorAte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fldPeso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelPeso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelPesoAte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(fldPesoAte, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelGrandePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(gridProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(labelPeso)
                                .addGap(18, 18, 18)
                                .addComponent(fldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(labelValor)
                                .addGap(18, 18, 18)
                                .addComponent(fldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(labelPesoAte)
                                .addGap(18, 18, 18)
                                .addComponent(fldPesoAte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(labelValorAte)
                                .addGap(18, 18, 18)
                                .addComponent(fldValorAte, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(labelGrandePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(gridProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelValor)
                            .addComponent(fldValor)
                            .addComponent(labelValorAte)
                            .addComponent(fldValorAte))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPeso)
                            .addComponent(fldPeso)
                            .addComponent(labelPesoAte)
                            .addComponent(fldPesoAte)))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void fldPesoAteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldPesoAteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldPesoAteActionPerformed

    private void fldPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldPesoActionPerformed

    private void fldValorAteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldValorAteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldValorAteActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Produto prod = new Produto();
        Produto prodAte = new Produto();
        preencherTabela(null);
        Double valor = !fldValor.getText().equals("") ? Double.parseDouble(fldValor.getText()) : 0.0;
        Double valorAte = !fldValorAte.getText().equals("") ? Double.parseDouble(fldValorAte.getText()) : 0.0;
        Double peso = !fldPeso.getText().equals("") ? Double.parseDouble(fldPeso.getText()) : 0.0;
        Double pesoAte = !fldPesoAte.getText().equals("") ? Double.parseDouble(fldPesoAte.getText()) : 0.0;
        System.out.println(valor);
        System.out.println(valorAte);
        if ((valor != 0.0 || valorAte != 0.0) || (peso != 0.0 || pesoAte != 0.0)) {
            prod.setValor(valor);
            prod.setPeso(peso);
            preencherTabela(new ProdutoDAO().pesquisaDuploValorProduto(prod, valorAte, pesoAte));
        } else {
            preencherTabela(new ProdutoDAO().listaProdutos());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void fldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldValorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PesquisarProdutoValorPeso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField fldPeso;
    private javax.swing.JTextField fldPesoAte;
    private javax.swing.JTextField fldValor;
    private javax.swing.JTextField fldValorAte;
    private javax.swing.JScrollPane gridProdutos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelGrandePesquisa;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelPesoAte;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelValorAte;
    // End of variables declaration//GEN-END:variables

    private void configuraJanela() {
        this.pDAO = new ProdutoDAO();
        this.setTitle("Pesquisando Produtos por Valor ou Peso");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.fldValor.setText("");
        this.labelValor.setText("Valor: ");
        this.fldValorAte.setText("");
        this.labelValorAte.setText("Até: ");
        this.fldPeso.setText("");
        this.labelPeso.setText("Peso: ");
        this.fldPesoAte.setText("");
        this.labelPesoAte.setText("Até: ");
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
