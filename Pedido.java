/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andre Souza
 */
//André Faria de Souza  RA: 2101106
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pedido {
    
    private String nomeCliente;
    private String endereco;
    private String telefone;
    private int quantidadePizzas;
    private String tamanho;
    private String sabor;
    private String formaPagamento;
    private double valorTotal;

    // Construtor vazio
    public Pedido() {}

     // Construtor com todos os campos
   /** public Pedido(String nomeCliente, String endereco, String telefone, int quantidadePizzas, String tamanho, String sabor, String formaPagamento, double valorTotal) {
        
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.telefone = telefone;
        this.quantidadePizzas = quantidadePizzas;
        this.tamanho = tamanho;
        this.sabor = sabor;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
    }**/

    // Método para calcular o valor total
    public void calcularValorTotal() {
        double valorPizza = 0;

        // Definir o valor da pizza com base no tamanho
        switch (tamanho) {
            case "Pequeno":
                valorPizza = 25.00;
                break;
            case "Médio":
                valorPizza = 35.00;
                break;
            case "Grande":
                valorPizza = 45.00;
                break;
        }

        // Calcular o valor total
        this.valorTotal = quantidadePizzas * valorPizza;
    }

   

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getQuantidadePizzas() {
        return quantidadePizzas;
    }

    public void setQuantidadePizzas(int quantidadePizzas) {
        this.quantidadePizzas = quantidadePizzas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {  // Sobreescrita
        return "Pedido{" +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", quantidadePizzas=" + quantidadePizzas +
                ", tamanho='" + tamanho + '\'' +
                ", sabor='" + sabor + '\'' +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}


