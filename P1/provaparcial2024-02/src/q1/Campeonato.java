/**
 * Raony Togneri Gomes
 */

package q1;

import java.util.HashSet;
import java.util.Set;

public class Campeonato {
    private String nomeCampeonato;
    private Set<Partida> partidas = new HashSet<>();

    public Campeonato(String nomeCampeonato) {
        this.nomeCampeonato = nomeCampeonato;
    }

    public String getNomeCampeonato() {
        return nomeCampeonato;
    }

    public Set<Partida> getPartidas() {
        Set<Partida> copy = new HashSet<>(this.partidas);
        return copy;
    }

    public void addPartida(Partida p) {
        this.partidas.add(p);
    }

    public Partida getPartidaMaisGols() {
        Partida partidaMaisGol = null;
        for (Partida p : this.getPartidas()) {
            if (partidaMaisGol == null) { partidaMaisGol = p; }
            else {
                if (p.getQtdGols() > partidaMaisGol.getQtdGols()) partidaMaisGol = p;
            }
        }
        return partidaMaisGol;
    }

    public Set<Partida> getPartidasGolContra() {
        Set<Partida> partidasGolContra = new HashSet<>();

        for (Partida p : this.getPartidas()) {
            for (Lance l : p.getLances()) {
                if (l instanceof Gol && ((Gol)l).ehContra() == true) {
                    partidasGolContra.add(p);
                    break;
                }
            }
        }
        return partidasGolContra;
    }

    @Override
    public String toString() {
        String toReturn = "Campeonato: " + this.getNomeCampeonato() + "\n";
        toReturn += "Partida com maior numero de gols: " + this.getPartidaMaisGols().getNomePartida() + ", com " + this.getPartidaMaisGols().getQtdGols() + " gols\n";
        toReturn += "Partidas com gol conta:\n";
        for (Partida p : this.getPartidasGolContra()) {
             toReturn += p.toString();
        }

        return toReturn;
    }

    
}
