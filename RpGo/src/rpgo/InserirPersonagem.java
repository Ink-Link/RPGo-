package rpgo;
import ClassesRpGo.Arquivar;
import ClassesRpGo.Pessoa;
import ClassesRpGo.Personagem;
import ClassesRpGo.Vilao;
import ClassesRpGo.Stand;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class InserirPersonagem extends javax.swing.JFrame {
    
    public static Pessoa donoSelecionado = null;
    Personagem personagemEditado;
    boolean editando;
    
    /**
     * Creates new form InserirPersonagem
     */
    public InserirPersonagem() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(30, 30, 30));
        setLocationRelativeTo(null);
        
        editando = false;
    }
    
    public InserirPersonagem(Personagem personagemSelecionado) { // Serve para preparar a tela de Criação de Personagem para edição
        initComponents();
        getContentPane().setBackground(new java.awt.Color(30, 30, 30));
        setLocationRelativeTo(null);
        editando = true;
        this.personagemEditado = personagemSelecionado;
        
        // Preenche os atributos do personagem
        txtfNomePersonagem.setText(personagemSelecionado.getNome());
        spnrCorpo.setValue(personagemSelecionado.getCorpo());
        spnrMente.setValue(personagemSelecionado.getMente());
        spnrCoragem.setValue(personagemSelecionado.getCoragem());
        
        // Preenche os atributos do stand
        txtfNomeStand.setText(personagemSelecionado.getStand().getNome());
        spnrPoder.setValue(personagemSelecionado.getStand().getPwr());
        spnrVelocidade.setValue(personagemSelecionado.getStand().getSpd());
        spnrDurabilidade.setValue(personagemSelecionado.getStand().getDur());
        spnrPrecisao.setValue(personagemSelecionado.getStand().getPre());
        
        // Verifica se é vilão ou não
        if (personagemSelecionado instanceof Vilao) {
            ckboxVilao.setSelected(true);
        }
        
        // Define o dono
        this.donoSelecionado = personagemSelecionado.getDono();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        txtfNomePersonagem = new javax.swing.JTextField();
        txtfNomeStand = new javax.swing.JTextField();
        lblCorpo = new javax.swing.JLabel();
        lblMente = new javax.swing.JLabel();
        lblCoragem = new javax.swing.JLabel();
        lblPoder = new javax.swing.JLabel();
        lblDurabilidade = new javax.swing.JLabel();
        lblPrecisao = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblVelocidade = new javax.swing.JLabel();
        lblCriacaoPersonagem = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblStand = new javax.swing.JLabel();
        spnrCorpo = new javax.swing.JSpinner();
        spnrMente = new javax.swing.JSpinner();
        spnrCoragem = new javax.swing.JSpinner();
        spnrPoder = new javax.swing.JSpinner();
        spnrVelocidade = new javax.swing.JSpinner();
        spnrDurabilidade = new javax.swing.JSpinner();
        spnrPrecisao = new javax.swing.JSpinner();
        ckboxVilao = new javax.swing.JCheckBox();
        btnSelecionarDono = new javax.swing.JButton();
        txtfNomeDono = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Personagem");

        txtfNomePersonagem.setBackground(new java.awt.Color(40, 40, 40));
        txtfNomePersonagem.setForeground(new java.awt.Color(255, 255, 255));
        txtfNomePersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNomePersonagemActionPerformed(evt);
            }
        });

        txtfNomeStand.setBackground(new java.awt.Color(40, 40, 40));
        txtfNomeStand.setForeground(new java.awt.Color(255, 255, 255));

        lblCorpo.setForeground(new java.awt.Color(242, 242, 242));
        lblCorpo.setText("Corpo");

        lblMente.setForeground(new java.awt.Color(242, 242, 242));
        lblMente.setText("Mente");

        lblCoragem.setForeground(new java.awt.Color(242, 242, 242));
        lblCoragem.setText("Coragem");

        lblPoder.setForeground(new java.awt.Color(242, 242, 242));
        lblPoder.setText("Poder");

        lblDurabilidade.setForeground(new java.awt.Color(242, 242, 242));
        lblDurabilidade.setText("Durabilidade");

        lblPrecisao.setForeground(new java.awt.Color(242, 242, 242));
        lblPrecisao.setText("Precisão");

        btnSalvar.setBackground(new java.awt.Color(86, 86, 86));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblVelocidade.setForeground(new java.awt.Color(242, 242, 242));
        lblVelocidade.setText("Velocidade");

        lblCriacaoPersonagem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCriacaoPersonagem.setForeground(new java.awt.Color(242, 242, 242));
        lblCriacaoPersonagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCriacaoPersonagem.setText("Criação de Personagem");

        lblNome.setForeground(new java.awt.Color(242, 242, 242));
        lblNome.setText("Nome");

        lblStand.setForeground(new java.awt.Color(242, 242, 242));
        lblStand.setText("Stand");

        spnrCorpo.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        spnrMente.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        spnrCoragem.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        spnrPoder.setModel(new javax.swing.SpinnerListModel(new String[] {"E", "D", "C", "B", "A"}));

        spnrVelocidade.setModel(new javax.swing.SpinnerListModel(new String[] {"E", "D", "C", "B", "A"}));

        spnrDurabilidade.setModel(new javax.swing.SpinnerListModel(new String[] {"E", "D", "C", "B", "A"}));

        spnrPrecisao.setModel(new javax.swing.SpinnerListModel(new String[] {"E", "D", "C", "B", "A"}));

        ckboxVilao.setForeground(new java.awt.Color(255, 255, 255));
        ckboxVilao.setText("Vilão");

        btnSelecionarDono.setBackground(new java.awt.Color(86, 86, 86));
        btnSelecionarDono.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarDono.setText("Selecionar Dono");
        btnSelecionarDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarDonoActionPerformed(evt);
            }
        });

        txtfNomeDono.setBackground(new java.awt.Color(40, 40, 40));
        txtfNomeDono.setForeground(new java.awt.Color(189, 189, 189));
        txtfNomeDono.setText("Nenhum dono");
        txtfNomeDono.setEnabled(false);
        txtfNomeDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfNomeDonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCriacaoPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtfNomePersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStand)
                                    .addComponent(txtfNomeStand, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSelecionarDono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalvar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCoragem)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                .addComponent(spnrCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblMente)
                                                    .addComponent(lblCorpo))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(spnrCorpo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(spnrMente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(32, 32, 32))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ckboxVilao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPrecisao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spnrPrecisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPoder)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spnrPoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDurabilidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(spnrDurabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblVelocidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spnrVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCriacaoPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblStand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfNomePersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfNomeStand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCorpo)
                        .addComponent(lblPoder)
                        .addComponent(spnrPoder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnrCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVelocidade)
                    .addComponent(spnrVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrMente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMente))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDurabilidade)
                    .addComponent(spnrDurabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrCoragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoragem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnrPrecisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecisao)
                    .addComponent(ckboxVilao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnSelecionarDono))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfNomePersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNomePersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNomePersonagemActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        boolean eVilao = ckboxVilao.isSelected(); 
        
        String nomeInformado = txtfNomePersonagem.getText();
        int corpo = (Integer) spnrCorpo.getValue();
        int mente = (Integer) spnrMente.getValue();
        int coragem = (Integer) spnrCoragem.getValue();

        String nomeStand = txtfNomeStand.getText();
        String poder = (String) spnrPoder.getValue();
        String velocidade = (String) spnrVelocidade.getValue();
        String durabilidade = (String) spnrDurabilidade.getValue();
        String precisao = (String) spnrPrecisao.getValue();
        
        // Verifica se algum dos campos foi deixado em branco
        if(nomeInformado.equals("") || nomeStand.equals("") || this.donoSelecionado == null){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }
        else if(Arquivar.checkIfExists(nomeInformado, "src\\Save\\Personagens.txt") ||
                Arquivar.checkIfExists(nomeStand, "src\\Save\\Personagens.txt")){
            JOptionPane.showMessageDialog(this, "O nome passado já existe!");    
        }
        else if (!editando) { // Caso não estiver editando, cria um novo personagem
            // Verifica se 'Vilão?' foi marcado para criar o personagem com a classe certa
            if (eVilao) {            
                Stand novoStand = new Stand(nomeStand, 
                                            poder, 
                                            velocidade, 
                                            durabilidade, 
                                            precisao);

                Vilao novoVilao = new Vilao(nomeInformado, 
                                            corpo, 
                                            mente, 
                                            coragem, 
                                            novoStand,
                                            this.donoSelecionado);

                Vilao.listaViloes.add(novoVilao);
                Arquivar.salvarNoArquivo(novoVilao.toFileString(), "src\\Save\\Personagens.txt");
            } 
            else {
                Stand novoStand = new Stand(nomeStand, 
                                            poder, 
                                            velocidade, 
                                            durabilidade, 
                                            precisao);

                Personagem novoPersonagem = new Personagem(nomeInformado, 
                                                           corpo, 
                                                           mente, 
                                                           coragem, 
                                                           novoStand,
                                                           this.donoSelecionado);

                Personagem.listaPersonagens.add(novoPersonagem);
                Arquivar.salvarNoArquivo(novoPersonagem.toFileString(), "src\\Save\\Personagens.txt");
            }
        }
        else { //Caso esteja editando, sobrescreve os dados do personagem existente
            if (eVilao) {            
                Stand novoStand = new Stand(nomeStand, 
                                            poder, 
                                            velocidade, 
                                            durabilidade, 
                                            precisao);

                this.personagemEditado.setNome(nomeInformado); 
                this.personagemEditado.setCorpo(corpo); 
                this.personagemEditado.setMente(mente);
                this.personagemEditado.setCoragem(coragem);
                this.personagemEditado.setStand(novoStand);
                this.personagemEditado.setDono(this.donoSelecionado);
            } 
            else {
               Stand novoStand = new Stand(nomeStand, 
                                            poder, 
                                            velocidade, 
                                            durabilidade, 
                                            precisao);

                this.personagemEditado.setNome(nomeInformado); 
                this.personagemEditado.setCorpo(corpo); 
                this.personagemEditado.setMente(mente);
                this.personagemEditado.setCoragem(coragem);
                this.personagemEditado.setStand(novoStand);
                this.personagemEditado.setDono(this.donoSelecionado);
            }
        }
        
        dispose();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSelecionarDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarDonoActionPerformed
        boolean eVilao = ckboxVilao.isSelected();
        if(eVilao){
            InserirCampanha.FLAG = true;
        }
        TelaRegistros telaSelecao = new TelaRegistros();
        telaSelecao.setVisible(true);
        telaSelecao.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosed(java.awt.event.WindowEvent evento) {txtfNomeDono.setText(donoSelecionado.getNome());}
        });
        
        
        
    }//GEN-LAST:event_btnSelecionarDonoActionPerformed

    private void txtfNomeDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfNomeDonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfNomeDonoActionPerformed

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
            java.util.logging.Logger.getLogger(InserirPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirPersonagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirPersonagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSelecionarDono;
    private javax.swing.JCheckBox ckboxVilao;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblCoragem;
    private javax.swing.JLabel lblCorpo;
    private javax.swing.JLabel lblCriacaoPersonagem;
    private javax.swing.JLabel lblDurabilidade;
    private javax.swing.JLabel lblMente;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPoder;
    private javax.swing.JLabel lblPrecisao;
    private javax.swing.JLabel lblStand;
    private javax.swing.JLabel lblVelocidade;
    private javax.swing.JSpinner spnrCoragem;
    private javax.swing.JSpinner spnrCorpo;
    private javax.swing.JSpinner spnrDurabilidade;
    private javax.swing.JSpinner spnrMente;
    private javax.swing.JSpinner spnrPoder;
    private javax.swing.JSpinner spnrPrecisao;
    private javax.swing.JSpinner spnrVelocidade;
    private javax.swing.JTextField txtfNomeDono;
    private javax.swing.JTextField txtfNomePersonagem;
    private javax.swing.JTextField txtfNomeStand;
    // End of variables declaration//GEN-END:variables
}
