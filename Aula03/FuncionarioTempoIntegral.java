public class FuncionarioTempoIntegral extends Funcionario {
    public FuncionarioTempoIntegral(String name, float salario) {
        super(name, salario);
    }

    @Override
    public String toString() {
        return getName() + ": " + getSalario() + " - Integral";
    }

}