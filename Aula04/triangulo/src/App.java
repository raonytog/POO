public class App {
    public static void main(String[] args) throws Exception {
        Ponto p1 = new Ponto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        Ponto p2 = new Ponto(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
        Ponto p3 = new Ponto(Double.parseDouble(args[4]), Double.parseDouble(args[5]));

        Triangulo t = new Triangulo(p1, p2, p3);
        System.out.println("Perimetro: " + t.Perimetro());
    }
}
