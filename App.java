public class App {
    public static void main(String[] args) {
        Pessoa gabriel = new Pessoa("Gabriel", null, null);
        Pessoa eduardo = new Pessoa("Eduardo", null, null);
        Pessoa marcela = new Pessoa("Marcela", gabriel, eduardo);
        Pessoa malu = new Pessoa("Malu", gabriel, eduardo);
        Pessoa barbara = new Pessoa("Barbara", gabriel, eduardo);
        Pessoa aline = new Pessoa("Aline", gabriel, eduardo);

        Pessoa raony = new Pessoa("Raony", aline, barbara );
        raony.printFamilia();
    }
}
