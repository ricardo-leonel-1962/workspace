package Repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeral {

	public static void main(String[] args) {
		/*
		 * Solicitar nome e idade e perguntar se quer continuar
		 * exibir a qtde de pessoas maiores de idade (1)
		 * exibir a media de idade de todas (2)
		 * exibir a pessoa + velha
		 * exibir a pessoa + nova
		 */
		String nome = "";
		int idade = 0;
		char resposta = 0;
		int qtdemaioresdeidade = 0;
		int qtdenomedigitado = 0;
		int somadeidade = 0;
		int mediadeidade = 0;
		String nomeJovem = "";
		String nomeIdosa = "";
		int idadeJovem = 0;
		int idadeIdosa = 0;
		do {
			nome = JOptionPane.showInputDialog("Nome: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
			qtdenomedigitado++;
			somadeidade = somadeidade + idade;
		 
			if (idade>=17) {
				qtdemaioresdeidade++;
								
			}
			if (idade>idadeIdosa) {
				nomeIdosa = nome;
				idadeIdosa = idade;
			}
			if (idade<idadeJovem || qtdenomedigitado==1) {
				nomeJovem = nome;
				idadeJovem = idade;
			}
		resposta = JOptionPane.showInputDialog("Digite S para continuar: ").toUpperCase().charAt(0);
		}while(resposta=='S');
		mediadeidade = somadeidade / qtdenomedigitado; 
		System.out.println("Maiores de idade: " + qtdemaioresdeidade);
		System.out.println("Media de idade: " + mediadeidade);
		System.out.println("Mais idoso: " + nomeIdosa + " com " + idadeIdosa);
		System.out.println("Mais jovem: " + nomeJovem + " com " + idadeJovem);
	}

}
