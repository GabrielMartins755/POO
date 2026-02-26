package Exercicios.sistemaJogos;

import java.util.*;

public class Jogador {
    private String nome;
    private List<Personagem> personagens = new ArrayList<>();
    
    public Jogador(String nome) {
        this.nome = nome;
    }
    public void adicionarPersonagem(Personagem p) {
        personagens.add(p);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }
}
