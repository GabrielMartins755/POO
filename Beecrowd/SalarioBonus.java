package Beecrowd;
import java.util.*;

public class SalarioBonus {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = sc.nextLine();
        double fixo = sc.nextDouble();
        double vendas = sc.nextDouble();

        Vendedor v = new Vendedor(nome, fixo, vendas);

        System.out.format("TOTAL = R$ %.2f\n", v.getFixo() + (v.getVendas() * 0.15));

    }
}

class Vendedor {
    private String nome;
    private double fixo;
    private double vendas;

    public Vendedor(String nome, double fixo, double vendas) {
        this.nome = nome;
        this.fixo = fixo;
        this.vendas = vendas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFixo(double fixo) {
        this.fixo = fixo;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public double getFixo() {
        return fixo;
    }

    public double getVendas() {
        return vendas;
    }
}
