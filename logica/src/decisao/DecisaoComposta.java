package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		// Verifica o True e o False
		String nome = JOptionPane.showInputDialog("Nome do Aluno: ");
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas: "));
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota2: "));
		float media = (nota1 + nota2) / 2;
		System.out.println("Aluno: " + nome + " sua media foi " + media);
				
		if (media>=6 && faltas<=20) {
			System.out.println("Parabens " + nome + " voce esta aprovado");
		}else if (media<4 || faltas<20) {
			System.out.println("Infelizmente " + nome + " voce foi reprovado");
		}else if (faltas<=20) {
			System.out.println(nome + " voce ainda tem chance no exame.");
		}
	}

}
