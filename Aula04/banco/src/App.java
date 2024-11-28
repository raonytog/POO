public class App {
    public static void main(String[] args) throws Exception {
        Conta aline = new Conta(100);
        aline.deposita(400);
        aline.saca(250);

        System.out.println("Saldo de aline: " + aline.obtemSaldo());

        ContaEspecial barbara = new ContaEspecial(100);
        barbara.deposita(400);
        barbara.saca(250);
        System.out.println("Saldo de barbara: " + barbara.obtemSaldo());
    }
}
