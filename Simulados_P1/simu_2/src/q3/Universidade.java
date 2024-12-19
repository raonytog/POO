package q3;

public class Universidade {
    private String name;
    private Curso curso;

    public Universidade(String nome) {
        this.name = nome;
    }

    public Curso criaCurso(String nome) {
        Curso c = new Curso(nome);
        this.curso = c;
        return c;
    }

    public String getName() {
        return name;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Universidade: " + this.getName() + "\n" +
               "Curso: " + this.getCurso().getName() + "\n" +
               "Disciplinas: \n" + this.getCurso().getDisciplinas();
               
    }

}
