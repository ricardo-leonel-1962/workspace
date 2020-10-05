package br.com.lojauati.teste;

import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Televisao;

public class Testetelevisao {

	public static void main(String[] args) {
		
		Televisao objeto = new Televisao(); // instanciando (atribuindo um valor) o objeto
		// input
		objeto.preencherComando(JOptionPane.showInputDialog("Ligar(L) ou Desligar(D): "));
		//objeto.preenchermenorAndar(Integer.parseInt(JOptionPane.showInputDialog("Menor Andar......: ")));
		//objeto.preenchermaiorAndar(Integer.parseInt(JOptionPane.showInputDialog("Maior Andar......: ")));
		//objeto.preencherEntrar(Integer.parseInt(JOptionPane.showInputDialog("Quantas entram......: ")));
		//objeto.subir();
		//objeto.subir();
		//objeto.subir();
		//objeto.preencherSair(Integer.parseInt(JOptionPane.showInputDialog("Quantas saem......: ")));
		//objeto.descer();
		// output	
		System.out.println(objeto.exibirTudo());
		
	}
}
