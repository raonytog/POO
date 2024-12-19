package q1;

import java.util.HashSet;
import java.util.Set;

public class Setor extends UnidadeOrganizacional {
    private Set<Funcionario> funcionarios = new HashSet<>();
    private String name;

    public Setor(String name) {
        this.name = name;
    }

    @Override
    public Set<Funcionario> getFuncionarios() {
        Set<Funcionario> copy = new HashSet<>(this.funcionarios);
        return copy;
    }

    public String getName() {
        return name;
    }

    public void addFuncionario(Funcionario f) {
        this.funcionarios.add(f);
        f.setSetorAtuacao(this);
    }

    public void removeFuncionario(Funcionario f) {
        this.funcionarios.remove(f);
        f.setSetorAtuacao(null);
    }

    @Override
    public String toString() {
        String toReturn = "\t\tSetor: " + this.getName() + "\n";
        for (Funcionario f : this.getFuncionarios()) {
            toReturn += "\t\t\t" + f.getName() + "\n";
        }
        return toReturn;
    }

    

}
