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
    // Variável estática para o padrão Singleton
    private static BDPizz instance;
    private static BDPizz pizzariaa;

    private Pizzaria pizzaria;
    private List<Funcionario> funcionarios;
    private List<Cliente> cliente;
    private List<Atendente> atendente;
    private List<Entregador> entregador;
    private List<Cozinheiro> cozinheiro;
    private List<Pedido> pedido;

    // Construtor privado para o padrão Singleton
    public BDPizz() {
        this.pizzaria = new Pizzaria();
        this.funcionarios = new ArrayList<>();
        this.cliente = new ArrayList<>();
        this.atendente = new ArrayList<>();
        this.entregador = new ArrayList<>();
        this.cozinheiro = new ArrayList<>();
        this.pedido = new ArrayList<>();
    }

    // Método estático para obter a instância única (Singleton)
    public static BDPizz getBDPizz() {
        if (pizzariaa == null) {
            pizzariaa = new BDPizz();
        }
        return pizzariaa;
    }

    // Método alternativo para obter a instância única (Singleton)
    public static BDPizz getInstance() {
        if (instance == null) {
            instance = new BDPizz();
        }
        return instance;
    }

    // Métodos para acessar a Pizzaria
    public Pizzaria getPizzaria() {
        return pizzaria;
    }

    public void setPizzaria(Pizzaria pizzaria) {
        this.pizzaria = pizzaria;
    }

    // Métodos para gerenciar clientes
    public List<Cliente> getCliente() {
        return cliente;
    }

    public void adicionarCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente.add(cliente);
        }
    }

    public boolean removerCliente(String nome) {
        return cliente.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
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
        return funcionarios.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase(nome));
    }

    // Métodos para gerenciar atendentes
    public List<Atendente> getBDatd() {
        return atendente;
    }

    public void addAtendente(Atendente atd) {
        if (atd != null) {
            atendente.add(atd);
            funcionarios.add(atd); // Adiciona também à lista geral de funcionários
        }
    }

    public Atendente consultaATD(String nome) {
        for (Atendente atd : atendente) {
            if (atd.getNome().equalsIgnoreCase(nome)) {
                return atd;
            }
        }
        return null;
    }

    public boolean remove(Atendente atd) {
        return atendente.removeIf(a -> a.getNome().equalsIgnoreCase(atd.getNome()));
    }

    // Métodos para gerenciar entregadores
    public List<Entregador> getBDentreg() {
        return entregador;
    }

    public void addEntregador(Entregador etg) {
        if (etg != null) {
            entregador.add(etg);
            funcionarios.add(etg); // Adiciona também à lista geral de funcionários
        }
    }

    public Entregador consultaEntreg(String nome) {
        for (Entregador entreg : entregador) {
            if (entreg.getNome().equalsIgnoreCase(nome)) {
                return entreg;
            }
        }
        return null;
    }

    public boolean remove(Entregador entreg) {
        return entregador.removeIf(e -> e.getNome().equalsIgnoreCase(entreg.getNome()));
    }

    // Métodos para gerenciar cozinheiros
    public List<Cozinheiro> getBDcozinheiro() {
        return cozinheiro;
    }

    public void addCozinheiro(Cozinheiro cz) {
        if (cz != null) {
            cozinheiro.add(cz);
            funcionarios.add(cz); // Adiciona também à lista geral de funcionários
        }
    }

    public Cozinheiro consultaCozinheiro(String nome) {
        for (Cozinheiro coz : cozinheiro) {
            if (coz.getNome().equalsIgnoreCase(nome)) {
                return coz;
            }
        }
        return null;
    }

    public boolean remove(Cozinheiro cz) {
        return cozinheiro.removeIf(c -> c.getNome().equalsIgnoreCase(cz.getNome()));
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

    public Pedido buscarPedidoPorId(int id) {
        for (Pedido ped : pedido) {
            if (ped.getId() == id) {
                return ped;
            }
        }
        return null; // Retorna null se o pedido não for encontrado
    }

    public boolean removerPedido(int id) {
        Pedido ped = buscarPedidoPorId(id);
        if (ped != null) {
            pedido.remove(ped);
            return true;
        }
        return false;
    }
    
    public Atendente buscarAtendentePorNome(String nome) {
    for (Atendente atd : atendente) {
        if (atd.getNome().equalsIgnoreCase(nome)) {
            return atd;
        }
    }
    return null; // Retorna null se o atendente não for encontrado
}
    
    public Entregador buscarEntregadorPorNome(String nome) {
    for (Entregador ent : entregador) {
        if (ent.getNome().equalsIgnoreCase(nome)) {
            return ent;
        }
    }
    return null; // Retorna null se o entregador não for encontrado
}

public Cozinheiro buscarCozinheiroPorNome(String nome) {
    for (Cozinheiro coz : cozinheiro) {
        if (coz.getNome().equalsIgnoreCase(nome)) {
            return coz;
        }
    }
    return null; // Retorna null se o cozinheiro não for encontrado
}
    
      public void updateAtendente(Atendente atd) {
    for (int i = 0; i < atendente.size(); i++) {
        if (atendente.get(i).getNome().equalsIgnoreCase(atd.getNome())) {
            atendente.set(i, atd);
            JOptionPane.showMessageDialog(null, "Atendente atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }
    JOptionPane.showMessageDialog(null, "Atendente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
}

// Atualizar um Entregador na lista de entregadores
public void updateEntregador(Entregador etg) {
    for (int i = 0; i < entregador.size(); i++) {
        if (entregador.get(i).getNome().equalsIgnoreCase(etg.getNome())) {
            entregador.set(i, etg);
            JOptionPane.showMessageDialog(null, "Entregador atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }
    JOptionPane.showMessageDialog(null, "Entregador não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
}

// Atualizar um Cozinheiro na lista de cozinheiros
public void updateCozinheiro(Cozinheiro cz) {
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

