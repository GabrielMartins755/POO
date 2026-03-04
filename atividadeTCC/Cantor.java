package atividadeTCC;

import java.util.*;

public class Cantor {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();
    private Banda banda;

    public Cantor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }

}
