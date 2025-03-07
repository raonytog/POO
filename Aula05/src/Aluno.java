public class Aluno {
    private String nome;
    private String cpf;
    private float nota;
    
    public Aluno(String cpf, String nome, float nota) {
        this.nome = nome;
        this.cpf = cpf;
        this.nota = nota;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public float getNota() {
        return this.nota;
    }

    @Override
    public String toString() {
        return this.getNome() + ": " + this.getCpf()+ ", Nota: " + this.getNota();
    }
}
