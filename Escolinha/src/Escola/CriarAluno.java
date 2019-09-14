package Escola;

public class CriarAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "Juliana";		
		aluno1.idade = 34;
		aluno1.nota1 = 7.5;
		aluno1.nota2 = 8.2;
		
		Aluno aluno2 = new Aluno();
		
		aluno2.nome = "Roberta";
		aluno2.idade = 25;
		aluno2.nota1= 8.5;
		aluno2.nota2 = 9.0;
		
		double media1 = (aluno1.nota1 + aluno1.nota2)/2;
		double media2 = (aluno2.nota1 + aluno2.nota2)/2;
		
		System.out.println("Primeiro aluno");
		System.out.println("Nome: + aluno1.nome");
		System.out.println("Idade: + aluno1.idade");
		System.out.println("Nota1: = aluno1,nota1");
		System.out.println("Nota2: + aluno1.nota2");
		
		System.out.println();
		
		System.out.println("Segundo aluno");
		System.out.println("Nome:" + aluno2.nome);
		System.out.println("Idade:" + aluno2.idade);
		System.out.println("Nota1:" + aluno2.nota1);
		System.out.println("Nota2" + aluno2.nota2)
		System.out.println("Média: " + media2);
	}

}
