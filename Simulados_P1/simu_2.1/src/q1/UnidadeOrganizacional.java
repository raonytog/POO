package q1;

import java.util.Set;

abstract class UnidadeOrganizacional {
    
    public double getSalarioMedio() {
        double total = 0;
        for (Funcionario f : this.getFuncionarios()) {
            total += f.getSalario();
        }
        return total / this.getFuncionarios().size();
    }

    public abstract Set<Funcionario> getFuncionarios();

}

