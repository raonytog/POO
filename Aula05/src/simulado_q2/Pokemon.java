package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    private int max_hp;
    private int current_hp;
    private int[] atks;
    
    public Pokemon(int max_hp, int atk1, int atk2) {
        this.max_hp = max_hp;
        this.current_hp = max_hp;
        this.atks = new int[2];
        this.atks[0] = atk1;
        this.atks[1] = atk2;

    }

    @Override
    public boolean atacar(Pokemon personagemAtacado) {
        Random r = new Random();
 		if (r.nextBoolean() == true) { personagemAtacado.receiveAtk(this.atks[1]); }
        else { personagemAtacado.receiveAtk(this.atks[0]); }

        if (personagemAtacado.getCurrent_hp() == 0) return true;
        else return false;
    }

    @Override
    public void regenera() {
        this.current_hp = this.getMax_hp();
    }

    @Override
    public int getPontosVitalidade() {
        return  this.current_hp;
    }

    public int getMax_hp() {
        return max_hp;
    }

    public int getCurrent_hp() {
        return current_hp;
    }

    public int[] getAtks() {
        return atks;
    }

    public int receiveAtk(int atk) {
        return this.current_hp -= atk;
    }


    

}
