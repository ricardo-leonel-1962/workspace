package br.com.lojauati.teste;

import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Elevador;

public class Testeelevador {

	public static void main(String[] args) {
		
		Elevador objeto = new Elevador(25,100); // instanciando (atribuindo um valor) o objeto
		// input
		//objeto.preencherQpessoas(Integer.parseInt(JOptionPane.showInputDialog("Capacidade Maxima: ")));
		objeto.preenchermenorAndar(Integer.parseInt(JOptionPane.showInputDialog("Menor Andar......: ")));
		//objeto.preenchermaiorAndar(Integer.parseInt(JOptionPane.showInputDialog("Maior Andar......: ")));
		objeto.preencherEntrar(Integer.parseInt(JOptionPane.showInputDialog("Quantas entram......: ")));
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.preencherSair(Integer.parseInt(JOptionPane.showInputDialog("Quantas saem......: ")));
		objeto.descer();
		// output	
		System.out.println(objeto.exibirTudo());
		
	}
}
