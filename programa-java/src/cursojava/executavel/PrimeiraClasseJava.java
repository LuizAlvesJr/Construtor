package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Obejeto ainda n�o existe*/
		
		Aluno aluno1 =new Aluno(); /*Aqui sera o jo�o*/
	
		/*Agora temos um objeto real na mem�ria*/
		Aluno aluno2 = new Aluno();/*Aqui sera o pedro*/
		
		Aluno aluno3 = new Aluno();/*Aqui sera o alex*/
		
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno ("Jos�", 50);
	}

}
