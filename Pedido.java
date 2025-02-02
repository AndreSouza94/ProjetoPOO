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
import java.util.List;
 
public class Pedido {
    private int id;
    private List<Pizza> listaPizzas;
    private int quantidade;
    private Cliente cliente;
    private Pagamento pagamento;
    public Pedido(int id) {
        this.id = id;
        this.listaPizzas = new ArrayList<>();
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public List<Pizza> getListaPizzas() {
        return listaPizzas;
    }
 
    public void setListaPizzas(List<Pizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }
 
    public int getQuantidade() {
        return quantidade;
    }
 
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
 
    // Método para calcular o valor total do pedido
    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Pizza pizza : listaPizzas) {
            valorTotal += pizza.getPreco();
        }
        return valorTotal;
    }
}


