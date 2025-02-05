
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Andre Souza
 */
public class EditCozinheiro extends javax.swing.JFrame {
     private Cozinheiro cozinheiro;   
    /**
     * Creates new form CadFunc
     */
    public EditCozinheiro(Cozinheiro coz) {
        this.cozinheiro = coz;
        initComponents();
        preencherCampos();
        
         // Preenche os campos com os dados do cozinheiro
        ctNome.setText(cozinheiro.getNome());
        ctTelefone.setText(cozinheiro.getTelefone());
        ctEspeci.setText(cozinheiro.getEspecialidade());
        ctExp.setText(String.valueOf(cozinheiro.getExperiencia()));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCargo = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        lbSub = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        ctTelefone = new javax.swing.JTextField();
        RBcozinheiro = new javax.swing.JRadioButton();
        btLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctEspeci = new javax.swing.JTextField();
        ctExp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbCargo.setText("Selecione o Cargo do Funcionario");

        btnCadastrar.setText("Editar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lbNome.setText("NOME:");

        lbTelefone.setText("TELEFONE:");

        lbSub.setText("EDITAR FUNCIONARIO");

        ctNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNomeActionPerformed(evt);
            }
        });

        ctTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTelefoneActionPerformed(evt);
            }
        });

        RBcozinheiro.setText("Cozinheiro");
        RBcozinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBcozinheiroActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jLabel5.setText("Especialidade:");

        jLabel6.setText("Experiencia (Anos):");

        ctExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctExpActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lbSub, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lbNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(201, 210, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrar)
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBcozinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctEspeci, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctExp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbSub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(ctTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lbCargo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btnCadastrar)
                            .addComponent(jButton1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBcozinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ctEspeci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ctExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ctTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTelefoneActionPerformed
        
    }//GEN-LAST:event_ctTelefoneActionPerformed

    private void RBcozinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBcozinheiroActionPerformed
      
       
    }//GEN-LAST:event_RBcozinheiroActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        editar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void ctNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNomeActionPerformed
        
    }//GEN-LAST:event_ctNomeActionPerformed

    private void ctExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctExpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new ConsultFunc().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void preencherCampos() {
    if (cozinheiro != null) {  
        // Verifica se os campos da interface não são nulos antes de preenchê-los
        if (ctNome != null && ctTelefone != null && ctEspeci != null && ctExp != null) {
            ctNome.setText(cozinheiro.getNome());
            ctTelefone.setText(cozinheiro.getTelefone());
            ctEspeci.setText(cozinheiro.getEspecialidade());
            ctExp.setText(String.valueOf(cozinheiro.getExperiencia()));
        }
    }
   }
    
    public void editar() {
     try {
        // Coleta os dados do formulário
        String nome = ctNome.getText().trim();
        String telefone = ctTelefone.getText().trim();
        String especialidade = ctEspeci.getText().trim();
        String experienciaStr = ctExp.getText().trim();

        // Valida se os campos estão preenchidos
        if (nome.isEmpty() || telefone.isEmpty() || especialidade.isEmpty() || experienciaStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Converte experiência para número inteiro
        int experiencia;
        try {
            experiencia = Integer.parseInt(experienciaStr);
            if (experiencia < 0) {
                JOptionPane.showMessageDialog(null, "A experiência não pode ser negativa!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido para a experiência.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se o objeto cozinheiro não é nulo
        if (cozinheiro == null) {
            JOptionPane.showMessageDialog(null, "Cozinheiro não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Atualiza os dados do cozinheiro
        cozinheiro.setNome(nome);
        cozinheiro.setTelefone(telefone);
        cozinheiro.setEspecialidade(especialidade);
        cozinheiro.setExperiencia(experiencia);

        // Atualiza no banco de dados
        BDPizz.getBDPizz().updateCozinheiro(cozinheiro);

        // Mensagem de sucesso
        JOptionPane.showMessageDialog(null, "Cozinheiro atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
          
    public void limpar(){
        ctNome.setText("");
        ctTelefone.setText("");
        ctEspeci.setText("");
        ctExp.setText("");
        ctNome.requestFocus();
    }
    
     private void voltar() {
        this.dispose();
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        editar();
    }
    
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limpar();
    }
    
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        voltar();
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
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBcozinheiro;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField ctEspeci;
    private javax.swing.JTextField ctExp;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSub;
    private javax.swing.JLabel lbTelefone;
    // End of variables declaration//GEN-END:variables
}
