package xadrez;

public class Posicao {
    private String linha;
    private String coluna;

    public Posicao(String linha, String coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }
    public String getLinha() {
        return linha;
    }
    public void setLinha(String linha) {
        this.linha = linha;
    }
    public String getColuna() {
        return coluna;
    }
    public void setColuna(String coluna) {
        this.coluna = coluna;
    }
}
