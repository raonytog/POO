package q2;

import java.util.Random;

public class JogoPedraPapelTesouraImpl implements JogoPedraPapelTesoura {
    private Jogada jogador1;
    private Jogada jogador2;

    public JogoPedraPapelTesouraImpl() {
        this.jogador1 = this.random();
        this.jogador2 = this.random();
    }

    public Jogada random() {
        Random r = new Random();
        int num = r.nextInt(3); // 0, 1 ou 2

        switch (num) {
            case 0: return Jogada.PEDRA;
            case 1: return Jogada.PAPEL;
            case 2: return Jogada.TESOURA;
        }

        return null;
    }


    @Override
    public boolean haVencedor() {
        return this.jogador1 != this.jogador2;
    }

    @Override
    public Jogada jogadaJogador1() {
        return this.jogador1;
    }

    @Override
    public Jogada jogadaJogador2() {
        return this.jogador2;
    }

    @Override
    public int getJogadorVencedor() {
        switch (this.jogador1) {
            case Jogada.PEDRA:
                if (this.jogador2 == Jogada.PAPEL) return 2;
                else return 1;

            case Jogada.PAPEL:
                if (this.jogador2 == Jogada.TESOURA) return 2;
                else return 1;

            case Jogada.TESOURA:
                if (this.jogador2 == Jogada.PEDRA) return 2;
                else return 1;
        }

        return 0;
    }
}
