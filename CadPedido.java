import javax.swing.*;
import java.awt.*;
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
public class CadPedido extends javax.swing.JFrame {
    private JTextField nomeClienteField, enderecoField, telefoneField;
    private JSpinner quantidadePizzasSpinner;
    private JComboBox<String> tamanhoPizzaComboBox, saborComboBox, formaPagamentoComboBox;
    private JLabel valorTotalLabel;
    private JButton voltarButton, pedirButton, limparButton;
    /**
     * Creates new form CadPedido
     */
    public CadPedido() {
        pedido();
    }

    public static CadPedido getCadPedido() {
    return BDPizz.getInstance().getCadPedido();
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        QuantPizzSPN = new javax.swing.JSpinner();
        tamanho = new javax.swing.JComboBox<>();
        sabor = new javax.swing.JComboBox<>();
        valor = new javax.swing.JTextField();
        pag = new javax.swing.JComboBox<>();
        pedir = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedido do Cliente");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Nome do Cliente:");

        jLabel4.setText("FAZENDO PEDIDO");

        jLabel5.setText("Endereço de Entrega:");

        jLabel6.setText("Quantidade de Pizzas:");

        jLabel7.setText("Tamanho da Pizza:");

        jLabel8.setText("Sabor:");

        jLabel9.setText("Valor Total:");

        jLabel10.setText("Forma de Pagamento:");

        tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeno", "Medio", "Big" }));

        sabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "calabresa", "cinco queijos", "moda da casa", "alho e oleo", "frango catupiry", "carne seca" }));

        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        pag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Pix", "Cartão" }));

        pedir.setText("Pedir");
        pedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefone))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endereco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QuantPizzSPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 130, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pedir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(QuantPizzSPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedir)
                    .addComponent(voltar)
                    .addComponent(limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        BDPizz.getInstance().getPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        atualizarValorTotal();
    }//GEN-LAST:event_valorActionPerformed

    private void pedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirActionPerformed
        pedido();
    }//GEN-LAST:event_pedirActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        limpar();
    }//GEN-LAST:event_limparActionPerformed
    public void pedido() {
        setTitle("Pedido do Cliente");
        setSize(400, 300);
        setLayout(new GridLayout(10, 2));

        // Campos do formulário
        add(new JLabel("Nome do Cliente:"));
        nomeClienteField = new JTextField();
        add(nomeClienteField);

        add(new JLabel("Endereço de Entrega:"));
        enderecoField = new JTextField();
        add(enderecoField);

        add(new JLabel("Telefone:"));
        telefoneField = new JTextField();
        add(telefoneField);

        add(new JLabel("Quantidade de Pizzas:"));
        quantidadePizzasSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
        add(quantidadePizzasSpinner);

        add(new JLabel("Tamanho da Pizza:"));
        tamanhoPizzaComboBox = new JComboBox<>(new String[]{"Pequeno", "Médio", "Grande"});
        add(tamanhoPizzaComboBox);

        add(new JLabel("Sabor:"));
        saborComboBox = new JComboBox<>(new String[]{"Calabresa", "Margherita", "Quatro Queijos", "Portuguesa"});
        add(saborComboBox);

        add(new JLabel("Valor Total:"));
        valorTotalLabel = new JLabel("R$ 0,00");
        add(valorTotalLabel);

        add(new JLabel("Forma de Pagamento:"));
        formaPagamentoComboBox = new JComboBox<>(new String[]{"Dinheiro", "Cartão de Crédito", "Cartão de Débito"});
        add(formaPagamentoComboBox);

        // Botões
        voltarButton = new JButton("Voltar");
        voltarButton.addActionListener(e -> dispose()); // Fecha a janela atual
        add(voltarButton);

        pedirButton = new JButton("Pedir");
        pedirButton.addActionListener(e -> processarPedido());
        add(pedirButton);
        
        limparButton = new JButton("Limpar");
        limparButton.addActionListener(e -> limparCampos());
        add(limparButton);
       

        // Atualizar valor total ao alterar quantidade ou tamanho
        quantidadePizzasSpinner.addChangeListener(e -> atualizarValorTotal());
        tamanhoPizzaComboBox.addActionListener(e -> atualizarValorTotal());
    }

    private void atualizarValorTotal() {
        // Criar um pedido temporário para calcular o valor
        Pedido pedido = new Pedido();
        pedido.setQuantidadePizzas((int) quantidadePizzasSpinner.getValue());
        pedido.setTamanho((String) tamanhoPizzaComboBox.getSelectedItem());

        // Calcular o valor total
        pedido.calcularValorTotal();

        // Atualizar o valor total na interface
        valorTotalLabel.setText(String.format("R$ %.2f", pedido.getValorTotal()));
    }
    
     public void limpar(){
        nomeClienteField.setText(""); // Limpa o campo do nome do cliente
        enderecoField.setText(""); // Limpa o campo do endereço
        telefoneField.setText(""); // Limpa o campo do telefone
        quantidadePizzasSpinner.setValue(0); // Reseta o spinner para o valor inicial (0)
        tamanhoPizzaComboBox.setSelectedIndex(0); // Reseta o combobox para o primeiro item ("Pequeno")
        saborComboBox.setSelectedIndex(0); // Reseta o combobox para o primeiro item ("Calabresa")
        formaPagamentoComboBox.setSelectedIndex(0); // Reseta o combobox para o primeiro item ("Dinheiro")
        valorTotalLabel.setText("R$ 0,00"); // Reseta o valor total para "R$ 0,00"
        nomeClienteField.requestFocus(); // Coloca o foco no campo do nome do cliente
    }

    private void processarPedido() {
        // Validação dos campos
        if (nomeClienteField.getText().isEmpty() || enderecoField.getText().isEmpty() || telefoneField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obter os dados do formulário
        String nomeCliente = nomeClienteField.getText();
        String endereco = enderecoField.getText();
        String telefone = telefoneField.getText();
        int quantidadePizzas = (int) quantidadePizzasSpinner.getValue();
        String tamanho = (String) tamanhoPizzaComboBox.getSelectedItem();
        String sabor = (String) saborComboBox.getSelectedItem();
        String formaPagamento = (String) formaPagamentoComboBox.getSelectedItem();

        // Criar um objeto Pedido
        Pedido pedido = new Pedido();
        pedido.setNomeCliente(nomeCliente);
        pedido.setEndereco(endereco);
        pedido.setTelefone(telefone);
        pedido.setQuantidadePizzas(quantidadePizzas);
        pedido.setTamanho(tamanho);
        pedido.setSabor(sabor);
        pedido.setFormaPagamento(formaPagamento);

        // Calcular o valor total
        pedido.calcularValorTotal();

        // Adicionar o pedido ao banco de dados
        BDPizz bd = BDPizz.getInstance();
        bd.adicionarPedido(pedido);

        // Limpar campos e exibir mensagem de sucesso
        limparCampos();
        JOptionPane.showMessageDialog(this, "Pedido realizado com sucesso!");
    }

    private void limparCampos() {
        nomeClienteField.setText("");
        enderecoField.setText("");
        telefoneField.setText("");
        quantidadePizzasSpinner.setValue(0);
        tamanhoPizzaComboBox.setSelectedIndex(0);
        saborComboBox.setSelectedIndex(0);
        formaPagamentoComboBox.setSelectedIndex(0);
        valorTotalLabel.setText("R$ 0,00");
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
            java.util.logging.Logger.getLogger(CadPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadPedido.getCadPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner QuantPizzSPN;
    private javax.swing.JTextField endereco;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton limpar;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JComboBox<String> pag;
    private javax.swing.JButton pedir;
    private javax.swing.JComboBox<String> sabor;
    private javax.swing.JComboBox<String> tamanho;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField valor;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
