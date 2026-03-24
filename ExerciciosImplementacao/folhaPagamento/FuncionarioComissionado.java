package ExerciciosImplementacao.folhaPagamento;

public class FuncionarioComissionado extends Funcionario {
    double vendasMensais;
    double percentualComissao;

    public FuncionarioComissionado(){}

    public FuncionarioComissionado(String nome, double salarioBase, double vendasMensais, double percentualComissao) {
        super(nome, salarioBase);
        this.vendasMensais = vendasMensais;
        this.percentualComissao = percentualComissao;
    }

    public double getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
