import java.util.LinkedList;
import java.util.List;

public class Empresa {
    private public name;
    private List<Departamento> departamentos = new LinkedList<Departamento>(); 

    public String getNome() { return this.name; }
    public void addDepartamento(Departamento d) { departamentos.add(d); }
    public List<Departamento> getDepartamentos() { return this.departamentos; }

    @Override
    public String toString()    { return "Nome da empresa: " + getName(); }
}