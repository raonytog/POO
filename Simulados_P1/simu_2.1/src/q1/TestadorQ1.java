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
		Funcionario barbara = new Funcionario("Barbara", 10000000, null);
		Funcionario aline = new Funcionario("Aline", 1400, null);
		Funcionario rayssa = new Funcionario("Rayssa", 98000000, null);
		Funcionario malu = new Funcionario("Malu", 700, null);

		Empresa barbaraCorp = new Empresa("BarbaraCorp");

		Departamento roblox = new Departamento("roblox");
		barbaraCorp.addDepartamento(roblox);
		Setor robux = new Setor("robux");
		roblox.addSetor(robux);
		robux.addFuncionario(malu);
		robux.addFuncionario(barbara);
		
		Departamento minecraft = new Departamento("minecraft");
		barbaraCorp.addDepartamento(minecraft);
		Setor update = new Setor("update");
		minecraft.addSetor(update);
		update.addFuncionario(aline);
		update.addFuncionario(rayssa);

		System.out.println(barbaraCorp);

		rayssa.changeSetor(robux);
		System.out.println(barbaraCorp);
	}

}
