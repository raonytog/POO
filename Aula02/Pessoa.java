package Aula02;

public class Pessoa {
    private String name = null;
    private Pessoa mae = null, pai = null;

    public Pessoa(String name, Pessoa mae, Pessoa pai) {
        this.name = name;
        this.mae = mae;
        this.pai = pai;
    }

    public String getName() { return name; }

    public void attName(String newName) { this.name = newName; }

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
        // else System.out.print("\tPai: pai desconhecido, ");

        if (getMae() != null) System.out.print(", Mae: " + getMae().getName() + "\n");
        // else System.out.print("mae: mae desconhecida\n");

        if (getPai() != null) getPai().printFamilia();
        if (getMae() != null) getMae().printFamilia();
    }

    public java.util.Set<Pessoa> getAvos() {
        java.util.Set<Pessoa> avos = new java.util.HashSet<Pessoa>();

        // da mae
        if (this.mae != null && getAvoMaterna() != null) avos.add(this.getAvoMaterna());
        if (this.mae != null && getAvoMaterno() != null) avos.add(this.getAvoMaterno());

        // do pai
        if (this.pai != null && getAvoMaterno() != null) avos.add(this.getAvoMaterno());
        if (this.pai != null && getAvoMaterno() != null) avos.add(this.getAvoMaterno());

        return avos;
    }
}
