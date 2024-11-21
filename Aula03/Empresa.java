import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private String name;
    private List<Departamento> departamentos = new LinkedList<Departamento>();

    public Empresa(String name) { 
        this.name = name;
    }

    public String getNome() {
        return this.name;
    }

    public void addDepartamento(Departamento d) {
        this.departamentos.add(d);
    }

    public List<Departamento> getDepartamentos() {
        return this.departamentos;
    }

    @Override
    public String toString() {
        return "Nome da empresa: " + getNome();
    }
}