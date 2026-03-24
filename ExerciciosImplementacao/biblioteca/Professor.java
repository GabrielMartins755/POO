package ExerciciosImplementacao.biblioteca;

public class Professor extends Pessoa {
    private String departamento;

    public Professor(String departamento, String nome, String dataNasc) {
        super(nome, dataNasc);
        this.departamento = departamento;
    }

    public Professor() {
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}