package Aula02;

public class App {
    public static void main(String[] args) {
        Pessoa avo_m = new Pessoa("avo homem", null, null);
        Pessoa avo_f = new Pessoa("avo mulhe", null, null);
        Pessoa gabriel = new Pessoa("Gabriel", null, null);
        Pessoa eduardo = new Pessoa("Eduardo", avo_f, null);
        Pessoa marcela = new Pessoa("Marcela", gabriel, eduardo);
        Pessoa malu = new Pessoa("Malu", gabriel, eduardo);
        Pessoa barbara = new Pessoa("Barbara", gabriel, eduardo);
        Pessoa aline = new Pessoa("Aline", gabriel, eduardo);
        Pessoa rayssa = new Pessoa("Rayssa", aline, barbara );

        /**
         * Atualiza o nome das pessoas
         */
        marcela.attName("Marcela Carpenter");
        malu.attName("Maria Luiza");

        /** Imprime a familia de Rayssa */
        rayssa.printFamilia();
        System.out.println("\n");

        /**
         * Desse jeito, apenas imprime o nome da classe e
         * a posicao de memoria que o objeto se encontra
         */
        System.out.println(rayssa.getAvos()); 

        /** 
         * Para imprimir todos os avós de rayssa
         */
        System.out.println("Lista de avós de " + rayssa.getName());
        for (Pessoa p : rayssa.getAvos()) {
            System.out.println("\t" + p.getName());
        }

        System.out.println("\nLista de descendentes de " + rayssa.getName());
        for (Pessoa p : rayssa.getAntepassados()) {
            System.out.println("\t" + p.getName());
        }
    }
}
