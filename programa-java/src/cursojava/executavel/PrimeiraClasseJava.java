package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*New Aluno() � uma instancia (Cria��o de objeto)*/
		/*Aluno1 � uma referencia para o ibejto aluno*/
		Aluno aluno1 =new Aluno(); /*Aqui sera o jo�o*/
		aluno1.setNome ("Jo�o");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("19/05/1991");
		aluno1.setRegistroGeral("398.234.4432-32");
		aluno1.setNumeroCpf("321.433.543-43");
		aluno1.setNomeMae("Carla");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNoeEscola("Escola JDEV treinamento");
		
		
		System.out.println("Nome � = "+ aluno1.getNome());
		System.out.println("A idade � = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		
		/*================================================================*/
	
		/*Agora temos um objeto real na mem�ria*/
		Aluno aluno2 = new Aluno();/*Aqui sera o pedro*/
		
		Aluno aluno3 = new Aluno();/*Aqui sera o alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno ("Jos�", 50);
	}

}