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
import javax.swing.JOptionPane;

public class BDPizz {
    
    private Pizzaria pizzaria;
    private List<Funcionario> funcionarios;
    private List<Cliente> cliente;
    private List<Atendente> atendente;
    private List<Entregador> entregador;
    private List<Cozinheiro> cozinheiro;
    private List<Pedido> pedido;

    // Construtor privado 
    private BDPizz() {
        this.pizzaria = new Pizzaria();
        this.funcionarios = new ArrayList<>();
        this.cliente = new ArrayList<>();
        this.atendente = new ArrayList<>();
        this.entregador = new ArrayList<>();
        this.cozinheiro = new ArrayList<>();
        this.pedido = new ArrayList<>();
    }
//---------------------------------------------------------------------------------- 
   // Variável estática para o padrão Singleton
    private static BDPizz instance;
    private static Principal principal; // Armazena a instância de Principal
    private static ConsultFunc consultfunc;
    private static CadFunc cadfunc;
    private static CadPedido cadpedido;
    private static TablePedido tped;
    private static EditAtendente editAtendente;
    private static EditEntregador editEntregador;
    private static EditCozinheiro editCozinheiro;

      // Método estático para obter a instância única (Singleton)
    public static BDPizz getInstance() {
        if (instance == null) {
            instance = new BDPizz();
        }
        return instance;
    }
    
    // Método para obter a instância única de Principal
    public Principal getPrincipal() {
    if (principal == null || !principal.isDisplayable()) {
        principal = new Principal();
    }
    return principal;
  }
    
     
       public ConsultFunc getConsultFunc() {
    if (consultfunc == null || !consultfunc.isDisplayable()) {
       consultfunc = new ConsultFunc();
    }
    return consultfunc;
  }
       
       // Método para obter a instância única da tela de cadastro
    public static CadFunc getCadFunc() {
        if (cadfunc == null || !cadfunc.isDisplayable()) {
            cadfunc = new CadFunc();
        }
        return cadfunc;
    }
    
     public static CadPedido getCadPedido() {
        if (cadpedido == null || !cadpedido.isDisplayable()) {
            cadpedido = new CadPedido();
        }
        return cadpedido;
    }
     
     
     public static TablePedido getTablePedido() {
        if (tped == null || !tped.isDisplayable()) {
            tped = new TablePedido();
        }
        return tped;
    }
     
     // Sobrecarga
     public static EditAtendente getEditAtendente(Atendente atendente) { 
        if (editAtendente == null || !editAtendente.isDisplayable()) {
        editAtendente = new EditAtendente(atendente);
        }
       return editAtendente;
    }
     // Sobrecarga
     public static EditEntregador getEditEntregador(Entregador entregador) {
        if (editEntregador == null || !editEntregador.isDisplayable()) {
        editEntregador = new EditEntregador(entregador);
    }
    return editEntregador;
}
     // Sobrecarga
     public static EditCozinheiro getEditCozinheiro(Cozinheiro cozinheiro) {
        if (editCozinheiro == null || !editCozinheiro.isDisplayable()) {
        editCozinheiro = new EditCozinheiro(cozinheiro);
    }
    return editCozinheiro;
}
    
  // Fim singleton  
     
     
//----------------------------------------------------------------------------------    
    // Métodos para acessar e modificar a Pizzaria
    public Pizzaria getPizzaria() {
        return pizzaria;
    }

    public void setPizzaria(Pizzaria pizzaria) {
        this.pizzaria = pizzaria;
    }

    // Métodos para gerenciar clientes
    public List<Cliente> getClientes() {
        return cliente;
    }

    public void adicionarCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente.add(cliente);
        }
    }

    public boolean removerCliente(String nome) {
    for (int i = 0; i < cliente.size(); i++) {
        if (cliente.get(i).getNome().equalsIgnoreCase(nome)) {
            cliente.remove(i);
            return true; // Retorna imediatamente após remover
        }
    }
    return false; // Retorna false se o cliente não foi encontrado
}

    // Métodos para gerenciar funcionários
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (funcionario != null) {
            funcionarios.add(funcionario);
        }
    }

    public boolean removerFuncionario(String nome) {
    for (int i = 0; i < funcionarios.size(); i++) {
        if (funcionarios.get(i).getNome().equalsIgnoreCase(nome)) {
            funcionarios.remove(i);
            return true; // Retorna imediatamente após remover
        }
    }
    return false; // Retorna false se o funcionário não foi encontrado
}

    // Métodos para gerenciar atendentes
    public List<Atendente> getAtendentes() {
        return atendente;
    }

    public void adicionarAtendente(Atendente atd) {
        if (atd != null) {
            atendente.add(atd);
            funcionarios.add(atd);
        }
    }

    public Atendente consultaAtendente(String nome) {
        for (Atendente atd : atendente) {
            if (atd.getNome().equalsIgnoreCase(nome)) {
                return atd;
            }
        }
        return null;
    }

    public boolean removerAtendente(String nome) {
    for (int i = 0; i < atendente.size(); i++) {
        if (atendente.get(i).getNome().equalsIgnoreCase(nome)) {
            atendente.remove(i);
            return true; // Retorna imediatamente após remover
        }
    }
    return false; // Retorna false se o atendente não foi encontrado
}

    // Métodos para gerenciar entregadores
    public List<Entregador> getEntregadores() {
        return entregador;
    }

    public void adicionarEntregador(Entregador etg) {
        if (etg != null) {
            entregador.add(etg);
            funcionarios.add(etg);
        }
    }

    public Entregador consultaEntregador(String nome) {
        for (Entregador entreg : entregador) {
            if (entreg.getNome().equalsIgnoreCase(nome)) {
                return entreg;
            }
        }
        return null;
    }

   public boolean removerEntregador(String nome) {
    for (int i = 0; i < entregador.size(); i++) {
        if (entregador.get(i).getNome().equalsIgnoreCase(nome)) {
            entregador.remove(i);
            return true; // Retorna imediatamente após remover
        }
    }
    return false; // Retorna false se o entregador não foi encontrado
}

    // Métodos para gerenciar cozinheiros
    public List<Cozinheiro> getCozinheiros() {
        return cozinheiro;
    }

    public void adicionarCozinheiro(Cozinheiro cz) { // metodo adicionar cozinheiro
        if (cz != null) {
            cozinheiro.add(cz);
            funcionarios.add(cz);
        }
    }

    public Cozinheiro consultaCozinheiro(String nome) { // metodo consultar cozinheiro
        for (Cozinheiro coz : cozinheiro) {
            if (coz.getNome().equalsIgnoreCase(nome)) {
                return coz;
            }
        }
        return null;
    }

   public boolean removerCozinheiro(String nome) {
    for (int i = 0; i < cozinheiro.size(); i++) {
        if (cozinheiro.get(i).getNome().equalsIgnoreCase(nome)) {
            cozinheiro.remove(i);
            return true; // Retorna imediatamente após remover
        }
    }
    return false; // Retorna false se o cozinheiro não foi encontrado
}

    // Métodos para gerenciar pedidos
    public List<Pedido> getPedidos() {
        return pedido;
    }

    public void adicionarPedido(Pedido ped) {
        if (ped != null) {
            pedido.add(ped);
        }
    }

    

    // Atualizar Atendente
    public void atualizarAtendente(Atendente atd) {
        for (int i = 0; i < atendente.size(); i++) {
            if (atendente.get(i).getNome().equalsIgnoreCase(atd.getNome())) {
                atendente.set(i, atd);
                JOptionPane.showMessageDialog(null, "Atendente atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Atendente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    // Atualizar Entregador
    public void atualizarEntregador(Entregador etg) {
        for (int i = 0; i < entregador.size(); i++) {
            if (entregador.get(i).getNome().equalsIgnoreCase(etg.getNome())) {
                entregador.set(i, etg);
                JOptionPane.showMessageDialog(null, "Entregador atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Entregador não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    // Atualizar Cozinheiro
    public void atualizarCozinheiro(Cozinheiro cz) {
        for (int i = 0; i < cozinheiro.size(); i++) {
            if (cozinheiro.get(i).getNome().equalsIgnoreCase(cz.getNome())) {
                cozinheiro.set(i, cz);
                JOptionPane.showMessageDialog(null, "Cozinheiro atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Cozinheiro não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
