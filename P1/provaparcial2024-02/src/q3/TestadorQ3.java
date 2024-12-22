/**
 * Raony Togneri Gomes
 */

package q3;

import java.util.Scanner;

/**
 * Questão 3.
 * 
 * Crie as classes que estão faltando, e implemente-as para completar
 * o código abaixo. Atenção: Você não pode alterar este arquivo!
 *
 * Escreva o seu nome em cada arquivo que produzir.
 * 
 * Assuma que a entrada padrão é usada da seguinte forma:
 * - Na primeira linha, o número de pessoas a serem cadastradas (nPessoas)
 * - Nas próximas 2*nPessoas linhas:
 * 		- A primeira linha de cada par identifica uma pessoa através de um identificador numérico
 * 		- A segunda linha de cada par contém o nome da pessoa a ser cadastrada
 * - Na próxima linha, o número de amizades a serem cadastradas (nAmizades) 
 * - Nas próximas nAmizades linhas:
 * - Um identificador de uma pessoa, um espaço e um identificador de uma outra pessoa (amigo da primeira)
 *
 * A saída deve estar em conformidade com o exemplo abaixo:
 * 
Entrada: ------------------
4
54
Pedro
555
Vítor
43
Ana
200
Maria
3
54 555
54 43
200 43

Saída: ---------------------
A pessoa que tem o maior número de amizades é: Ana (com 2 amizades).
 */

/*
 * A amizade é sempre simétrica. No exemplo acima, Pedro é amigo de Vítor (e vice-versa.) 
 * Logo, Vítor tem 1 amigo.
 * No caso de empate, use a ordem alfabética; no exemplo acima, Ana e Pedro tem 2 amizades.
 */
 
 /* Dica: use java.util.Map para armazenar as pessoas usando id da pessoa como chave.
 */

public class TestadorQ3 {

	public static void main(String[] args) {
		
		RedeSocial rede = new RedeSocial();

		Scanner scanner = new Scanner(System.in);
		int nPessoas = scanner.nextInt();
		scanner.nextLine(); // Despreza o \n.

		for (int i = 0; i < nPessoas; i++) {
			int idPessoa = scanner.nextInt();
			scanner.nextLine(); // Despreza o \n.
			String nomePessoa = scanner.nextLine();
			rede.criaPessoa(idPessoa, nomePessoa);
		}
	
		int nAmizades = scanner.nextInt();
		scanner.nextLine(); // Despreza o \n.
		
		for (int i = 0; i < nAmizades; i++) {
			int idPessoa1 = scanner.nextInt();
			int idPessoa2 = scanner.nextInt();
			scanner.nextLine(); // Despreza o \n.
			rede.criaAmizade(rede.getPessoa(idPessoa1), rede.getPessoa(idPessoa2));
		}


		System.out.println(rede);
		
		scanner.close();
	}

}
