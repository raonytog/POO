package q1;

/**
 * Questão 1 (4 pontos).
 * 
 * Crie classes para representar dados sobre uma empresa com suas unidades organizacionais 
 * (departamentos estruturados em setores) e seus funcionários (lotados em setores). 
 * 
 * Siga o diagrama UML fornecido (diagrama-q1.png). (O diagrama mostra alguns atributos e 
 * algumas operações, mas não é exaustivo quanto aos atributos e operações. 
 * Adicione aqueles que foram necessários.)
 * 
 * Implemente funcionalidade nas suas classes para calcular o salário médio de uma 
 * unidade organizacional, assim como para consultar os funcionários nela lotados 
 * (direta ou indiretamente).
 * 
 * Atenção às indicações de navegabilidade e às cardinalidades.
 * 
 * Sua implementação deve permitir a transferência de um funcionário para outro setor.
 * 
 * Crie um testador para suas classes. 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		Empresa e = new Empresa("Rayssa's corp");

		Departamento roblox = new Departamento("roblox");
		Setor robux = new Setor("robux");
		roblox.addSetor(robux);

		Departamento minecraft = new Departamento("minecraft");
		Setor minecraftUpdates = new Setor("minecraft updates");
		minecraft.addSetor(minecraftUpdates);

		Funcionario barbara = new Funcionario("barbara", 12000);
		barbara.setSetor(robux);

		Funcionario aline = new Funcionario("aline", 12500);
		aline.setSetor(robux);

		System.out.println("Imprimindo funcionarios do departamento " + roblox.getName());
		System.out.println(roblox.getFuncionarios());
		System.out.println(); // blanc line
		System.out.println("Imprimindo funcionarios do departamento " + minecraft.getName());
		System.out.println(minecraft.getFuncionarios());

		System.out.println("\nAlterando o setor de um funcionario");
		barbara.setSetor(minecraftUpdates);
		System.out.println("Imprimindo funcionarios do departamento " + minecraft.getName());
		System.out.println(minecraft.getFuncionarios());
	}

}
