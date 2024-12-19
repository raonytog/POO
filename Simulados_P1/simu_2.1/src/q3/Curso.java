package q3;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String nomeCurso;
   private Set<Disciplina> disciplinas = new HashSet<>();

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Disciplina criaDisciplina(String idDisciplina, String nomeDisciplina) {
        Disciplina d = new Disciplina(idDisciplina, nomeDisciplina);
        this.disciplinas.add(d);
        return d;
    }

    public void estabelecePreReq(Disciplina d, String idDisciplina) {
        for (Disciplina i : this.getDisciplinas()) {
            if (i.getIdDisciplina().compareTo(idDisciplina) == 0) {
                d.addPreReq(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String toReturn = "Curso: " + this.getNomeCurso() + "\n";
        toReturn += "Disciplinas:\n";
        for (Disciplina d : this.getDisciplinas()) {
            toReturn += d.toString();
        }

        return toReturn;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public Set<Disciplina> getDisciplinas() {
        Set<Disciplina> copy = new HashSet<>(this.disciplinas);
        return copy;
    }


    



    
}
