package q1;

import java.util.HashSet;
import java.util.Set;

public class Departamento implements UnidadeOrganizacional {
    private String name;
    private Set<Setor> setores;

    public Departamento(String name) {
        this.name = name;
        this.setores = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Setor> getSetores() {
        return setores;
    }

    public void addSetor(Setor s) {
        this.setores.add(s);
    }

    @Override
    public double getSalarioMedio() {
        double salario = 0;
        for (Funcionario f : this.getFuncionarios()) {
            salario += f.getSalario();
       }

       return salario / this.getFuncionarios().size();
    }

    @Override
    public Set<Funcionario> getFuncionarios() {
        Set<Funcionario> conjunto = new HashSet<>();

        for (Setor s : this.getSetores()) {
            conjunto.addAll( s.getFuncionarios() );
        }

        return conjunto;
    }

   
}
