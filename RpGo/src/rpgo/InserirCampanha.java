/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rpgo;

import ClassesRpGo.Campanha;

/**
 *
 * @author PC
 */
public class InserirCampanha extends javax.swing.JFrame {
    
    public static boolean FLAG = false;
    
    public static String nome;
    
    public InserirCampanha() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(30, 30, 30));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtfTitulo = new javax.swing.JTextField();
        txtfSistema = new javax.swing.JTextField();
        cboxFrequencia = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblSistema = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCriacaoCampanha = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSalvar = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        txtfMestre = new javax.swing.JTextField();
        lblBuscarMestre = new javax.swing.JButton();
        txtfId = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Campanha");
        setResizable(false);

        txtfTitulo.setBackground(new java.awt.Color(40, 40, 40));
        txtfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfTituloActionPerformed(evt);
            }
        });

        txtfSistema.setBackground(new java.awt.Color(40, 40, 40));
        txtfSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfSistemaActionPerformed(evt);
            }
        });

        cboxFrequencia.setBackground(new java.awt.Color(40, 40, 40));
        cboxFrequencia.setForeground(new java.awt.Color(255, 255, 255));
        cboxFrequencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semanalmente", "Bisemanalmente", "Mensalmente", "Bimensalmente" }));
        cboxFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxFrequenciaActionPerformed(evt);
            }
        });

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID");

        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Título");

        lblSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblSistema.setText("Sistema");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data de Início:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Frequência:");

        lblCriacaoCampanha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCriacaoCampanha.setForeground(new java.awt.Color(255, 255, 255));
        lblCriacaoCampanha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCriacaoCampanha.setText("Criação de Campanha");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mestre");

        lblSalvar.setBackground(new java.awt.Color(86, 86, 86));
        lblSalvar.setForeground(new java.awt.Color(255, 255, 255));
        lblSalvar.setText("Salvar");
        lblSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSalvarActionPerformed(evt);
            }
        });

        jFormattedTextField1.setBackground(new java.awt.Color(40, 40, 40));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##/##/####"))));
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        txtfMestre.setBackground(new java.awt.Color(40, 40, 40));
        txtfMestre.setForeground(new java.awt.Color(255, 255, 255));
        txtfMestre.setEnabled(false);
        txtfMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfMestreActionPerformed(evt);
            }
        });

        lblBuscarMestre.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscarMestre.setText("Buscar Mestre");
        lblBuscarMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblBuscarMestreActionPerformed(evt);
            }
        });

        txtfId.setBackground(new java.awt.Color(40, 40, 40));
        txtfId.setForeground(new java.awt.Color(255, 255, 255));
        txtfId.setEnabled(false);
        txtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBuscarMestre))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cboxFrequencia, 0, 1, Short.MAX_VALUE))
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSistema)
                                    .addComponent(txtfSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblTitulo)
                                        .addGap(212, 212, 212)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addComponent(txtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(32, Short.MAX_VALUE))))
            .addComponent(lblCriacaoCampanha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCriacaoCampanha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSistema)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfMestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarMestre)
                    .addComponent(lblSalvar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxFrequenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxFrequenciaActionPerformed

    private void lblSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSalvarActionPerformed
        Campanha campanha = new Campanha(Campanha.ID, txtfTitulo.getText(), txtfSistema.getText(),  );
    }//GEN-LAST:event_lblSalvarActionPerformed

    private void lblBuscarMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblBuscarMestreActionPerformed
        FLAG = true;
        
        TelaRegistros telaSelecao = new TelaRegistros();
        telaSelecao.setVisible(true);
        telaSelecao.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosed(java.awt.event.WindowEvent evento) {txtfMestre.setText(nome);}
        });
        
        
    }//GEN-LAST:event_lblBuscarMestreActionPerformed

    private void txtfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfTituloActionPerformed

    private void txtfSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfSistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfSistemaActionPerformed

    private void txtfMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfMestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfMestreActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void txtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InserirCampanha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirCampanha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirCampanha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirCampanha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirCampanha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxFrequencia;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton lblBuscarMestre;
    private javax.swing.JLabel lblCriacaoCampanha;
    private javax.swing.JLabel lblId;
    private javax.swing.JButton lblSalvar;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtfId;
    private javax.swing.JTextField txtfMestre;
    private javax.swing.JTextField txtfSistema;
    private javax.swing.JTextField txtfTitulo;
    // End of variables declaration//GEN-END:variables
}
