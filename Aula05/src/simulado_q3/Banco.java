package simulado_q3;

public class Banco {
    private String nome;
    private Agencia agencia;

    public Banco(String nome) {
        this.nome = nome;
    }

    public Agencia criaAgencia(String nome) {
        Agencia a = new Agencia(nome);
        this.agencia = a;
        
        return a;
    }

    @Override
    public String toString() {
        return "Nome do Banco: " + this.getNome() + 
                "\nAgência: " + this.getAgencia().getNome() + ", saldo médio: " + this.agencia.getSaldoMedio();

    }

    public String getNome() {
        return nome;
    }

    public Agencia getAgencia() {
        return agencia;
    }
    
}
