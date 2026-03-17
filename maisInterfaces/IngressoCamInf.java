package maisInterfaces;

public class IngressoCamInf extends IngressoNormal implements Imprimir{
    
    public IngressoCamInf(int valor) {
        super(valor);
    }

    public String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public void imprimir() {
        System.out.println("Localização: " + localizacao);
    }
}
