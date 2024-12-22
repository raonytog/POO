/**
 * Raony Togneri Gomes
 */


package q1;

/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre um campeonato de futebol, com suas
 * partidas e seus lances (faltas ou gols). 
 * 
 * Implemente funcionalidades nas suas classes para identificar a partida com o maior número de gols
 * em um campeonato, e para identificar as partidas de um campeonato em que houve gols contra.
 * 
 * Siga o diagrama UML fornecido. (O diagrama mostra alguns atributos, mas não é 
 * exaustivo quanto aos atributos e operações. Adicione aqueles que foram necessários.)
 * 
 * Atenção às indicações de navegabilidade e às cardinalidades. Veja que "Lance" é uma
 * classe abstrata (e não é uma interface).
 * 
 * Crie um testador no método main desta classe TestadorQ1 instanciando um campeonato, 
 * algumas partidas e lances, e invoque as funcionalidade exigidas acima. 
 *
 * Escreva o seu nome em cada arquivo que produzir ou alterar.
 * 
 */

public class TestadorQ1 {

	public static void main(String[] args) {

		Campeonato mundial = new Campeonato("mundial");

		Partida p1 = new Partida("fla x vas");
		p1.addLances(new Gol(23, true));
		p1.addLances(new Gol(24, true));
		p1.addLances(new Gol(25, false));

		Partida p2 = new Partida("fla x flu");
		p2.addLances(new Gol(3, false));

		Partida p3 = new Partida("fla x cor");
		p3.addLances(new Falta(23));

		Partida p4 = new Partida("rao x ray");
		p4.addLances(new Gol(0, true));
		p4.addLances(new Gol(0, true));
		p4.addLances(new Gol(0, true));
		p4.addLances(new Gol(0, true));
		p4.addLances(new Gol(0, true));
		p4.addLances(new Gol(0, true));
		p4.addLances(new Gol(0, true));

		mundial.addPartida(p1);
		mundial.addPartida(p2);
		mundial.addPartida(p3);
		mundial.addPartida(p4);

		System.out.println(mundial);
	}

}
