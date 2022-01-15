package teste;

public class UsaFuncionario {

	public static void main(String[] args) {
		System.out.println("oi");
		
		Funcionario f = new Funcionario();
		
		f.setNome("Ares");
		f.setSalario(4000);
		
		System.out.println("Nome: " + f.getNome());
		System.out.println("Salário: " + f.getSalario());
	}

}
