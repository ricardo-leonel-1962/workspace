package br.com.universidade_leonel.modelo;

import br.com.universidade_leonel.padroes.PadraoFormacao;

public class Pos extends Formacao implements PadraoFormacao {
	/* Design Patterns (padroes de melhores praticas para projetos com OO)
	 * DTO (Data Transfer Object) -> melhores praticas para os modelos
	 * 1o - sugere q todos atributos devem ser privados
	 * 2o - sugere q cada atributo deve ter seu metodo (getter=input(preencher) e setter=output(exibir)) 
	 * 3o - sugere q  
	 *--------------------------------------------------------------------------------------------------
	*/
	
	private String nivel;
	private boolean planoEstendido;
	
	public Pos(float valor, String descricao, int duracao, String nivel, boolean planoEstendido) {
		super(valor, descricao, duracao);
		this.nivel = nivel;
		this.planoEstendido = planoEstendido;
	}

	
	
	public Pos() {
		super();
	}

	public void setAll(String nivel, boolean planoEstendido) {
		this.nivel = nivel;
		this.planoEstendido = planoEstendido;
	}
	
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}
	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}



	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/18 * fator;
	}



	@Override
	public void definirDuracao() {
		setDuracao(18);
		
	}
	
}

