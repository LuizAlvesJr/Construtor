package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*New Aluno() é uma instancia (Criação de objeto)*/
		/*Aluno1 é uma referencia para o ibejto aluno*/
		Aluno aluno1 =new Aluno(); /*Aqui sera o joão*/
		aluno1.setNome ("João");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("19/05/1991");
		aluno1.setRegistroGeral("398.234.4432-32");
		aluno1.setNumeroCpf("321.433.543-43");
		aluno1.setNomeMae("Carla");
		aluno1.setNomePai("Antonio");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNoeEscola("Escola JDEV treinamento");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.6);
		aluno1.setNota4(60.8);
		
		System.out.println("Nome é = "+ aluno1.getNome());
		System.out.println("A idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.printf("A nota média do aluno = "+ "%.2f",aluno1.getMediaNota());
		System.out.println("Resultado = "+ aluno1.getAlunoAprovado());
		
		/*================================================================*/
	
		/*Agora temos um objeto real na memória*/
		Aluno aluno2 = new Aluno();/*Aqui sera o pedro*/
		
		Aluno aluno3 = new Aluno();/*Aqui sera o alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno ("José", 50);
	}

}