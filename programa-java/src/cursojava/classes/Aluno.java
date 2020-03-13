package cursojava.classes;

/*Esta é nossa classe?objeto que representa o Aluno*/

public class Aluno {

		/*Esses são atributos do aluno*/
	private String nome;
	private int idade;
	private	String dataNascimento;
	private	String registroGeral;
	private	String numeroCpf;
	private	String nomeMae;
	private	String nomePai;
	private	String dataMatricula;
	private	String noeEscola;
	private	String serieMatriculado;

		public Aluno() { /*Cria dos dados na memoria - sendo padrao do java*/
			
		}
		
		public Aluno(String nomePadrao) {
			nome = nomePadrao;
		}
		
		public Aluno (String nomePadrao,int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}
		
		/*Veremos o metodo SETTERS e GETTERS do Objeto*/
		/*Set é para adicionar ou receber dados para os atributos*/
		/*GET é para resgatar ou obter o valor do atributos*/
		
		/*Recebe dados*/
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;								
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getRegistroGeral() {
			return registroGeral;
		}

		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}

		public String getNumeroCpf() {
			return numeroCpf;
		}

		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}

		public String getDataMatricula() {
			return dataMatricula;
		}

		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		public String getNoeEscola() {
			return noeEscola;
		}

		public void setNoeEscola(String noeEscola) {
			this.noeEscola = noeEscola;
		}

		public String getSerieMatriculado() {
			return serieMatriculado;
		}

		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}
		
		
		
		
		
		
		
		
		
}

	