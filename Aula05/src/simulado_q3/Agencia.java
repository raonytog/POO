package simulado_q3;

import java.util.HashSet;
import java.util.Set;

public class Agencia {
    private String nome;
    private Set<Conta> contas;

    public Agencia(String nome) {
        this.nome = nome;
        this.contas = new HashSet<>();
    }

    public void adicionaConta(Conta conta) {
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public Set<Conta> getContas() {
        return contas;
    }

    public double getSaldoMedio() {
        double total = 0;
        for (Conta i : this.contas) {
            total += i.getSaldo();
        }

        return total / contas.size();
    }

}
