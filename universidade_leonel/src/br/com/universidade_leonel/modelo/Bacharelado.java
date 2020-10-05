package br.com.universidade_leonel.modelo;

import br.com.universidade_leonel.padroes.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao  {
	/* Design Patterns (padroes de melhores praticas para projetos com OO)
	 * DTO (Data Transfer Object) -> melhores praticas para os modelos
	 * 1o - sugere q todos atributos devem ser privados
	 * 2o - sugere q cada atributo deve ter seu metodo (getter=input(preencher) e setter=output(exibir)) 
	 * 3o - sugere q  
	 *--------------------------------------------------------------------------------------------------
	*/
	
	
	private String projetoConclusao;
	private int cargaHorarioEstagio;

	public void setAll() {}
	
	public void setAll(float valor, String descricao, int duracao, String projetoConclusao, int cargaHorarioEstagio) {
		super.setAll(valor, descricao, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}
	
	public Bacharelado(float valor, String descricao, int duracao, String projetoConclusao, int cargaHorarioEstagio) {
		super(valor, descricao, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}

	public Bacharelado() {
		super();
	}

	public void setAll(String projetoConclusao, int cargaHorarioEstagio) {
		this.projetoConclusao = projetoConclusao;
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}
	
	
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorarioEstagio() {
		return cargaHorarioEstagio;
	}
	public void setCargaHorarioEstagio(int cargaHorarioEstagio) {
		this.cargaHorarioEstagio = cargaHorarioEstagio;
	}

	@Override
	public double calcularMensalidade(float fator) {
		return getValor()/48 * fator;
	}

	@Override
	public void definirDuracao() {
		setDuracao(48);
		
	}
	
	

}

