public abstract class Funcionario {
    private String  name;
    private float   salario;
    private int     horas;

    public Funcionario(String name, float salario) {
        this.name = name;
        this.salario = salario;
        this.horas = 40;
    }
    
    public String getName()     { return this.name; }
    public float getSalario()   { return this.salario; }
    public int getHoras()       { return this.horas; }
}
    @Override
    public String toString()    { return getName() + ": " + getSalario(); }
