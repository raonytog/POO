/**
 * Raony Togneri Gomes
 */

package q3;

import java.util.HashMap;
import java.util.Map;

public class RedeSocial {
    private Map<Integer, Pessoa> pessoas;

    public RedeSocial() {
        this.pessoas = new HashMap<>();
    }
    
    public void criaPessoa(int id, String nome) {
        Pessoa p = new Pessoa(id, nome);
        this.pessoas.put(id, p);
    }

    public Pessoa getPessoa(int id) {
        return this.pessoas.get(id);
    }

    public void criaAmizade(Pessoa p1, Pessoa p2) {
        p2.addAmizade(p1);
        p1.addAmizade(p2);
    }

    public Pessoa getPessoaMaisAmizade() {
        Pessoa maisAmigos = null;
        for (Pessoa p : this.pessoas.values()) {
            if (maisAmigos == null) maisAmigos = p;
            else if (p.getQtdAmigos() > maisAmigos.getQtdAmigos()) { maisAmigos = p; }
            else if (p.getQtdAmigos() == maisAmigos.getQtdAmigos()) { 
                if (p.getNomePessoa().compareTo(maisAmigos.getNomePessoa()) <= 0) { maisAmigos = p; }
            }
        }
        return maisAmigos;
    }

    @Override
    public String toString() {
        Pessoa p = this.getPessoaMaisAmizade();
        return "A pessoa que tem o maior número de amizades é: " + p.getNomePessoa()  + "(com " + p.getQtdAmigos() + "amizades).\n";
    }

    
}
