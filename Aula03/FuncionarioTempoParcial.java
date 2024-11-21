public class FuncionarioTempoParcial extends Funcionario {
    private int horas;
    
    public FuncionarioTempoParcial(String name, float salario) {
        super(name, salario);
    }

    public void setNumeroHorasSemanais(int horas) {
        this.horas = horas;
    }

}