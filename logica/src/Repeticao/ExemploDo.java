package Repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
		char opcao = JOptionPane.showInputDialog("Digite o operador: ").charAt(0);
		if (opcao=='+') {
			System.out.println("Soma: " + (valor1+valor2));
		}else if (opcao=='-') {
			System.out.println("Subtracao: " + (valor1-valor2));
		}else if (opcao=='*') {
			System.out.println("Multiplicacao: " + (valor1*valor2));
		}else if (opcao=='/') {
			System.out.println("Divisao: " + (valor1/valor2));
		}else {
			System.out.println("Opcao invalida: ");
		}		
	}

}
