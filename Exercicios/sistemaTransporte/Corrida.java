package Exercicios.sistemaTransporte;

public class Corrida {
    private String origem;
    private String destino;
    private Pagamento pagamento;
    private Motorista motorista;
    private Passageiro passageiro;

    
    public Corrida(String origem, String destino, double valor, Motorista motorista, Passageiro passageiro) {
        this.origem = origem;
        this.destino = destino;
        this.motorista = motorista;
        this.passageiro = passageiro;
        this.pagamento = new Pagamento(valor);

        motorista.adicionarCorrida(this);
        passageiro.adicionarCorrida(this);
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    public String getOrigem() {
        return origem;
    }
    public String getDestino() {
        return destino;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
}