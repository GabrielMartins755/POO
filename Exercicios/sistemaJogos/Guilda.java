package Exercicios.sistemaJogos;

import java.util.*;

public class Guilda {
    private String nome;
    private List<Personagem> membros = new ArrayList<>();

    
    public Guilda(String nome) {
        this.nome = nome;
    }
    public void adicionarMembro(Personagem personagem) {
        membros.add(personagem);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Personagem> getMembros() {
        return membros;
    }
    public void setMembros(List<Personagem> membros) {
        this.membros = membros;
    }
}
