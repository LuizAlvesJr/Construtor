package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* New Aluno() é uma instancia (Criação de objeto) */
		/* Aluno1 é uma referencia para o ibejto aluno */

		Aluno aluno1 = new Aluno();
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("QUal a idade do aluno? ");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual o RG?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe? ");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai? ");
		String matricula = JOptionPane.showInputDialog("Data matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String escola = JOptionPane.showInputDialog("Nome da escola?");
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matemática");
		disciplina2.setNota(80);
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(70);
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 =  new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(75);
		aluno1.getDisciplinas().add(disciplina4);
		
		
		
		
//
//		System.out.println("Nome é = " + aluno1.getNome());
//		System.out.println("A idade é = " + aluno1.getIdade());
//		System.out.println("Nascimento = " + aluno1.getDataNascimento());
//		System.out.println("RG = " + aluno1.getRegistroGeral());
//		System.out.println("CPF = " + aluno1.getNumeroCpf());
//		System.out.println("Nome da mãe = " + aluno1.getNomeMae());
//		System.out.println("Nome do Pai = " + aluno1.getNomePai());
//		System.out.println("Data da matricula = " + aluno1.getDataMatricula());
//		System.out.println("Serie matriculada = " + aluno1.getSerieMatriculado());
//		System.out.println(" = " + aluno1.getSerieMatriculado());
//		System.out.println("Serie matriculada = " + aluno1.getSerieMatriculado());
//		System.out.println("Nome escola = " + aluno1.getNomeEscola());
//		System.out.printf("A nota média do aluno = " + "%.2f", aluno1.getMediaNota());
//		System.out.println();
//		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

		Aluno aluno = new Aluno();

		System.out.println(aluno1.toString());
		System.out.println("Media Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
		

	}

}