package Beecrowd;
import java.util.*;

public class CalculoSimples {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.next();
        int b1 = sc.nextInt();
        float c1 = sc.nextFloat();
        Objeto x = new Objeto(b1, c1);
        
        sc.next();
        int b2 = sc.nextInt();
        float c2 = sc.nextFloat();
        Objeto y = new Objeto(b2, c2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", (x.getQtd() * x.getValor() + y.getQtd() * y.getValor()) * 1.0);
    }
}

class Objeto {
    private int qtd;
    private double valor;

    public Objeto (int qtd, double valor) {
        this.qtd = qtd;
        this.valor = valor;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public double getValor() {
        return valor;
    }
}