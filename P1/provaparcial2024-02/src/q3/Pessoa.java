/**
 * Raony Togneri Gomes
 */

package q3;

import java.util.HashMap;
import java.util.Map;

public class Pessoa {
    private String nomePessoa;
    private int idPessoa;
    private int qtdAmigos;
    private Map<Integer, Pessoa> amizades = new HashMap<>();

    public Pessoa(int id, String nome) {
        this.idPessoa = id;
        this.nomePessoa = nome;
    }

    public Pessoa getPessoa(int id) {
        return amizades.get(id);
    }

    public String getNomePessoa() {
        return nomePessoa;
    }
    
    public int getIdPessoa() {
        return idPessoa;
    }

    public int getQtdAmigos() {
        return qtdAmigos;
    }

    public void addAmizade(Pessoa p) {
        this.qtdAmigos++;
        this.amizades.put(p.getIdPessoa(), p);
    }
}
