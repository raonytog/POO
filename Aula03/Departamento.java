import java.util.LinkedList;
import java.util.List;

public class Departamento {
    private String name;
    private List<Funcionario> funcionarios = new LinkedList<Funcionario>();
    
    public Departamento(String name) {
        this.name = name;
    }
    
    public String getNome() {
        return this.name;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    
    public void addFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    }
    
    public float getMediaSalarial() {
        if (funcionarios.isEmpty()) return 0;
        
        float total = 0;
        for (Funcionario f : funcionarios) { total += f.getSalario(); }
        return total / funcionarios.size();
    }
}