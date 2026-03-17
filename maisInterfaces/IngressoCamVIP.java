package maisInterfaces;

public class IngressoCamVIP extends IngressoVIP implements Imprimir{
    
    public IngressoCamVIP(int valor) {
        super(valor);
    }

    public String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimir() {
        System.out.println("Valor Total: " + getValorTotal());
        System.out.println("Localização: " + localizacao);
    }

}
