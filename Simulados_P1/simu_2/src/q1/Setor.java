package q1;

import java.util.HashSet;
import java.util.Set;

public class Setor implements UnidadeOrganizacional {
    private String name;
    private Set<Funcionario> funcionarios;

    public Setor(String name) {
        this.name = name;
        this.funcionarios = new HashSet<>();
    }

    public String getName() {
        return name;
    }
    
    public void addFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    }

    public void removeFuncionario(Funcionario f) {
        this.funcionarios.remove(f);
    }

    public void changeSetorFuncionario(Funcionario f, Setor novSetor) {
        this.removeFuncionario(f);
        novSetor.addFuncionario(f);
    }

    @Override
    public double getSalarioMedio() {
        double total = 0;
        for (Funcionario f : this.funcionarios) {
            total += f.getSalario();
        }

        return total / this.getFuncionarios().size();
    }

    @Override
    public Set<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    
    
}
