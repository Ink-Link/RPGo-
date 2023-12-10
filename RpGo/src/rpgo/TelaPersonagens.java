/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rpgo;

import ClassesRpGo.Personagem;
import ClassesRpGo.Vilao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class TelaPersonagens extends javax.swing.JFrame {
    Personagem personagemSelecionado = null;
    
    /**
     * Creates new form TelaPersonagens
     */
    public TelaPersonagens() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(30, 30, 30));
        setLocationRelativeTo(null);
        montarTabela();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonagens = new javax.swing.JTable();
        lblJogadores = new javax.swing.JLabel();
        btnAddPersonagem = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtfBusca = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personagens da Campanha");

        tblPersonagens.setAutoCreateRowSorter(true);
        tblPersonagens.setBackground(new java.awt.Color(40, 40, 40));
        tblPersonagens.setForeground(new java.awt.Color(242, 242, 242));
        tblPersonagens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Stand", "Corpo", "Mente", "Coragem", "Jogador", "Vilão?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonagens.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblPersonagens.setAutoscrolls(false);
        tblPersonagens.setGridColor(new java.awt.Color(40, 40, 40));
        jScrollPane1.setViewportView(tblPersonagens);

        lblJogadores.setForeground(new java.awt.Color(255, 255, 255));
        lblJogadores.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJogadores.setText("Personagens");

        btnAddPersonagem.setBackground(new java.awt.Color(30, 30, 30));
        btnAddPersonagem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAddPersonagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/16x16/plus.png"))); // NOI18N
        btnAddPersonagem.setBorder(null);
        btnAddPersonagem.setContentAreaFilled(false);
        btnAddPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonagemActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(30, 30, 30));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/32x32/trash.png"))); // NOI18N
        btnExcluir.setBorder(null);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(30, 30, 30));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/32x32/pencil.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(30, 30, 30));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rpgo/Icones/Geral/32x32/search.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtfBusca.setBackground(new java.awt.Color(40, 40, 40));
        txtfBusca.setForeground(new java.awt.Color(255, 255, 255));
        txtfBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfBuscaActionPerformed(evt);
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtfBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addGap(37, 37, 37)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSelecionar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(lblJogadores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddPersonagem)))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelecionar)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJogadores, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddPersonagem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonagemActionPerformed
        // Cria a tela para selecionar o personagem a ser inserido
        InserirPersonagem telaInserir = new InserirPersonagem();
        telaInserir.setVisible(true);
        
        telaInserir.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosed(java.awt.event.WindowEvent evento) {montarTabela();}
        });
    }//GEN-LAST:event_btnAddPersonagemActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int indice = tblPersonagens.getSelectedRow();
        ArrayList<Personagem> personagens = Personagem.listaPersonagens;
        ArrayList<Vilao> viloes = Vilao.listaViloes;
        
        if(indice>-1) {
            Personagem personagemSelecionado = pesquisa(tblPersonagens.getValueAt(indice, 0).toString());
            personagens.remove(personagemSelecionado);
            viloes.remove(personagemSelecionado);
        }
        montarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Edita o personagem selecionado na tabela
        int indice = tblPersonagens.getSelectedRow();
        
        if(indice>-1) {
            InserirPersonagem telaInserir = new InserirPersonagem(pesquisa(tblPersonagens.getValueAt(indice, 0).toString()));
            telaInserir.setVisible(true);
            telaInserir.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override
                public void windowClosed(java.awt.event.WindowEvent evento) {
                    montarTabela();
                }
            });
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Faz a busca a partir do que estiver no campo de pesquisa
        montarTabela();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        // Manda os dados do Personagem selecionado para a TelaCombate
        int indice = tblPersonagens.getSelectedRow();
        if(indice>-1) {
            this.personagemSelecionado = pesquisa(tblPersonagens.getValueAt(indice, 0).toString());
            System.out.println(personagemSelecionado);
        }
        dispose();        
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void txtfBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfBuscaActionPerformed
    
    private Personagem pesquisa(String nome){ // Usada para pesquisar o personagem por nome, para edição e inserir na cena
        ArrayList<Personagem> personagens = Personagem.listaPersonagens;
        ArrayList<Vilao> viloes = Vilao.listaViloes;
        
        for (int i = 0; i<(personagens.size() + viloes.size()); i++){
            if (i < personagens.size() && personagens.get(i).getNome().equals(nome)) {
                return personagens.get(i); // Se o nome da linha selecionada pertencer a um pertonagem, retorna o objeto Personagem
            }
            else if (i >= personagens.size() && viloes.get(i - personagens.size()).getNome().equals(nome)){
                return viloes.get(i - personagens.size()); // Se pertencer a um vilão, retorna o objeto Vilao
            }
        }
        
        return null;
    }
    
    private void montarTabela() {
        ArrayList<Personagem> personagens = Personagem.listaPersonagens;
        ArrayList<Vilao> viloes = Vilao.listaViloes;


            if (txtfBusca.getText().equals("")){
                DefaultTableModel tabela = new DefaultTableModel(new Object[] {"Nome", "Stand", "Corpo", "Mente", "Coragem", "Jogador", "Vilão?"},0);
                for(int i = 0; i<(personagens.size() + viloes.size()); i++){
                    Object linha[];
                    if (i < personagens.size()) { // Printa os personagens primeiro
                        linha = new Object[]{
                            personagens.get(i).getNome(),
                            personagens.get(i).getStand().getNome(),
                            personagens.get(i).getCorpo(),
                            personagens.get(i).getMente(),
                            personagens.get(i).getCoragem(),
                            "Nenhum", // COLOCAR GET DO NOME DO DONO AQUI
                            "Não"};
                    }
                    else { //Ao terminar a lista de personagens, parte para os Vilões, se houver
                        linha = new Object[]{
                            viloes.get(i - personagens.size()).getNome(),
                            viloes.get(i - personagens.size()).getStand().getNome(),
                            viloes.get(i - personagens.size()).getCorpo(),
                            viloes.get(i - personagens.size()).getMente(),
                            viloes.get(i - personagens.size()).getCoragem(),
                            "Nenhum", // COLOCAR GET DO NOME DO DONO AQUI
                            "Sim"};
                    }
                tabela.addRow(linha);
                }
                tblPersonagens.setModel(tabela);    
            }
            else {
                DefaultTableModel tabela = new DefaultTableModel(new Object[] {"Nome", "Stand", "Corpo", "Mente", "Coragem", "Jogador", "Vilão?"},0);
                for(int i = 0; i<(personagens.size() + viloes.size()); i++){
                    Object linha[];
                    if (i < personagens.size() && txtfBusca.getText().equals(personagens.get(i).getNome())) { // Printa os personagens primeiro
                        linha = new Object[]{
                            personagens.get(i).getNome(),
                            personagens.get(i).getStand().getNome(),
                            personagens.get(i).getCorpo(),
                            personagens.get(i).getMente(),
                            personagens.get(i).getCoragem(),
                            "Nenhum", // COLOCAR GET DO NOME DO DONO AQUI
                            "Não"};
                        tabela.addRow(linha);
                    }
                    else if(i >= personagens.size() && txtfBusca.getText().equals(viloes.get(i - personagens.size()).getNome())){ //Ao terminar a lista de personagens, parte para os Vilões, se houver
                        linha = new Object[]{
                            viloes.get(i - personagens.size()).getNome(),
                            viloes.get(i - personagens.size()).getStand().getNome(),
                            viloes.get(i - personagens.size()).getCorpo(),
                            viloes.get(i - personagens.size()).getMente(),
                            viloes.get(i - personagens.size()).getCoragem(),
                            "Nenhum", // COLOCAR GET DO NOME DO DONO AQUI
                            "Sim"};
                        tabela.addRow(linha);
                    }
                }
                tblPersonagens.setModel(tabela);
            }
    }
    
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
            java.util.logging.Logger.getLogger(TelaPersonagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPersonagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPersonagens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPersonagem;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJogadores;
    private javax.swing.JTable tblPersonagens;
    private javax.swing.JTextField txtfBusca;
    // End of variables declaration//GEN-END:variables
}
