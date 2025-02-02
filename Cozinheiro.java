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

    static boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String especialidade;
    private int experiencia;
    public Cozinheiro(String nome, String telefone, String especialidade, int experiencia){
        super(nome,telefone);
        this.especialidade = especialidade;
        this.experiencia = experiencia;
    }

   
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
        System.out.println("Nome: " + getNome()); // Supondo que getNome() esteja na classe Funcionario
        System.out.println("Telefone: " + getTelefone()); // Supondo que getTelefone() esteja na classe Funcionario
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Experiencia: " + experiencia);
    }
  
}
