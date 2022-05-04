

import javax.swing.JOptionPane;

public class desafio2 {
	
	public static void main (String []args) {
		
		int x = 3; 
		int alunos = 0;
		String[] chegada = new String[5];
	
		
		chegada[0] = JOptionPane.showInputDialog("Em quanto tempo chegou o primeiro aluno?");
		double aluno1 = Double.parseDouble(chegada[0]);
		chegada[1] = JOptionPane.showInputDialog("Em quanto tempo chegou o segundo aluno?");
		double aluno2 = Double.parseDouble(chegada[1]);
		chegada[2] = JOptionPane.showInputDialog("Em quanto tempo chegou o segundo aluno?");
		double aluno3 = Double.parseDouble(chegada[2]);
		chegada[3] = JOptionPane.showInputDialog("Em quanto tempo chegou o quarto aluno?");
		double aluno4 = Double.parseDouble(chegada[3]);
		chegada[4] = JOptionPane.showInputDialog("Em quanto tempo chegou o 	quinto aluno?");
		double aluno5 = Double.parseDouble(chegada[4]);
		
		if (aluno1 <= 0) {
			alunos = alunos+1;
			System.out.println("Temos " + alunos + " alunos em sala" );
		}
		if (aluno2 <= 0) {
			alunos = alunos+1;
			System.out.println("Temos " + alunos + " alunos em sala" );
		}
		if (aluno3 <= 0) {
			alunos = alunos+1;
			System.out.println("Temos " + alunos + " alunos em sala" );
		}
		if (aluno4 <= 0) {
			alunos = alunos+1;
			System.out.println("Temos " + alunos + " alunos em sala" );
		}
		if (aluno5 <= 0) {
			alunos = alunos+1;
			System.out.println("Temos " + alunos + " alunos em sala" );
		}
		if (alunos >= x) {
		 System.out.println("Aula normal");
		}
		 else
		 {
			 System.out.println("Aula cancelada");
		 }
	}
}
