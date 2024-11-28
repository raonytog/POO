public class ContaEspecial extends Conta {
    public ContaEspecial(float valorInicial) {
        super(valorInicial);
    }

    @Override
    public float getTaxa() {
        return 1.01f;
    }
}
