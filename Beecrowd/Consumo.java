package Beecrowd;

import java.util.Scanner;

public class Consumo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        Double y = sc.nextDouble();

        Carro c = new Carro(x, y);

        System.out.format("%.3f km/l\n", c.getDistancia() / c.getCombustivel());
    }
}

class Carro {
    private int distancia;
    private Double combustivel;
    
    public Carro(int distancia, Double combustivel) {
        this.combustivel = combustivel;
        this.distancia = distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setCombustivel(Double combustivel) {
        this.combustivel = combustivel;
    }
    
    public int getDistancia() {
        return distancia;
    }
    public Double getCombustivel() {
        return combustivel;
    }
}
