public class Conta {
    private float saldo;
    
    public Conta(float valorInicial) {
        this.saldo = valorInicial;
    }
    
    public float obtemSaldo() {
        return saldo;
    }

    public void deposita(float a_depositar) {
        this.saldo += a_depositar;
    }

    public void saca(float a_sacar) {
        this.saldo -= this.getTaxa() *a_sacar;
    }

    public float getTaxa() {
        return 1.05f;
    }
}
