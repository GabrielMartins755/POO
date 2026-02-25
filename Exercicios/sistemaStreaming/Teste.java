package Exercicios.sistemaStreaming;

public class Teste {
    public static void main(String[] args) {
        Ator prota = new Ator("Tom Cruise", "inglês", "ação");
        Ator antagonista = new Ator("The Rock", "inglês", "ação");
        Ator convidado = new Ator("Fernanda Montenegro", "português","Faz tudo");
        
        Filme filme = new Filme();
        filme.setTitulo("Filmaço");
        filme.getElenco().addAtor(prota);
        filme.getElenco().addAtor(antagonista);
        filme.getElenco().addAtor(convidado);
    }
}
