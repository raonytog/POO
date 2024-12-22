/**
 * Raony Togneri Gomes
 */

package q1;

public class Gol extends Lance {
    private boolean isGolContra;

    public Gol(int min, boolean isGolContra) {
        super(min);
        this.isGolContra = isGolContra;
    }

    public boolean ehContra() {
        return this.isGolContra;
    }
}
