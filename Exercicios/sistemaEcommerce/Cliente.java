package Exercicios.sistemaEcommerce;

import java.util.*;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome, List<Pedido> pedidos) {
        this.nome = nome;
        pedidos = new LinkedList<>();
    }
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
