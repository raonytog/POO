package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    int hpMax;
    int hpAtual;
    int[] atk = new int[2];

    public Pokemon(int vida, int atk1, int atk2) {
        this.hpAtual = vida;
        this.hpMax = vida;

        this.atk[0] = atk1;
        this.atk[1] = atk2;
    }

    @Override
    public boolean atacar(Pokemon personagemAtacado) {
        Random r = new Random();
 		int n = r.nextInt(1);

        personagemAtacado.hpAtual -= this.atk[n];
        if (personagemAtacado.getPontosVitalidade() <= 0) return true;
        return false;
    }

    @Override
    public void regenera() {
        this.hpAtual = this.hpMax;
    }

    @Override
    public int getPontosVitalidade() {
        return this.hpAtual;
    }

}
