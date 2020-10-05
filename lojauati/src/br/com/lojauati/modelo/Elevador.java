package br.com.lojauati.modelo;

public class Elevador {
	// sintaxe para criacao de metodos no java
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>) {...} 
	// modificadores do diagrama UML -> private (-) public (+) ...
	
	private int qtdePessoas;
	private int capacidadePessoas;
	private int andarAtual;
	private int maiorAndar;
	private int menorAndar;
	// construtor eh uma instrucao 
	public Elevador() {}
	public Elevador(int cp, int ma) {
		capacidadePessoas=cp;
		maiorAndar=ma;
	}
	
	public String exibirTudo() {
		return
				"Capacidade Maxima :" + capacidadePessoas + "\n" +
				"Qtde Pessoas Atual:" + qtdePessoas + "\n"       +
				"Andar Atual...... :" + andarAtual + "\n"        +
				"Maior Andar...... :" + maiorAndar + "\n"        +
				"Menor Andar...... :" + menorAndar;
	}
	//
	public void preencherSair(int pCirc) {
		if (pCirc<=qtdePessoas)
		qtdePessoas=qtdePessoas-pCirc;
		}
	//
	public void preencherEntrar(int pCirc) {
		if ((qtdePessoas+pCirc)<=capacidadePessoas)
		qtdePessoas=qtdePessoas+pCirc;
		}
	//
	public void descer() {
		if (andarAtual>menorAndar)
		andarAtual--;
	}
	//
	public void subir() {
		if (andarAtual<maiorAndar)
		andarAtual++;
	}
	//
	public void preenchermaiorAndar(int pAndar) {
		if (pAndar>maiorAndar) {
		maiorAndar=pAndar;
		}
	}
	//
	public void preenchermenorAndar(int pAndar) {
		if (pAndar<maiorAndar) {
		menorAndar=pAndar;
		}
	}
	//
	public void preencherQpessoas(int qPessoas) {
		if (qPessoas>0) {
		capacidadePessoas=qPessoas;
		}
	}
	//
}
