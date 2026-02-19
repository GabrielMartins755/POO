package Aula1.composicao;

public class Casa{
    private Comodo quarto;
    private Comodo cozinha;
    private Comodo sala;
    private Comodo banheiro;
    private Comodo lavanderia;

    public Casa(){
        this.quarto = new Comodo("Quarto");
        this.cozinha = new Comodo("Cozinha");
        this.sala = new Comodo("Sala");
        this.banheiro = new Comodo("Banheiro");
        this.lavanderia = new Comodo("Lavanderia");
    }

    public Comodo getQuarto() {
        return quarto;
    }
    public void setQuarto(Comodo quarto) {
        this.quarto = quarto;
    }
    public Comodo getCozinha() {
        return cozinha;
    }
    public void setCozinha(Comodo cozinha) {
        this.cozinha = cozinha;
    }
    public Comodo getSala() {
        return sala;
    }
    public void setSala(Comodo sala) {
        this.sala = sala;
    }
    public Comodo getBanheiro() {
        return banheiro;
    }
    public void setBanheiro(Comodo banheiro) {
        this.banheiro = banheiro;
    }
    public Comodo getLavanderia() {
        return lavanderia;
    }
    public void setLavanderia(Comodo lavanderia) {
        this.lavanderia = lavanderia;
    }

    public void mostrarComodos(){
        System.out.println("Comodos da casa 🏠");
        System.out.println(getQuarto().getNome());
        System.out.println(getCozinha().getNome());
        System.out.println(getSala().getNome());
        System.out.println(getBanheiro().getNome());
        System.out.println(getLavanderia().getNome());
    }
}