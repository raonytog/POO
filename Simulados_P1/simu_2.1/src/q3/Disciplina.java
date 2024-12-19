package q3;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    private String idDisciplina;
    private String nomeDisciplina;
    private Set<Disciplina> preReq = new HashSet<>();
    
    public Disciplina(String idDisciplina, String nomeDisciplina) {
        this.idDisciplina = idDisciplina;
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public Set<Disciplina> getPreReq() {
        Set<Disciplina> copy = new HashSet<>(this.preReq);
        return copy;
    }

    public void addPreReq(Disciplina d) {
       this.preReq.add(d);
    }

    @Override
    public String toString() {
        String toReturn = this.getNomeDisciplina();

        if (this.getPreReq().isEmpty()) {
            toReturn += ", sem pré-requisitos\n"; 

        } else {
            toReturn += ", pré-requisitos: ";
            int i = 0;
            for (Disciplina d : this.getPreReq()) {
                toReturn += d.getNomeDisciplina();
                i++;
                if (i < this.preReq.size()) toReturn += ", ";
            }
            toReturn += "\n";
        }


        return toReturn;
    }

    
}
