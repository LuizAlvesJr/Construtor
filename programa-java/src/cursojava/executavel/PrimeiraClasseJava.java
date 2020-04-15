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
		
		for (int pos = 1; pos <= 4; pos ++) {
			
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+ pos +" ?" );
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+ pos +" ?");
					
			Disciplina disciplina =  new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
		
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue( )-1);
		}
		
		
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