/**
 * Raony Togneri Gomes
 */

package q2;

/**
 * Questão 2. Crie classes para representar pastas e arquivos 
 * em um sistema de arquivos organizado em formato de árvore. 
 * 
 * As classes Pasta e Arquivo devem estender a classe abstrata ItemSistemaArquivos
 * e devem atender aos requisitos impostos pela classe TestadorQ2 abaixo.
 * 
 * Dica: use java.util.LinkedHashSet para armazenar os conteúdos de uma pasta.
 * Desta forma, a ordem de iteração no conjunto será a mesma da inserção.
 * LinkedHashSet implementa a interface Set que você já conhece de sala de aula.
 * 
 * Não altere este arquivo!  
 * 
 * Escreva o seu nome em cada arquivo que produzir.
 * 
 */

/**
 * Representa um item do sistemas de arquivos.
 * 
 * Pai indica a pasta na qual o arquivo está contido.
 * 
 * O método tamanhoEmBytes deve retornar um atributo definido na construção no caso
 * de arquivos, e, no caso de pastas, retornar a soma dos tamanhos dos itens
 * contidos na pasta. 
 * 
 * O método toString deve ser sobrescrito para dar o caminho completo do item.
 * 
 */
abstract class ItemSistemaArquivos
{
	private Pasta pai;
    private String nome;

	public ItemSistemaArquivos(Pasta pai, String nome) { 
		this.pai=pai; 
		this.nome=nome; 
	}

	public Pasta getPai() { return pai; }
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome=nome; }

	abstract public int tamanhoEmBytes();
}

/**
 * Não altere a classe abaixo
 *
 */
public class TestadorQ2 {

	public static void imprimePasta(Pasta p)
	{
		System.out.println(p.toString() + " : " + p.tamanhoEmBytes() + " bytes");
		for (ItemSistemaArquivos item : p.getItems())
		{
			if (item instanceof Pasta) imprimePasta((Pasta)item);
			else System.out.println(item + " : " + item.tamanhoEmBytes() + " bytes");
		}
	}

	public static void main(String[] args) {
		// a pasta raiz não tem nome e não tem pasta pai
		Pasta raiz = new Pasta();

		// cria e adiciona um arquivo teste.txt na raiz de tamanho 1234 bytes
		Arquivo arquivoTxt = new Arquivo(raiz,"teste.txt",1234);
		raiz.adicionaItem(arquivoTxt);

		// cria e adiciona uma pasta documentos na raiz
		Pasta documentos = new Pasta(raiz,"documentos");
		raiz.adicionaItem(documentos);

		// cria uma pasta planilhas em documentos 
		Pasta planilhas = new Pasta(documentos,"planilhas");
		documentos.adicionaItem(planilhas);

		// cria um arquivo contas.xls de tamanho 4321 bytes em planilhas
		Arquivo arquivoXls = new Arquivo(planilhas,"contas.xls",4321);
		planilhas.adicionaItem(arquivoXls);

		// cria um arquivo receitas.xls de tamanho 1000 bytes em planilhas
		Arquivo arquivoReceitaXls = new Arquivo(planilhas,"receitas.xls",1000);
		planilhas.adicionaItem(arquivoReceitaXls);

		System.out.println("Exemplo de caminho completo: "+ arquivoReceitaXls);

		System.out.println("Sistema de arquivos criado:");
		imprimePasta(raiz);

		/* A saída deverá ser:
Exemplo de caminho completo: /documentos/planilhas/receitas.xls
Sistema de arquivos criado:
/ : 6555 bytes
/teste.txt : 1234 bytes
/documentos/ : 5321 bytes
/documentos/planilhas/ : 5321 bytes
/documentos/planilhas/contas.xls : 4321 bytes
/documentos/planilhas/receitas.xls : 1000 bytes
		*/	

	}

}
