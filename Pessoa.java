public class Pessoa {
    private String name;
    private Pessoa mae, pai;

    public Pessoa(String name, Pessoa mae, Pessoa pai) {
        this.name = name;
        this.mae = mae;
        this.pai = pai;
    }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
    public void printPessoa() { System.out.println(this.name); }

    public Pessoa getMae() { return mae; }
    public Pessoa getPai() { return pai; }
    public Pessoa getAvoPaterna() { return this.getPai().getMae(); }
    public Pessoa getAvoPaterno() { return this.getPai().getPai(); }
    public Pessoa getAvoMaterna() { return this.getMae().getMae(); }
    public Pessoa getAvoMaterno() { return this.getMae().getPai(); }

    public void printFamilia() {
        System.out.println("\nFilho(a): " + getName());

        if (getPai() != null) System.out.print("\tPai: " + getPai().getName());
        else System.out.print("\tPai: pai desconhecido, ");

        if (getMae() != null) System.out.print(", Mae: " + getMae().getName() + "\n");
        else System.out.print("mae: mae desconhecida\n");

        if (getPai() != null) getPai().printFamilia();
        if (getMae() != null) getMae().printFamilia();
    }
}

