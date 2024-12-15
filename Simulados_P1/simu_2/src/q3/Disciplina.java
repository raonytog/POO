package q3;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    private String nome, id;
    private Set<String> preReq;

    public Disciplina(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.preReq = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public Set<String> getPreReq() {
        return preReq;
    }

    public void addPreReq(String id) {
        this.preReq.add(id);
    }

    @Override
    public String toString() {
        if (this.getPreReq().size() > 0) {
            String preRequisitos = String.join(", ", this.getPreReq());
            return this.getNome() + ", pré-requisitos: " + preRequisitos + "\n";
        } else {
            return this.getNome() + ", sem pré-requisitos\n";
        }
    }
}