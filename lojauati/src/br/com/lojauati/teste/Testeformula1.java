package br.com.lojauati.teste;

import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Formula1;

public class Testeformula1 {

	public static void main(String[] args) {
		
		// Formula1 objeto = // criando um objeto (vide diagrama UML)
		// objeto.preencherEscuderia("ferrari"); NAO FUNCIONA
		// Formula1 carro = new Formula1 (new formula1 aloca na memoria os preencher)
		
		// input
		Formula1 carro = new Formula1(); // instanciando (atribuindo um valor) um objeto
		carro.preencherEscuderia(JOptionPane.showInputDialog("Digite a Escuderia"));
		carro.preencherRpm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RPM")));
		carro.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor")));
		// output
		System.out.println("Escuderia.." + carro.exibirEscuderia());
		System.out.println("RPM........" + carro.exibirRpm());
		System.out.println("Valor......" + carro.exibirValor());
		}

}
