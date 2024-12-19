package q1;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String name;
    private Set<Departamento> departamentos = new HashSet<>();

    public Empresa(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Departamento> getDepartamentos() {
        Set<Departamento> copy = new HashSet<>(this.departamentos);
        return copy;
    }

    public void addDepartamento(Departamento d) {
        this.departamentos.add(d);
    }

    @Override
    public String toString() {
        String toReturn = "Empresa: " + this.getName() + "\n";
        for (Departamento d : this.departamentos) {
            toReturn += "\tDepartamento: " + d.getName() + "\n";
            
            for (Setor s : d.getSetores()) {
                toReturn += s.toString();
            }
            toReturn += "\n";
        } 

        return toReturn;
    }

    
    
}
