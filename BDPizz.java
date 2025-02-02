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
    private static BDPizz pizzariaa;
    private Pizzaria pizzaria;
    private List<Pizza> cardapio;
    private List<Funcionario> funcionarios;
    private List<Cliente> cliente;
    private List<Atendente>atendente;
    private List<Entregador>entregador;
    private List<Cozinheiro>cozinheiro;
    private List<Pedido>pedido;

   public BDPizz() {
     this.pizzaria = new Pizzaria();
    this.cardapio = new ArrayList<>();
    this.funcionarios = new ArrayList<>();
    this.cliente = new ArrayList<>();
    this.atendente = new ArrayList<>();
    this.entregador = new ArrayList<>();
    this.cozinheiro = new ArrayList<>();
    this.pedido = new ArrayList<>();
}
    
   public static BDPizz getBDPizz() { 
       
       if (pizzariaa == null) {             
            pizzariaa = new BDPizz(); 
       } 
       return pizzariaa; 
   }
   
   // Métodos para acessar a Pizzaria
    public Pizzaria getPizzaria() {
        return pizzaria;
    }

    public void setPizzaria(Pizzaria pizzaria) {
        this.pizzaria = pizzaria;
    }
   
    public  List<Cliente> getCliente(){
        
        return cliente;
    }
    
    public  List<Atendente> getBDatd(){ // List do panel ConsultFunc

        return atendente;

    }
    
     public  List<Entregador> getBDentreg(){  // List do panel ConsultFunc

        return entregador;

    }
     
      public  List<Cozinheiro> getBDcozinheiro(){ // List do panel ConsultFunc

        return cozinheiro;

    }
 
  

    // Método para remover um funcionário
    public boolean removerFuncionario(String nome) {
        return funcionarios.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase(nome));
    }
    
   public void addAtendente(Atendente atd) {
    if (atd != null) {
        atendente.add(atd);
    }
}
 
public void addEntregador(Entregador etg) {
    if (etg != null) {
        entregador.add(etg);
    }
}
 
public void addCozinheiro(Cozinheiro cz) {
    if (cz != null) {
        cozinheiro.add(cz);
    }
}

public void adicionarPedido(Pedido ped) {
        if (ped != null) {
            pedido.add(ped);        
}    }
    public List<Pedido> getPedidos() {
        return pedido;
    }
    public Pedido buscarPedidoPorId(int id) {
        for (Pedido ped : pedido) {
            if (ped.getId() == id) {
                return ped;
            }        }        
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

 
    // Método para consultar o cardápio
    public List<Pizza> getCardapio() {
        return cardapio;
    }

    // Método para consultar funcionários
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
 

    // Método para consultar clientes
    public List<Cliente> consultarClientes() {
        return cliente;
    }
    

public Atendente consultaATD(String nome) {
    for (Atendente atd : atendente) {
        if (atd.getNome().equalsIgnoreCase(nome)) {
            return atd;
        }
    }
    return null; }
 
public Entregador consultaEntreg(String nome) {
    for (Entregador entreg : entregador) {
        if (entreg.getNome().equalsIgnoreCase(nome)) {
            return entreg;
        }
    }
    return null;  
}
 
public Cozinheiro consultaCozinheiro(String nome) {
    for (Cozinheiro coz : cozinheiro) {
        if (coz.getNome().equalsIgnoreCase(nome)) {
            return coz;
        }
    }
    return null; 
}

    public boolean remove(Atendente Atd) {
        for (Atendente bdatendente : atendente) {
            if (bdatendente.getNome().equalsIgnoreCase(Atd.getNome())) {
                atendente.remove(bdatendente);
                return true;
            }         
        }
        return false;
     }
    
     public boolean remove(Entregador entreg) {
        for (Entregador bdetg : entregador) {
            if (bdetg.getNome().equalsIgnoreCase(entreg.getNome())) {
                entregador.remove(bdetg);
                return true;
            }         
        }
        return false;
     }
     
     public boolean remove(Cozinheiro cz) {
        for (Cozinheiro bdcz : cozinheiro) {
            if (bdcz.getNome().equalsIgnoreCase(cz.getNome())) {
                cozinheiro.remove(bdcz);
                return true;
            }         
        }
        return false;
     }
     

    
}

