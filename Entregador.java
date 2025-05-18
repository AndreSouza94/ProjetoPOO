
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andre Souza
 */
//André Faria de Souza  RA: 2101106
public class Entregador extends Funcionario{
    private String veiculo;
    private String tipoHabilit; 
    
    static boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // 🔹 Construtor vazio (necessário para alguns frameworks ou inicializações dinâmicas)
    public Entregador() {
        super(); // Chama o construtor vazio da superclasse (se existir)
        this.veiculo = "";
        this.tipoHabilit = "";
    }

    
   /** public Entregador(String nome, String telefone, String veiculo, String tipoHabilit){
        super(nome,telefone);
        this.veiculo = veiculo;
        this.tipoHabilit = tipoHabilit;
    }**/

    public String getVeiculo() {
        return veiculo;
    }
    
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    
    public String getTipohabilit() { // Renomeado para refletir a mudança
        return tipoHabilit;
    }
    
    public void setTipohabilit(String tipoHabilit) { // Renomeado para refletir a mudança
        this.tipoHabilit = tipoHabilit;
    }
    
     // Método para exibir dados
       public void exibirDados() {
             JOptionPane.showMessageDialog(null,
        "Nome: " + getNome() + "\n" +
        "Telefone: " + getTelefone() + "\n" +
        "Veículo: " + veiculo + "\n" +
        "Habilitação: " + tipoHabilit,
        "Dados do Entregador",
        JOptionPane.INFORMATION_MESSAGE
    );
}
}

