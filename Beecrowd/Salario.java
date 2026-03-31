package Beecrowd;

import java.util.*;

public class Salario {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        int horas = sc.nextInt();
        Double valorHora = sc.nextDouble();

        Funcionario f = new Funcionario(num, valorHora, horas);

        System.out.printf("NUMBER = %d%n", f.getNum());
        
        double salariofinal = f.getHoras() * f.getSalario();
        System.out.printf("SALARY = U$ %.2f%n", salariofinal);
    }
}

class Funcionario {
    private int num;
    private double salario;
    private int horas;
    
    public Funcionario(int num, double salario, int horas) {
        this.num = num;
        this.salario = salario;
        this.horas = horas;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getNum() {
        return num;
    }

    public double getSalario() {
        return salario;
    }

    public int getHoras() {
        return horas;
    }
}