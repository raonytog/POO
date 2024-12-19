package q1;

import java.util.HashSet;
import java.util.Set;

public class Departamento extends UnidadeOrganizacional {
    private String name;
    private Set<Setor> setores = new HashSet<>();

    public Departamento(String name) {
        this.name = name;
    }

    @Override
    public Set<Funcionario> getFuncionarios() {
        Set<Funcionario> copy = new HashSet<>();
        for (Setor s : this.setores) {
            copy.addAll(s.getFuncionarios());
        }

        return copy;
    }

    public String getName() {
        return name;
    }

    public Set<Setor> getSetores() {
        Set<Setor> copy = new HashSet<>(this.setores);
        return copy;
    }

    public void addSetor(Setor s) {
        this.setores.add(s);
    }

}
