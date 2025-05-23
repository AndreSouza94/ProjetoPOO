
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Andre Souza
 */
//André Faria de Souza  RA: 2101106
public class CadFunc extends javax.swing.JFrame {
     
    
    /**
     * Creates new form CadFunc
     */
    public CadFunc() {
        initComponents();
    }

     public static CadFunc getCadFunc() {
    return BDPizz.getInstance().getCadFunc();
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCargo = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        ctTelefone = new javax.swing.JTextField();
        RBatendente = new javax.swing.JRadioButton();
        RBentregador = new javax.swing.JRadioButton();
        RBcozinheiro = new javax.swing.JRadioButton();
        btLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ctTurno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ctSetor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ctVeiculo = new javax.swing.JTextField();
        ctHabilit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctEspeci = new javax.swing.JTextField();
        ctExp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Funcionario");

        lbCargo.setText("Selecione o Cargo do Funcionario");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lbNome.setText("NOME:");

        lbTelefone.setText("TELEFONE:");

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

        RBatendente.setText("Atendente");
        RBatendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBatendenteActionPerformed(evt);
            }
        });

        RBentregador.setText("Entregador");
        RBentregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBentregadorActionPerformed(evt);
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

        jLabel1.setText("Turno:");

        ctTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTurnoActionPerformed(evt);
            }
        });

        jLabel2.setText("Setor:");

        ctSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSetorActionPerformed(evt);
            }
        });

        jLabel3.setText("Veiculo:");

        jLabel4.setText("Tipo da Habilitação:");

        ctVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctVeiculoActionPerformed(evt);
            }
        });

        ctHabilit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctHabilitActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBatendente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(RBentregador, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RBcozinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctEspeci))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctExp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctHabilit, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ctVeiculo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ctSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lbNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(201, 202, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrar)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(ctTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(lbCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBatendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ctTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ctSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btnCadastrar)
                            .addComponent(jButton1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBentregador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ctVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ctHabilit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(RBcozinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ctEspeci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ctExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(57, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ctTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTelefoneActionPerformed
        
    }//GEN-LAST:event_ctTelefoneActionPerformed

    private void RBatendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBatendenteActionPerformed
        RBatendente.setSelected(true);
        RBentregador.setSelected(false);
        RBcozinheiro.setSelected(false);
    }//GEN-LAST:event_RBatendenteActionPerformed

    private void RBentregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBentregadorActionPerformed
        RBentregador.setSelected(true);
        RBatendente.setSelected(false);
        RBcozinheiro.setSelected(false);
    }//GEN-LAST:event_RBentregadorActionPerformed

    private void RBcozinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBcozinheiroActionPerformed
        RBcozinheiro.setSelected(true);
        RBatendente.setSelected(false);
        RBentregador.setSelected(false);
    }//GEN-LAST:event_RBcozinheiroActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void ctNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNomeActionPerformed
        
    }//GEN-LAST:event_ctNomeActionPerformed

    private void ctTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTurnoActionPerformed
       
    }//GEN-LAST:event_ctTurnoActionPerformed

    private void ctHabilitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctHabilitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctHabilitActionPerformed

    private void ctExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctExpActionPerformed

    private void ctSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSetorActionPerformed
        
    }//GEN-LAST:event_ctSetorActionPerformed

    private void ctVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctVeiculoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    // Obtém a instância de Principal armazenada em BDPizz e exibe a tela
    BDPizz.getInstance().getPrincipal().setVisible(true);
    this.dispose();
    
    
    
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void cadastrar() {
   try {
       //Verificando qual radio button foi selecionado
       String nome = ctNome.getText().trim();
       
       //Verificar se o nome já existe nas listas de atendente, entregador ou cozinheiro
       if (BDPizz.getInstance().consultaAtendente(nome) != null || 
           BDPizz.getInstance().consultaEntregador(nome) != null || 
           BDPizz.getInstance().consultaCozinheiro(nome) != null) {
    
    throw new NomeIgualException("Já existe um funcionário com esse nome: " + nome);
}
                   
    // Verifica o formato do telefone (exemplo simples: deve ter 10 ou 11 dígitos)
    String telefone = ctTelefone.getText().trim();
    if (!telefone.matches("\\d{10,11}")) {
        throw new TelefoneInvalidoException("O telefone deve conter 10 ou 11 dígitos.");
    }

    // Verificando qual radio button foi selecionado
    if (RBatendente.isSelected()) {
        //String nome = ctNome.getText();
        telefone = ctTelefone.getText();
        String turno = ctTurno.getText();
        String setor = ctSetor.getText();

        // Criando o objeto Atendente com as variáveis
        Atendente atendente = new Atendente();
        atendente.setNome(nome);
        atendente.setTurno(turno);
        atendente.setSetor(setor);
        atendente.setTelefone(telefone);
        BDPizz.getInstance().adicionarAtendente(atendente);  // Corrigido, removeu o `;` extra

        JOptionPane.showMessageDialog(null, "Atendente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        limpar();
    }

    if (RBentregador.isSelected()) {
        //String nome = ctNome.getText();
        telefone = ctTelefone.getText();
        String veiculo = ctVeiculo.getText();
        String tipoHabilit = ctHabilit.getText();

        Entregador entregador = new Entregador();
        entregador.setNome(nome);
        entregador.setTelefone(telefone);
        entregador.setVeiculo(veiculo);
        entregador.setTipohabilit(tipoHabilit);
        BDPizz.getInstance().adicionarEntregador(entregador);
        JOptionPane.showMessageDialog(null, "Entregador cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    if (RBcozinheiro.isSelected()) {
        //String nome = ctNome.getText();
        telefone = ctTelefone.getText();
        String especialidade = ctEspeci.getText();
        int experiencia = Integer.parseInt(ctExp.getText()); // Pode lançar NumberFormatException

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.setNome(nome);
        cozinheiro.setTelefone(telefone);
        cozinheiro.setEspecialidade(especialidade);
        cozinheiro.setExperiencia(experiencia);
        BDPizz.getInstance().adicionarCozinheiro(cozinheiro);
        JOptionPane.showMessageDialog(null, "Cozinheiro cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
} catch (NomeIgualException e){
    //Captura a exceção nome duplicado
    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
} catch (NumberFormatException e) {
    // Captura exceções de formato de número
    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido para a experiência.", "Erro", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    // Captura qualquer outra exceção
    JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
}
    }
    
  
    
public void limpar() {
    ctNome.setText("");
    ctTelefone.setText("");
    ctTurno.setText("");
    ctSetor.setText("");
    ctVeiculo.setText("");
    ctHabilit.setText("");
    ctEspeci.setText("");
    ctExp.setText("");
    ctNome.requestFocus();
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
                CadFunc.getCadFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBatendente;
    private javax.swing.JRadioButton RBcozinheiro;
    private javax.swing.JRadioButton RBentregador;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField ctEspeci;
    private javax.swing.JTextField ctExp;
    private javax.swing.JTextField ctHabilit;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctSetor;
    private javax.swing.JTextField ctTelefone;
    private javax.swing.JTextField ctTurno;
    private javax.swing.JTextField ctVeiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTelefone;
    // End of variables declaration//GEN-END:variables
}
