package q2;

import java.util.Random;

public class JogoPedraPapelTesouraImpl implements JogoPedraPapelTesoura {
    private Jogada j1;
    private Jogada j2;

    public JogoPedraPapelTesouraImpl() {
        this.j1 = this.jogadaRandom();
        this.j2 = this.jogadaRandom();
    }

    public Jogada jogadaRandom() {
        Random r = new Random();
        int n = r.nextInt(3); // 0, 1 ou 2

        switch (n) {
            case 0: return Jogada.PEDRA;
            case 1: return Jogada.PAPEL;
            case 2: return Jogada.TESOURA;
        }

        return null;
    }

    @Override
    public boolean haVencedor() {
        return this.jogadaJogador1() != this.jogadaJogador2();
    }

    @Override
    public Jogada jogadaJogador1() {
        return this.j1;
    }

    @Override
    public Jogada jogadaJogador2() {
        return this.j2;
    }

    @Override
    public int getJogadorVencedor() {
        switch (this.j1) {
            case Jogada.PEDRA:
                if (this.j2 == Jogada.PAPEL) return 2;
                else return 1;

            case Jogada.PAPEL:
                if (this.j2 == Jogada.TESOURA) return 2;
                else return 1;

            case Jogada.TESOURA:
                if (this.j2 == Jogada.PEDRA) return 2;
                else return 1;
        }

        return 0;
    }
}
