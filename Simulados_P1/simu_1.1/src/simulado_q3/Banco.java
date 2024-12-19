package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private String nomeBanco;
    private Set<Agencia> agencias = new HashSet<>();
    
    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public Set<Agencia> getAgencias() {
        Set<Agencia> copy = new HashSet<>(this.agencias);
        return copy;
    }

    public Agencia criaAgencia(String nomeAgencia) {
        Agencia a = new Agencia(nomeAgencia);
        this.agencias.add(a);
        return a;
    }

    @Override
    public String toString() {
        String toReturn = "Nome do Banco: " + this.getNomeBanco() + "\n";
        for (Agencia a : this.agencias) {
            toReturn += "Agência: " + a.getNomeAgencia() + ", saldo médio: " + a.saldoMedio() + "\n";
        }

        return toReturn;
    }

    

    
}
