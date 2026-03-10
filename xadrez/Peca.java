package xadrez;
public class Peca {
    private String cor;
    private Posicao posicao;

    public Peca(String cor, Posicao posicao) {
        this.cor = cor;
        this.posicao = posicao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
}