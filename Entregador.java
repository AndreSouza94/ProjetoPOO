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

    static boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String veiculo;
    private String tipoHabilit;
    public Entregador(String nome, String telefone, String veiculo, String tipoHabilit){
        super(nome,telefone);
        this.veiculo = veiculo;
        this.tipoHabilit = tipoHabilit;
    }

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
        System.out.println("Nome: " + getNome()); // Supondo que getNome() esteja na classe Funcionario
        System.out.println("Telefone: " + getTelefone()); // Supondo que getTelefone() esteja na classe Funcionario
        System.out.println("Veiculo: " + veiculo);
        System.out.println("Habilitacao: " + tipoHabilit);
    }
}
