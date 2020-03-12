package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*New Aluno() é uma instancia (Criação de objeto)*/
		/*Aluno1 é uma referencia para o ibejto aluno*/
		Aluno aluno1 =new Aluno(); /*Aqui sera o joão*/
		aluno1.nome = "João";
		aluno1.idade = 50;
		
		System.out.println("Nome do aluno 1 é = " + aluno1.nome);
		System.out.println("Idade do aluno "+ aluno1.idade);
		/*Agora temos um objeto real na memória*/
		Aluno aluno2 = new Aluno();/*Aqui sera o pedro*/
		
		Aluno aluno3 = new Aluno();/*Aqui sera o alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno ("José", 50);
	}

}
