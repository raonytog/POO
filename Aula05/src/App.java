import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("enem.csv");
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();
        linha = br.readLine();

        List<Aluno> listaAlunos = new LinkedList<Aluno>();
        while (linha != null) {
            Scanner s = new Scanner(linha).useDelimiter(";");
            Aluno aluno = new Aluno(s.next(), s.next(), s.nextFloat());
            linha = br.readLine();
            listaAlunos.add(aluno);
            s.close();
        }

        Collections.sort(listaAlunos, new ComparaAluno());
        System.out.print("\n");
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }

        br.close();
    }
}
