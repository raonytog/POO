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

    public void setMae(Pessoa newMae) { this.mae = newMae; }
    public void setPai(Pessoa newPai) { this.pai = newPai; }
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

        if (this.getPai() != null) System.out.print("\tPai: " + this.getPai().getName());
        if (this.getMae() != null) System.out.print(", Mae: " + this.getMae().getName() + "\n");

        if (this.getPai() != null) this.getPai().printFamilia();
        if (this.getMae() != null) this.getMae().printFamilia();
    }

    public java.util.Set<Pessoa> getAvos() {
        java.util.Set<Pessoa> avos = new java.util.HashSet<Pessoa>();

        // da mae
        if (this.getMae() != null && getAvoMaterna() != null) avos.add(this.getAvoMaterna());
        if (this.getMae() != null && getAvoMaterno() != null) avos.add(this.getAvoMaterno());

        // do pai
        if (this.getPai() != null && getAvoMaterno() != null) avos.add(this.getAvoMaterno());
        if (this.getPai() != null && getAvoMaterno() != null) avos.add(this.getAvoMaterno());

        return avos;
    }

    public java.util.Set<Pessoa> getAntepassados() {
        java.util.Set<Pessoa> antepassados = new java.util.HashSet<Pessoa>();

        if (this.getMae() != null) {
            antepassados.add(this.getMae());
            antepassados.addAll(this.getMae().getAntepassados());
        }

        if (getPai() != null) {
            antepassados.add(this.getPai());
            antepassados.addAll(this.getPai().getAntepassados());
        }

        return antepassados;
    }
}
