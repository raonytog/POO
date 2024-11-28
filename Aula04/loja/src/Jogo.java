public class Jogo extends Produto {
    int idadeIndicada;

    public Jogo(int idade, String nome, float preo) {
        super(nome, preo);
        this.idadeIndicada = idade;
    }

    public int getIdadeIndicada() {
        return idadeIndicada;
    }

    @Override
    public String toString() {
        return "Jogo " + this.getNome() + " da idade " + this.getIdadeIndicada() + ", preco: " + this.getPreco();
    }
}
