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

// Universidade: UFES
// Curso: Engenharia de Computação
// Disciplinas:
// Programação I, sem pré-requisitos
// Programação II, pré-requisitos: Programação I
// Sistemas Operacionais, sem pré-requisitos
// Redes de Computadores, sem pré-requisitos
// Processamento Paralelo e Distribuído, pré-requisitos: Redes de Computadores, Sistemas Operacionais



    @Override
    public String toString() {
        return "Universidade: " + this.getName() + "\n" +
               "Curso: " + this.getCurso().getName() + "\n" +
               "Disciplinas: \n" + this.getCurso().getDisciplinas();
               
    }

}
