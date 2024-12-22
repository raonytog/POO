/**
 * Raony Togneri Gomes
 */

package q1;

import java.util.HashSet;
import java.util.Set;

public class Partida {
    private String nomePartida;
    private Set<Lance> lances = new HashSet<>();

    public Partida(String nomePartida) {
        this.nomePartida = nomePartida;
    }

    public String getNomePartida() {
        return this.nomePartida;
    }

    public Set<Lance> getLances() {
        Set<Lance> copy = new HashSet<>(this.lances);
        return copy;
    }

    public void addLances(Lance l) {
        this.lances.add(l);
    }

    public int getQtdGols() {
        int total = 0;
        for (Lance l : this.getLances()) {
            if (l instanceof Gol) { total++; }
        }

        return total;
    }

    public int getQtdGolsContra() {
        int total = 0;
        for (Lance l : this.getLances()) {
            if (l instanceof Gol && ((Gol)l).ehContra() == true) { total++; }
        }

        return total;
    }

    @Override
    public String toString() {
        return "\tPartida:" + this.nomePartida + "\n";
    }

    
}
