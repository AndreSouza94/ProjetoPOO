/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andre Souza
 */
//André Faria de Souza  RA: 2101106
public class Funcionario  {
    private String nome;
    private String telefone;
    public Funcionario(String nome, String telefone){
    
        this.nome = nome;
        this.telefone = telefone;
    }

    public Funcionario() {
        
    }

    
    // Métodos getters e setters para nome e telefone
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}

    
   