package simulado_q3;

public class Conta {
    private String nome;
    private double  saldo;

    public Conta(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    } 
}
