package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		// Solicitar Nome e Idade
		// "E obrigado a votar" => >= a 18 e <=70
		// "Voto facultativo" => 16, 17 ou mais que 70
		// "Nao pode votar" <16
		// = e atribuicao e == e comparacao
		String nome = JOptionPane.showInputDialog("Nome do Eleitor: ");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade do Eleitor: "));
		
		if (idade<16) {
			System.out.println("Nao pode votar " + nome);
		}
		if (idade>=18 && idade<=70) {
			System.out.println("Voto obrigatorio " + nome);
		}
		if (idade==16 || idade==17 || idade>70) {
			System.out.println("Voto facultativo " + nome);
		}
	}

}
