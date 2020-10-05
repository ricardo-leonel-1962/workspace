package br.com.universidade_leonel.modelo;

import br.com.universidade_leonel.padroes.PadraoFormacao;

public abstract class Formacao implements PadraoFormacao {
	/* Design Patterns (padroes de melhores praticas para projetos com OO)
	 * DTO (Data Transfer Object) -> melhores praticas para os modelos
	 * 1o - sugere q todos atributos devem ser privados
	 * 2o - sugere q cada atributo deve ter seu metodo (getter=input(preencher) e setter=output(exibir)) 
	 * 3o - sugere q  
	 *--------------------------------------------------------------------------------------------------
	 * Polimorfismo: metodos com omesmo nome e coes diferentes.
	 * Overload: (sobrecarga) quando os metidos estao na mesma classe. (Formula1 usou - Exibir Promocao)
	 * Override: (sobrescrita): qiuando os metodos estao em classes diferentes.
	 * *--------------------------------------------------------------------------------------------------
	 * Esta 'e a super class 
	*/
	
	private float valor;
	private String descricao;
	private int duracao;

	public void setAll(float valor, String descricao, int duracao) {
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	
	public Formacao() {

	}
	
	public Formacao(float valor, String descricao, int duracao) {
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	
	public String getAll() {
		return
		"Valor....: " + valor + "\n" +
		"Descricao: " + descricao + "\n" +
		"Duracao..: \n" + duracao;
		}
	
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public double calcularMensalidade(float fator) {
		return 0;
	}

	@Override
	public void definirDuracao() {
				
	}
	
	
}

