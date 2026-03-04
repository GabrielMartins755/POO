package atividadeTCC;

import java.util.*;

public class Banda {
    private String nome;
    private List<Cantor> cantores = new ArrayList<>();
    private ArrayList<Musica> musicas = new ArrayList<>();

    public Banda() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cantor> getCantores() {
        return cantores;
    }

    public void setCantores(List<Cantor> cantores) {
        this.cantores = cantores;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }
}
