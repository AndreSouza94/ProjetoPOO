
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
public class Cozinheiro extends Funcionario  {
    private String especialidade;
    private int experiencia;
    
    static boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public Cozinheiro() {
        super(); // Chama o construtor vazio da superclasse (se existir)
        this.especialidade = "";
        this.experiencia = 0;
    }
     
   /** public Cozinheiro(String nome, String telefone, String especialidade, int experiencia){
        super(nome,telefone);
        this.especialidade = especialidade;
        this.experiencia = experiencia;
    }**/

   
// Atributos e métodos adicionais de Cozinheiro
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public int getExperiencia() {
        return experiencia;
    }
    
  public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
  
  // Método para exibir dados
   public void exibirDados() {
        JOptionPane.showMessageDialog(null,
        "Nome: " + getNome() + "\n" +
        "Telefone: " + getTelefone() + "\n" +
        "Especialidade: " + especialidade + "\n" +
        "Experiência: " + experiencia + " anos",
        "Dados do Cozinheiro",
        JOptionPane.INFORMATION_MESSAGE
    );

   }
}