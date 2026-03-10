package xadrez;

public class Bisbo extends Peca implements Movimentacao {

    public Bisbo(String cor, Posicao posicao) {
        super(cor, posicao);
    }

    public void mover(Posicao origem, Posicao destino) {
        int diferencaLinha = Math.abs(destino.getLinha() - origem.getLinha());
        int diferencaColuna = Math.abs(destino.getColuna() - origem.getColuna());

        if (diferencaLinha == diferencaColuna) {
            setPosicao(destino);
            System.out.println("Bispo moveu na diagonal!");
        } else {
            System.out.println("Movimento inválido para o Bispo!");
        }
    }
}
