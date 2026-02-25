package Exercicios.sistemaStreaming;
import java.util.*;

public class Elenco {
    private List<Ator> atores;

    public Elenco(List<Ator> atores) {
        this.atores = new LinkedList<Ator>();
    }
    public List<Ator> getAtores() {
        return atores;
    }
    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
    public void addAtor(Ator ator) {
        atores.add(ator);
    }
}
