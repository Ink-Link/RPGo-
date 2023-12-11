package rpgo;

import ClassesRpGo.Funcionario;
import ClassesRpGo.Jogador;
import ClassesRpGo.Pessoa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaRegistros extends javax.swing.JFrame {


    public TelaRegistros() {
        initComponents();
        txtfBusca.setBackground(new java.awt.Color(40, 40, 40));
        txtfBusca.setForeground(new java.awt.Color(255, 255, 255));
        txtfBusca.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtfBuscaActionPerformed(evt);
        }
        });
        btnBuscar.setBackground(new java.awt.Color(30, 30, 30));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/32x32/search.png")));
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBuscarActionPerformed(evt);
        }
    });
        getContentPane().setBackground(new java.awt.Color(30, 30, 30));
        setLocationRelativeTo(null);
        montarTabelas();
        
    }
    
    private void montarTabelas() {
        montarTabela(tblFuncionarios, Funcionario.lerFuncionariosDoArquivo("src\\Save\\Funcionarios.txt"));
        montarTabela(tblJogadores, Jogador.lerJogadorDoArquivo("src\\Save\\Jogadores.txt"));
    }
    private void montarTabela(javax.swing.JTable tabela, ArrayList<Pessoa> pessoas) {
        DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        if (tabela == tblFuncionarios) {
            modelo.setColumnIdentifiers(new Object[]{"ID", "Usuário", "Nome"});
        } else if (tabela == tblJogadores) {
            modelo.setColumnIdentifiers(new Object[]{"ID", "Nome", "Data de Nascimento"});
        }

        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Funcionario && tabela == tblFuncionarios) {
                Funcionario mestre = (Funcionario) pessoa;
                modelo.addRow(new Object[]{mestre.getId(), mestre.getUsuario(), mestre.getNome()});
            } else if (pessoa instanceof Jogador && tabela == tblJogadores) {
                Jogador jogador = (Jogador) pessoa;
                modelo.addRow(new Object[]{jogador.getId(), jogador.getNome(), jogador.getDataDeNascimento()});
            }
        }

        tabela.setModel(modelo);
        tabela.getTableHeader().setReorderingAllowed(false);
    }
    private void pesquisarEAtualizar(javax.swing.JTable tabela, ArrayList<Pessoa> pessoas, String termoBusca) {
        ArrayList<Pessoa> resultados = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().toLowerCase().contains(termoBusca)) {
                resultados.add(pessoa);
            }
        }

        montarTabela(tabela, resultados);
    }
    private void excluirPessoa(javax.swing.JTable tabela, boolean removerPorUsuario) {
    DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
    int linhaSelecionada = tabela.getSelectedRow();

    if (linhaSelecionada != -1) {
        int id = (int) modelo.getValueAt(linhaSelecionada, 0);  // Obter o ID da pessoa a ser removida

        modelo.removeRow(linhaSelecionada);

        // Chame o método para remover a pessoa do arquivo aqui
        if (tabela == tblFuncionarios) {
            Funcionario.removerPessoaDoArquivo(String.valueOf(id), "src\\Save\\Funcionarios.txt", removerPorUsuario);
        } else if (tabela == tblJogadores) {
            Jogador.removerPessoaDoArquivo(String.valueOf(id), "src\\Save\\Jogadores.txt", removerPorUsuario);
        }

        // Limpe a seleção da tabela
        tabela.clearSelection();
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
        btnExcluir = new javax.swing.JButton();
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

        btnExcluir.setBackground(new java.awt.Color(30, 30, 30));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/32x32/trash.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir selecionado");
        btnExcluir.setBorder(null);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String termoBusca = txtfBusca.getText().toLowerCase();

    if (termoBusca.isEmpty()) {
        // Se o campo de busca estiver vazio, exibe ambas as tabelas normalmente
        montarTabelas();
    } else {
        // Se houver texto de busca, realiza a pesquisa
        pesquisarEAtualizar(tblFuncionarios, Funcionario.lerFuncionariosDoArquivo("src\\Save\\Funcionarios.txt"), termoBusca);
        pesquisarEAtualizar(tblJogadores, Jogador.lerJogadorDoArquivo("src\\Save\\Jogadores.txt"), termoBusca);
    }
    
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linhaSelecionada = tblFuncionarios.getSelectedRow();
        
        int linhaSelecionada2 = tblJogadores.getSelectedRow();
        
        if(linhaSelecionada != -1){
            InserirMestre telaFunc = new InserirMestre((Funcionario)pesquisa(tblFuncionarios.getValueAt(linhaSelecionada, 1).toString()));
            telaFunc.setVisible(true);
            telaFunc.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosed(java.awt.event.WindowEvent evento) {montarTabelas();}
        });  
        }
        else if(linhaSelecionada2 != -1){
            InserirJogador telaFunc = new InserirJogador((Jogador)pesquisa(tblJogadores.getValueAt(linhaSelecionada2, 1).toString()));
            telaFunc.setVisible(true);
            telaFunc.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosed(java.awt.event.WindowEvent evento) {montarTabelas();}
        });
        }
        else{
            JOptionPane.showMessageDialog(this, "Selecione uma linha de uma tabela.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirPessoa(tblFuncionarios, true);
        excluirPessoa(tblJogadores, false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAddJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJogadorActionPerformed
        InserirJogador tela = new InserirJogador();
        tela.setVisible(true);
        tela.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosed(java.awt.event.WindowEvent evento) {montarTabelas();}
        });
    }//GEN-LAST:event_btnAddJogadorActionPerformed

    private void btnAddMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMestreActionPerformed
        InserirMestre tela = new InserirMestre();
        tela.setVisible(true);
        tela.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosed(java.awt.event.WindowEvent evento) {montarTabelas();}
        });
    }//GEN-LAST:event_btnAddMestreActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if(InserirCampanha.FLAG == false){
            int linhaSelecionada = tblFuncionarios.getSelectedRow();
        
            int linhaSelecionada2 = tblJogadores.getSelectedRow();
        
            if(linhaSelecionada != -1){
                InserirPersonagem.donoSelecionado = pesquisa(tblFuncionarios.getValueAt(linhaSelecionada, 1).toString());
                dispose();
            }
            else if(linhaSelecionada2 != -1){
                InserirPersonagem.donoSelecionado = pesquisa(tblJogadores.getValueAt(linhaSelecionada2, 1).toString());
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Selecione uma linha de uma tabela.");
            }
        }
        else{
            int linhaSelecionada = tblFuncionarios.getSelectedRow();
        
            int linhaSelecionada2 = tblJogadores.getSelectedRow();
        
            if(linhaSelecionada != -1){
                InserirCampanha.nome = tblFuncionarios.getValueAt(linhaSelecionada, 2).toString();
                InserirCampanha.FLAG = false;
                dispose();
            }
            else if(linhaSelecionada2 != -1){
                JOptionPane.showMessageDialog(this, "Selecione uma linha da tabela de mestres.");
                
                tblJogadores.clearSelection();
            }
            else{
                JOptionPane.showMessageDialog(this, "Selecione uma linha de uma tabela.");
            }
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void txtfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfBuscaActionPerformed
       
    }//GEN-LAST:event_txtfBuscaActionPerformed
    private Pessoa pesquisa(String nome) { // Usada para pesquisar o personagem por nome, para edição e inserir na cena
        ArrayList<Pessoa> mestres = Funcionario.lerFuncionariosDoArquivo("src\\Save\\Funcionarios.txt");
        ArrayList<Pessoa> jogadores = Jogador.lerJogadorDoArquivo("src\\Save\\Jogadores.txt");

        for (int i = 0; i < (mestres.size() + jogadores.size()); i++) {
            if(i < mestres.size() && mestres.get(i) instanceof Funcionario){
                if(((Funcionario)mestres.get(i)).getUsuario().equals(nome)){
                    return mestres.get(i);
                }
            }
            else if(i >= mestres.size() && jogadores.get(i - mestres.size()) instanceof Jogador){
                if(((Jogador)jogadores.get(i - mestres.size())).getNome().equals(nome)){
                    return jogadores.get(i - mestres.size());               
                }
}
        }

        return null;
    }
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
    private javax.swing.JButton btnExcluir;
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
