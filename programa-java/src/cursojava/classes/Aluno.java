package cursojava.classes;

/*Esta é nossa classe/objeto que representa o Aluno*/

public class Aluno {

		String nome;
		int idade;
		String dataNascimento;
		String registroGeral;
		String numeroCpf;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String noeEscola;
		String serieMatriculado;

		public Aluno() { /*Cria dos dados na memoria - sendo padrao do java*/
			
		}
		
		public Aluno(String nomePadrao) {
			nome = nomePadrao;
		}
		
		public Aluno (String nomePadrao,int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}

}

	