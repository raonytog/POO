package q3;

import java.util.HashSet;
import java.util.Set;

public class Universidade {
    private String nomeUniversidade;
    private Set<Curso> cursos = new HashSet<>();
    
    public Universidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public Curso criaCurso(String nomeCurso) {
        Curso c = new Curso(nomeCurso);
        this.cursos.add(c);
        return c;
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public Set<Curso> getCursos() {
        Set<Curso> copy = new HashSet<>(this.cursos);
        return copy;
    }

    @Override
    public String toString() {
        String toReturn = "Universidade: " +this.getNomeUniversidade() + "\n";
        for (Curso c : this.getCursos()) {
            toReturn += c.toString();
        }

        return toReturn;
    }

    
}
