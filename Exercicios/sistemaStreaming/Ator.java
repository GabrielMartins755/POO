package Exercicios.sistemaStreaming;

public class Ator {
    private String nome;
    private String idiomaNativo;
    private String especialidade;

    
    public Ator(String nome, String idiomaNativo, String especialidade) {
        this.nome = nome;
        this.idiomaNativo = idiomaNativo;
        this.especialidade = especialidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdiomaNativo() {
        return idiomaNativo;
    }
    public void setIdiomaNativo(String idiomaNativo) {
        this.idiomaNativo = idiomaNativo;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
