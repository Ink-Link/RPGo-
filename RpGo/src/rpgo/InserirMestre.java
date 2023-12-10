package rpgo;

import ClassesRpGo.Funcionario;
import ClassesRpGo.Pessoa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class InserirMestre extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public InserirMestre(){
        initComponents();
        Funcionario.lerFuncionariosDoArquivo("src\\Save\\Funcionarios.txt");
        txtfIdMestre.setText(Integer.toString(Pessoa.ID));
        txtfUsuario.setForeground(new java.awt.Color(169, 169, 169));
        txtfUsuario.setText("Usuário");
        txtfUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (txtfUsuario.getText().equals("Usuário")) {
                txtfUsuario.setText("");
                txtfUsuario.setForeground(new java.awt.Color(255, 255, 255));
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (txtfUsuario.getText().isEmpty()) {
                txtfUsuario.setForeground(new java.awt.Color(169, 169, 169));
                txtfUsuario.setText("Usuário");
            }
        }
        });
        txtfNomeFuncionario.setForeground(new java.awt.Color(169, 169, 169));
        txtfNomeFuncionario.setText("Nome");
        txtfNomeFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (txtfNomeFuncionario.getText().equals("Nome")) {
                txtfNomeFuncionario.setText("");
                txtfNomeFuncionario.setForeground(new java.awt.Color(255, 255, 255));
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (txtfNomeFuncionario.getText().isEmpty()) {
                txtfNomeFuncionario.setForeground(new java.awt.Color(169, 169, 169));
                txtfNomeFuncionario.setText("Nome");
            }
        }
        });
        txtfSenha.setForeground(new java.awt.Color(169, 169, 169));
        txtfSenha.setText("********");
        txtfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (txtfSenha.getText().equals("********")) {
                txtfSenha.setText("");
                txtfSenha.setForeground(new java.awt.Color(255, 255, 255));
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (txtfSenha.getText().isEmpty()) {
                txtfSenha.setForeground(new java.awt.Color(169, 169, 169));
                txtfSenha.setText("********");
            }
        }
        });


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

        txtfNomeFuncionario = new javax.swing.JTextField();
        txtfUsuario = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDataFuncionario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblRegistroFuncionario = new javax.swing.JLabel();
        txtfIdMestre = new javax.swing.JTextField();
        txtfSenha = new javax.swing.JPasswordField();
        txtfDataFuncionario = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo funcionário");

        txtfNomeFuncionario.setBackground(new java.awt.Color(40, 40, 40));
        txtfNomeFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        txtfNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNomeFuncionarioActionPerformed(evt);
            }
        });

        txtfUsuario.setBackground(new java.awt.Color(40, 40, 40));
        txtfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfUsuarioActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(86, 86, 86));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        lblDataFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblDataFuncionario.setText("Data de Nascimento");

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário");

        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        lblRegistroFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRegistroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistroFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistroFuncionario.setText("Cadastro de Mestre");

        txtfIdMestre.setBackground(new java.awt.Color(40, 40, 40));
        txtfIdMestre.setForeground(new java.awt.Color(40, 40, 40));
        txtfIdMestre.setCaretColor(new java.awt.Color(40, 40, 40));
        txtfIdMestre.setDisabledTextColor(new java.awt.Color(40, 40, 40));
        txtfIdMestre.setEnabled(false);
        txtfIdMestre.setSelectedTextColor(new java.awt.Color(40, 40, 40));
        txtfIdMestre.setSelectionColor(new java.awt.Color(40, 40, 40));
        txtfIdMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIdMestreActionPerformed(evt);
            }
        });

        txtfSenha.setBackground(new java.awt.Color(40, 40, 40));
        txtfSenha.setColumns(10);
        txtfSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfSenhaActionPerformed(evt);
            }
        });

        txtfDataFuncionario.setBackground(new java.awt.Color(40, 40, 40));
        txtfDataFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtfDataFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/ ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfDataFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfDataFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistroFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(170, 170, 170)
                                .addComponent(lblId))
                            .addComponent(txtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataFuncionario)
                                    .addComponent(txtfDataFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(165, 165, 165)
                                .addComponent(btnSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtfIdMestre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblRegistroFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfIdMestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDataFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(txtfDataFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNomeFuncionarioActionPerformed

    private void txtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfUsuarioActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean flag = true;
// Obtendo os dados da interface gráfica
    String nome = txtfNomeFuncionario.getText();
    String usuario = txtfUsuario.getText();
    String senha = txtfSenha.getText();
    String dataDeNascimento = txtfDataFuncionario.getText();

    // Criando uma instância de Funcionario
    Funcionario novoFuncionario = new Funcionario(Pessoa.ID, nome, dataDeNascimento, usuario, senha);
    Pessoa.ID += 1;
    // Verificando se o funcionário já existe
    if(txtfNomeFuncionario.getText().equals("Nome")){
        JOptionPane.showMessageDialog(this, "Escreva algo no campo Nome");
        
        flag = false;
    }
    if(txtfUsuario.getText().equals("Usuário")){
        JOptionPane.showMessageDialog(this, "Escreva algo no campo Usuário");  
        
        flag = false;
    }
    if(txtfSenha.getText().equals("********")){
        JOptionPane.showMessageDialog(this, "Escreva algo no campo de Senha");
        
        flag = false;
    }
    if(!checkIfExists(novoFuncionario)) {
        if(flag == true){
        saveToFile(novoFuncionario);
        
        dispose();
        }
    }
    else{
        // Exibir mensagem de que o funcionário já existe
        JOptionPane.showMessageDialog(this, "Funcionário já existe!");
        
        dispose();
    }    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtfIdMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIdMestreActionPerformed
        
    }//GEN-LAST:event_txtfIdMestreActionPerformed

    private void txtfDataFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfDataFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDataFuncionarioActionPerformed

    private void txtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(InserirMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirMestre().setVisible(true);
            }
        });
    }                                         

    private void saveToFile(Funcionario funcionario) {
        // Caminho do arquivo
        String fileName = "src\\Save\\Funcionarios.txt";

        // Convertendo Funcionario para string e salvando no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(funcionario.toFileString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean checkIfExists(Funcionario funcionario) {
        // Caminho do arquivo
        String fileName = "src\\Save\\Funcionarios.txt";

        // Verificando se o funcionário já existe no arquivo
        try {
            Path path = Paths.get(fileName);
            if (Files.exists(path)) {
                return Files.lines(path).anyMatch(line -> line.contains(funcionario.getUsuario()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDataFuncionario;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblRegistroFuncionario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JFormattedTextField txtfDataFuncionario;
    private javax.swing.JTextField txtfIdMestre;
    private javax.swing.JTextField txtfNomeFuncionario;
    private javax.swing.JPasswordField txtfSenha;
    private javax.swing.JTextField txtfUsuario;
    // End of variables declaration//GEN-END:variables
}
