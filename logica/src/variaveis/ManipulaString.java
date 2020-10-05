package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		/*
		 * String e do tipo Referencia
		 */

		String email = JOptionPane.showInputDialog("email:");
		System.out.println("email original: " + email);
		System.out.println("email minusculo: " + email.toLowerCase());
		System.out.println("email minusculo: " + email.toUpperCase());
		System.out.println("posicao do @: " + email.indexOf("@"));
		System.out.println("existe o @?: " + email.contains("@"));
		System.out.println("caracteres: " + email.length());
		System.out.println("parte do 2o ao 4o: " + email.substring(1,4));
		// rleonel@bol.com.br
		// 012345678...
		System.out.println("parte do 2o tudo: " + email.substring(1));
		System.out.println("usuario: " + email.substring(0,email.indexOf("@")));
		System.out.println("servidor: " + email.substring(email.indexOf("@")+1));
		System.out.println("dominio: " + email.substring(email.indexOf("@")+1,email.indexOf(".com")));
		System.out.println("1a metade: " + email.substring(0,email.length()/2));
		System.out.println("1a metade: " + email.length()/2);
		System.out.println("Comparacao: " + email.equals("abc@xpto.com.br"));
		System.out.println("Comparacao sem case: " + email.equalsIgnoreCase("abc@xpto.com.br"));
		
	}

}
