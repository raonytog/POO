public class App {
    public static void main(String[] args) throws Exception {
        Produto[] lista = new Produto[5];
        lista[0] = new Livro("barbara", "barbara sort", 17.90f);
        lista[1] = new Livro("aline", "manhaes", 1001f);
        lista[2] = new Livro("malu", "banana", 20.83f);
        lista[3] = new Jogo(3, "brincadeira", 150.90f);
        lista[4] = new Jogo(5, "pegadinha", 130.90f);

        for (Produto p : lista) {
            System.out.println(p);
        }
    }
}
