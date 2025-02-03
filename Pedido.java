/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andre Souza
 */
//André Faria de Souza  RA: 2101106
//import static Pizza.getSaboresDisponiveis;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pedido {
    private int id;
    private int quantidade;
    private String tamanho; // Tamanho da pizza
    private String sabor;   // Sabor da pizza
    private double preco;   // Preço da pizza
    private Cliente cliente;
    private Pagamento pagamento;

    // Lista de sabores disponíveis
    private static List<String> saboresDisponiveis = new ArrayList<>(Arrays.asList(
            "calabresa", "cinco queijos", "moda da casa", "alho e oleo", "frango catupiry", "carne seca"));

    // Construtor
    public Pedido(int id, int quantidade, String tamanho, String sabor, Cliente cliente) {
        this.id = id;
        this.quantidade = quantidade;
        this.tamanho = tamanho;
        this.sabor = sabor;
        this.cliente = cliente;
        this.preco = calcularPreco(tamanho); // Calcula o preço com base no tamanho
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
        this.preco = calcularPreco(tamanho); // Atualiza o preço ao alterar o tamanho
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
         if (saboresDisponiveis.contains(sabor)) {
        this.sabor = sabor;
    } else {
        throw new IllegalArgumentException("Sabor não disponível: " + sabor);
    }
}

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    // Métodos estáticos para gerenciar sabores disponíveis
    public static List<String> getSaboresDisponiveis() {
        return saboresDisponiveis;
    }

    public static void consultarSabores() {
        System.out.println("Sabores disponíveis:");
        for (String sabor : saboresDisponiveis) {
            System.out.println("- " + sabor);
        }
    }

    public static boolean alterarSabor(String saborAntigo, String novoSabor) {
        if (saboresDisponiveis.contains(saborAntigo)) {
            int index = saboresDisponiveis.indexOf(saborAntigo);
            saboresDisponiveis.set(index, novoSabor); // Altera o sabor
            return true; // Retorna verdadeiro se a alteração foi bem-sucedida
        }
        return false; // Retorna falso se o sabor não foi encontrado
    }

    // Método para calcular o preço com base no tamanho
    public static double calcularPreco(String tamanho) {
        switch (tamanho.toLowerCase()) {
            case "pequeno":
                return 20.00;
            case "medio":
                return 30.00;
            case "big":
                return 50.00;
            default:
                return 0.0; // Tamanho inválido
        }
    }

    // Método para calcular o valor total do pedido
    public double calcularValorTotal() {
        return quantidade * preco;
    }
}


