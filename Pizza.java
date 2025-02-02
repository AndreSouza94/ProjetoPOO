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

public class Pizza {
    private String tamanho;
    private String sabor;
    private double preco;

    // Lista de sabores disponíveis
    private static List<String> saboresDisponiveis = new ArrayList<>(Arrays.asList(
            "calabresa", "cinco queijos", "moda da casa", "alho e oleo", "frango catupiry", "carne seca"));

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static List<String> getSaboresDisponiveis() {
        return saboresDisponiveis;
    }

    
 // método para consultar sabores
    public static void consultarSabores() {
        System.out.println("Sabores disponíveis:");
        for (String sabor : saboresDisponiveis) {
            System.out.println("- " + sabor);
        }
    }
    
    public static boolean alterarSabor(String saborAntigo, String novoSabor) {
        List<String> sabores = getSaboresDisponiveis(); // Obtém a lista de sabores
        if (sabores.contains(saborAntigo)) {
            int index = sabores.indexOf(saborAntigo);
            sabores.set(index, novoSabor); // Altera o sabor
            return true; // Retorna verdadeiro se a alteração foi bem-sucedida
        }
        return false; // Retorna falso se o sabor não foi encontrado
    }

    public static double calcularPreco(String tamanho) {
        switch (tamanho.toLowerCase()) {
            case "pequeno":
                return 20.00;
            case "medio":
                return 30.00;
            case "big":
                return 50.00;
            default:
                return 0.0;
        }
    }
}