package Exercicios.sistemaHospital;

import java.util.*;

public class Paciente {
    private String nome;
    private List<Consulta> consultas = new ArrayList<>();

    public Paciente(String nome) {
        this.nome = nome;
    }
    
    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }
    public List<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
