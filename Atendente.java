
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
public class Atendente extends Funcionario  {
    private String turno;
    private String setor; // Novo atributo
    
    static boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

      // 🔹 Construtor vazio (necessário para alguns frameworks ou inicializações dinâmicas)
    public Atendente() {
        super(); // Chama o construtor vazio da superclasse (se existir)
        this.turno = "";
        this.setor = "";
    }

    // 🔹 Construtor parametrizado
    public Atendente(String nome, String telefone, String turno, String setor) {
        super(nome, telefone); // Chama o construtor da superclasse (Pessoa)
        this.turno = turno;
        this.setor = setor;
    }
 

    // Getter e Setter para o atributo turno
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // Getter e Setter para o novo atributo setor
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
     // Método para exibir dados
    public void exibirDados() {
        JOptionPane.showMessageDialog(
            null,
            "Nome: " + getNome() +
            "\nTelefone: " + getTelefone() +
            "\nSetor: " + getSetor()+
            "\nTurno: " + getTurno());
            
    }

}
     
   


