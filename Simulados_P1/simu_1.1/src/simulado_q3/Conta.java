package simulado_q3;

public class Conta {
    private String nomeConta;
    private double saldo;
    
    public Conta(String nomeConta, double saldo) {
        this.nomeConta = nomeConta;
        this.saldo = saldo;
    }
    
    public String getNomeConta() {
        return nomeConta;
    }
    public double getSaldo() {
        return saldo;
    }

    
}
