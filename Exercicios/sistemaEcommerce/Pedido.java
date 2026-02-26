package Exercicios.sistemaEcommerce;

import java.util.*;

public class Pedido {
    private List<Produto> produtos = new ArrayList<>();
    private NotaFiscal notaFiscal;
    
    public Pedido(String numeroNota) {
        this.notaFiscal = new NotaFiscal(numeroNota); // composição
    }
    
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
