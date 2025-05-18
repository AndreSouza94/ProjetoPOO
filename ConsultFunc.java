
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Andre Souza
 */
//André Faria de Souza  RA: 2101106
public class ConsultFunc extends javax.swing.JFrame {

    /**
     * Creates new form RemoveFunc
     */
    public ConsultFunc() {
        initComponents();
    }

     public static ConsultFunc getConsultFunc() {
    return BDPizz.getInstance().getConsultFunc();
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rbAtendente = new javax.swing.JRadioButton();
        rbEntregador = new javax.swing.JRadioButton();
        rbCozinheiro = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Funcionario");

        jLabel1.setText("Nome:");

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        rbAtendente.setText("Atendente");
        rbAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAtendenteActionPerformed(evt);
            }
        });

        rbEntregador.setText("Entregador");
        rbEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEntregadorActionPerformed(evt);
            }
        });

        rbCozinheiro.setText("Cozinheiro");
        rbCozinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCozinheiroActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbCozinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 302, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(rbAtendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEntregador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCozinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed

    private void rbAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAtendenteActionPerformed
         rbAtendente.setSelected(true);
         rbEntregador.setSelected(false);
         rbCozinheiro.setSelected(false);
    }//GEN-LAST:event_rbAtendenteActionPerformed

    private void rbEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEntregadorActionPerformed
         rbEntregador.setSelected(true);
         rbAtendente.setSelected(false);
         rbCozinheiro.setSelected(false);
    }//GEN-LAST:event_rbEntregadorActionPerformed

    private void rbCozinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCozinheiroActionPerformed
         rbCozinheiro.setSelected(true);
         rbAtendente.setSelected(false);
         rbEntregador.setSelected(false);

    }//GEN-LAST:event_rbCozinheiroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            remover();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    editar();
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Obtém a instância de Principal armazenada em BDPizz e exibe a tela
    BDPizz.getInstance().getPrincipal().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

   public void buscar() {
    try {
        String nome = Nome.getText().trim();
        boolean encontrado = false;
 
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome para buscar.", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }
 
        // Verifica se a caixa de "Atendente" está marcada
         if (rbAtendente.isSelected()) {
            Atendente atd = BDPizz.getInstance().consultaAtendente(nome);
            if (atd != null) {
                atd.exibirDados();
                encontrado = true;
            }
        }
 
        // Verifica se a caixa de "Entregador" está marcada
        if (rbEntregador.isSelected()) {
            Entregador entreg = BDPizz.getInstance().consultaEntregador(nome);
            if (entreg != null) {
                entreg.exibirDados();
                encontrado = true;
            }
        }
 
        // Verifica se a caixa de "Cozinheiro" está marcada
        if (rbCozinheiro.isSelected()) {
            Cozinheiro coz = BDPizz.getInstance().consultaCozinheiro(nome);
            if (coz != null) {
                coz.exibirDados();
                encontrado = true;
            }
        }
 
        // Exibe mensagem se nenhum funcionário foi encontrado
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário encontrado com o nome fornecido.", "Busca", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
   
   public void editar() {
       // Obtém a instância única do banco de dados
    BDPizz bd = BDPizz.getInstance();
    
    if (rbAtendente.isSelected()) {
        Atendente atendente = BDPizz.getInstance().consultaAtendente(Nome.getText().trim()); // Busca o atendente pelo nome
        if (atendente != null) {
        BDPizz.getInstance().getEditAtendente(atendente).setVisible(true); // Abre a tela de edição
        } else {
            JOptionPane.showMessageDialog(null, "Atendente não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else if (rbEntregador.isSelected()) {
        Entregador entregador = BDPizz.getInstance().consultaEntregador(Nome.getText().trim()); // Busca o entregador pelo nome
        if (entregador != null) {
             BDPizz.getInstance().getEditEntregador(entregador).setVisible(true); // Abre a tela de edição
        } else {
            JOptionPane.showMessageDialog(null, "Entregador não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else if (rbCozinheiro.isSelected()) {
        Cozinheiro cozinheiro = BDPizz.getInstance().consultaCozinheiro(Nome.getText().trim()); // Busca o cozinheiro pelo nome
        if (cozinheiro != null) {
              BDPizz.getInstance().getEditCozinheiro(cozinheiro).setVisible(true); // Abre a tela de edição
        } else {
            JOptionPane.showMessageDialog(null, "Cozinheiro não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecione um cargo para editar.", "Erro", JOptionPane.WARNING_MESSAGE);
    }
}
   
    public void remover() {
    try {
        String nome = Nome.getText().trim();
        boolean encontrado = false;
        boolean remov = false;

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um nome para buscar.", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Verifica se a caixa de "Atendente" está marcada
        if (rbAtendente.isSelected()) {
            Atendente atd = BDPizz.getInstance().consultaAtendente(nome);
            if (atd != null) {
                remov = BDPizz.getInstance().removerAtendente(nome);
                encontrado = true;
                if (remov) {
                    JOptionPane.showMessageDialog(null, "Atendente removido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        // Verifica se a caixa de "Entregador" está marcada
        if (rbEntregador.isSelected()) {
            Entregador entreg = BDPizz.getInstance().consultaEntregador(nome);
            if (entreg != null) {
                remov = BDPizz.getInstance().removerEntregador(nome);
                encontrado = true;
                if (remov) {
                    JOptionPane.showMessageDialog(null, "Entregador removido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        // Verifica se a caixa de "Cozinheiro" está marcada
        if (rbCozinheiro.isSelected()) {
            Cozinheiro coz = BDPizz.getInstance().consultaCozinheiro(nome);
            if (coz != null) {
                remov = BDPizz.getInstance().removerCozinheiro(nome); // CORRIGIDO
                encontrado = true;
                if (remov) {
                    JOptionPane.showMessageDialog(null, "Cozinheiro removido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        // Exibe mensagem se nenhum funcionário foi encontrado
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Nenhum funcionário encontrado com o nome fornecido.", "Busca", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(ConsultFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultFunc.getConsultFunc().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nome;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rbAtendente;
    private javax.swing.JRadioButton rbCozinheiro;
    private javax.swing.JRadioButton rbEntregador;
    // End of variables declaration//GEN-END:variables
}
