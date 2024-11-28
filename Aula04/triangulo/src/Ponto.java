
public class Ponto {
    private double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }

    public double distPontos(Ponto p) {
        return Math.sqrt( Math.pow(this.getX() - p.getX(), 2) + 
                          Math.pow(this.getY() - p.getY(), 2) );
    }

}
