
public class Teste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Mario");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p1.setIdade(19);
		p1.setSexo("Masculino");
		
		System.out.println(p1.toString());
		
		
	}

}
