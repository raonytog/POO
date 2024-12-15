package q3;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String name;
    private Set<Disciplina> disciplinas;

    public Curso(String name) {
        this.name = name;
        this.disciplinas = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Disciplina criaDisciplina(String id, String name) {
        Disciplina d = new Disciplina(name, id);
        this.disciplinas.add(d);

        return d;
    }

    public void estabelecePreReq(Disciplina d, String id) {
        for (Disciplina discp: this.getDisciplinas()) {
            if (discp.getId().equals(id)) {
                d.addPreReq(discp.getNome());
                break;
            }
        }
    }
}
