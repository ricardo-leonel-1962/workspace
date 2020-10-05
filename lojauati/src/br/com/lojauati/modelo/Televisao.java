package br.com.lojauati.modelo;

public class Televisao {
	// sintaxe para criacao de metodos no java
	// <modificador> <tipo do retorno> <nome do metodo> (<tipo do param> <nome do param>) {...} 
	// modificadores do diagrama UML -> private (-) public (+) ...
	
	private int canal;
	private boolean status;
	private int volume;
	
	public String exibirTudo() {
		String estado="DESLIGADA";
		if (status=true) {
			estado="LIGADA";
		}
		return
				"Status...: " + estado + "\n" +
				"Canal....: " + canal + "\n" +
				"Volume...: " + volume;
	}
	public boolean exibirStatus() {
		return status;
	}
}


