package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Agencia {
    private String nomeAgencia;
    private Set<Conta> contas = new HashSet<>();
    
    public Agencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }
    public Set<Conta> getContas() {
        Set<Conta> copy = new HashSet<>(this.contas);
        return copy;
    }

    public void adicionaConta(Conta c) {
        this.contas.add(c);
    }

    public double saldoMedio() {
        double total = 0;
        for(Conta c : this.contas) {
            total += c.getSaldo();
        }

        return total / this.getContas().size();
    }

    
}
