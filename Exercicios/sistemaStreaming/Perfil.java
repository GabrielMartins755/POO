package Exercicios.sistemaStreaming;

import java.util.LinkedList;
import java.util.List;

public class Perfil {
    private String nome;
    private int idade;
    private List<Filme> historico;
    
    public Perfil(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        historico = new LinkedList<Filme>();
    }
    public void assistirFilme(Filme filme){
        historico.add(filme);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public List<Filme> getHistorico() {
        return historico;
    }
    public void setHistorico(List<Filme> historico) {
        this.historico = historico;
    }
}
