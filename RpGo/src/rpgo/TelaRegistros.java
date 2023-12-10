package rpgo;

import ClassesRpGo.Funcionario;
import ClassesRpGo.Jogador;
import ClassesRpGo.Pessoa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TelaRegistros extends javax.swing.JFrame {

    public TelaRegistros() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(30, 30, 30));
        setLocationRelativeTo(null);
        montarTabela(new Funcionario());
        montarTabela(new Jogador());
    }
    
   private void montarTabela(Pessoa obj) {
       DefaultTableModel tabela;
       ArrayList<Pessoa> pessoas;
       Funcionario mestre = null;
       Jogador jogador = null;
       if(obj instanceof Funcionario){
            pessoas = Funcionario.lerFuncionariosDoArquivo("src\\Save\\Funcionarios.txt");
                tabela = new DefaultTableModel(new Object[]{"ID", "Usuário", "Nome"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
       }
       else{
          pessoas = Jogador.lerJogadorDoArquivo("src\\Save\\Jogadores.txt");
            tabela = new DefaultTableModel(new Object[]{"ID", "Nome", "Data de Nascimento"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
       } 
       if (txtfBusca.getText().equals("")) {
            for (int i = 0; i < pessoas.size(); i++) {
                Pessoa pessoa = pessoas.get(i);
                if(pessoa instanceof Funcionario){
                
                    mestre = (Funcionario)pessoa;
                }
                else{
                    jogador = (Jogador)pessoa;
                }
                
                
            if (mestre != null) {
                Object linha[] = new Object[]{
                    mestre.getId(),
                    mestre.getUsuario(),
                    mestre.getNome()
                };

                tabela.addRow(linha);
            }
            else if(jogador != null){
                Object linha[] = new Object[]{
                    jogador.getId(),
                    jogador.getNome(),
                    jogador.getDataDeNascimento()
                };

                tabela.addRow(linha);
            }
        }
        if(obj instanceof Funcionario){
            tblFuncionarios.setModel(tabela);
            tblFuncionarios.getTableHeader().setReorderingAllowed(false); // Torna as colunas fixas
        }else{
            tblJogadores.setModel(tabela);
            tblJogadores.getTableHeader().setReorderingAllowed(false); // Torna as colunas fixas
        }
        
    } else {
        for (int i = 0; i < (pessoas.size()); i++) {
            Object linha[];
            if (i < pessoas.size() && txtfBusca.getText().equals(pessoas.get(i).getNome())) {
                Pessoa pessoa = pessoas.get(i);
                if(pessoa instanceof Funcionario){
                
                    mestre = (Funcionario)pessoa;
                }
                else{
                    jogador = (Jogador)pessoa;
                }
                
                
            if (mestre != null) {
                linha = new Object[]{
                    mestre.getId(),
                    mestre.getUsuario(),
                    mestre.getNome()
                };

                tabela.addRow(linha);
            }
            else if(jogador != null){
                linha = new Object[]{
                    jogador.getId(),
                    jogador.getNome(),
                    jogador.getDataDeNascimento()
                };

                tabela.addRow(linha);
            }
        }
        if(obj instanceof Funcionario){
            tblFuncionarios.setModel(tabela);
            tblFuncionarios.getTableHeader().setReorderingAllowed(false); // Torna as colunas fixas
        }else{
            tblJogadores.setModel(tabela);
            tblJogadores.getTableHeader().setReorderingAllowed(false); // Torna as colunas fixas
        }
    }
       }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfBusca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        lblJogadores = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJogadores = new javax.swing.JTable();
        lblMestres = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAddJogador = new javax.swing.JButton();
        btnAddMestre = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registros");

        txtfBusca.setBackground(new java.awt.Color(40, 40, 40));
        txtfBusca.setForeground(new java.awt.Color(255, 255, 255));
        txtfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfBuscaActionPerformed(evt);
            }
        });

        tblFuncionarios.setAutoCreateRowSorter(true);
        tblFuncionarios.setBackground(new java.awt.Color(40, 40, 40));
        tblFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Usuário", "Nome"
            }
        ));
        jScrollPane1.setViewportView(tblFuncionarios);

        lblJogadores.setForeground(new java.awt.Color(255, 255, 255));
        lblJogadores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJogadores.setText("Jogadores");

        tblJogadores.setAutoCreateRowSorter(true);
        tblJogadores.setBackground(new java.awt.Color(40, 40, 40));
        tblJogadores.setForeground(new java.awt.Color(255, 255, 255));
        tblJogadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Data de Nascimento"
            }
        ));
        jScrollPane2.setViewportView(tblJogadores);

        lblMestres.setForeground(new java.awt.Color(255, 255, 255));
        lblMestres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMestres.setText("Mestres");

        btnEditar.setBackground(new java.awt.Color(30, 30, 30));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/32x32/pencil.png"))); // NOI18N
        btnEditar.setToolTipText("Editar selecionado");
        btnEditar.setBorder(null);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir1.setBackground(new java.awt.Color(30, 30, 30));
        btnExcluir1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/32x32/trash.png"))); // NOI18N
        btnExcluir1.setToolTipText("Excluir selecionado");
        btnExcluir1.setBorder(null);
        btnExcluir1.setContentAreaFilled(false);
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(30, 30, 30));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/32x32/search.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAddJogador.setBackground(new java.awt.Color(30, 30, 30));
        btnAddJogador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAddJogador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/16x16/plus.png"))); // NOI18N
        btnAddJogador.setToolTipText("Inserir jogador");
        btnAddJogador.setBorder(null);
        btnAddJogador.setContentAreaFilled(false);
        btnAddJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJogadorActionPerformed(evt);
            }
        });

        btnAddMestre.setBackground(new java.awt.Color(30, 30, 30));
        btnAddMestre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAddMestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/16x16/plus.png"))); // NOI18N
        btnAddMestre.setToolTipText("Inserir mestre");
        btnAddMestre.setBorder(null);
        btnAddMestre.setContentAreaFilled(false);
        btnAddMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMestreActionPerformed(evt);
            }
        });

        btnSelecionar.setBackground(new java.awt.Color(30, 30, 30));
        btnSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/32x32/tick.png"))); // NOI18N
        btnSelecionar.setBorder(null);
        btnSelecionar.setContentAreaFilled(false);
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMestres, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddMestre)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblJogadores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddJogador)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir1)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecionar)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfBusca)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSelecionar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnExcluir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMestres)
                        .addComponent(lblJogadores))
                    .addComponent(btnAddJogador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddMestre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnAddJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJogadorActionPerformed
        // TODO add your handling code here:
        new InserirJogador().setVisible(true);
    }//GEN-LAST:event_btnAddJogadorActionPerformed

    private void btnAddMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMestreActionPerformed
        // TODO add your handling code here:
        new InserirMestre().setVisible(true);
    }//GEN-LAST:event_btnAddMestreActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void txtfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfBuscaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddJogador;
    private javax.swing.JButton btnAddMestre;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblJogadores;
    private javax.swing.JLabel lblMestres;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTable tblJogadores;
    private javax.swing.JTextField txtfBusca;
    // End of variables declaration//GEN-END:variables
}
