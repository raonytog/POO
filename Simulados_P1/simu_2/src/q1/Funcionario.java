package q1;

public class Funcionario {
    private String name;
    private double salario;
    private Setor setor;

    public Funcionario(String name, double salario) {
        this.name = name;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }
    
    public double getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
        setor.addFuncionario(this);
    }

    @Override
    public String toString() {
        return this.getName();
    }

}