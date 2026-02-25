package Exercicios.sistemaStreaming;

public class Filme {
    private String titulo;
    private Elenco elenco;
    
    public Filme() {
    }
    public Filme(String titulo, Elenco elenco) {
        this.titulo = titulo;
        this.elenco = elenco;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Elenco getElenco() {
        return elenco;
    }
    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }
}
