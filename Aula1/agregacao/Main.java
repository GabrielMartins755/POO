package Aula1.agregacao;

public class Main {
    public static void main(String[] args) {
        Departamento mkt = new Departamento("Marketng");
        Funcionario f1 = new Funcionario("Gabriel");
        Funcionario f2 = new Funcionario("cara legal");

        mkt.alocarFuncionario(f1);
        mkt.alocarFuncionario(f2);
    }
}
