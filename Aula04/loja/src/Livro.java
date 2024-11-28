public class Livro extends  Produto {
    private String autor;

    public Livro(String autor, String nome, float preco) {
        super(nome, preco);
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro " + this.getNome() + " do autor " + this.getAutor() + ", preco: " + this.getPreco();
    }
}

