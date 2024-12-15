package q1;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String name;
    private Set<Departamento> departamentos;

    public Empresa(String name) {
        this.name = name;
        this.departamentos = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(Departamento d) {
        this.departamentos.add(d);
    }
    
}
