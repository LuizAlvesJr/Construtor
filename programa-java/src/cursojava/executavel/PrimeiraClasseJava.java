package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*New Aluno() � uma instancia (Cria��o de objeto)*/
		/*Aluno1 � uma referencia para o ibejto aluno*/
		Aluno aluno1 =new Aluno(); /*Aqui sera o jo�o*/
		aluno1.nome = "Jo�o";
		aluno1.idade = 50;
		
		System.out.println("Nome do aluno 1 � = " + aluno1.nome);
		System.out.println("Idade do aluno "+ aluno1.idade);
		/*Agora temos um objeto real na mem�ria*/
		Aluno aluno2 = new Aluno();/*Aqui sera o pedro*/
		
		Aluno aluno3 = new Aluno();/*Aqui sera o alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno ("Jos�", 50);
	}

}
