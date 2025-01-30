import java.util.Comparator;

public class ComparaAluno implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        int comparacao = a1.getNome().compareTo(a2.getNome()); 
        if (comparacao == 0) { return (int)a2.getNota() - (int)a1.getNota();}
        return comparacao;
    }

}
