public class App {
    public static void main(String[] args) {

        java.util.LinkedList<Partida> partidas = new java.util.LinkedList<Partida>();

        Team fla = new Team("Flalixo", 5);
        Team vasc = new Team("Vasco ", 2);
        Team flu = new Team("Fluminensy", 3);

        Partida p1 = new Partida(fla, vasc);
        Partida p2 = new Partida(flu, vasc);
        partidas.add(p1);
        partidas.add(p2);

        System.out.println("\nLista de partidas:");
        for(Partida p : partidas) {
            System.out.print("\t" + p.getTeamA().getTeamName());
            System.out.print(" x ");
            System.out.println(p.getTeamB().getTeamName());
        }
        System.out.println("\n");
    }
}
