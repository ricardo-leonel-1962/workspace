package br.com.universidade_leonel.modelo;

public class Professor {
	/* Design Patterns (padroes de melhores praticas para projetos com OO)
	 * DTO (Data Transfer Object) -> melhores praticas para os modelos
	 * 1o - sugere q todos atributos devem ser privados
	 * 2o - sugere q cada atributo deve ter seu metodo (getter=input(preencher) e setter=output(exibir)) 
	 * 3o - sugere q  
	 *--------------------------------------------------------------------------------------------------
	*/
	private int id;
	private String nome;
	private float valorHora;
	private String formacao;
	private Endereco endereco;
	// para exibir todas as informacoes ao mesmo tempo - criado manualmente
			public String getAll() {
				return
						"Id.........: " + id + "\n" +
						"Nome.......: " + nome + "\n" +
						"Valor Hora.: " + valorHora + "\n" +
						"Formacao...: " + formacao + "\n" +
						"Endereco...: " + endereco.getAll();
			}
	// para preencher todas as informacoes ao mesmo tempo - criado manualmente
		public void setAll(int id, String nome, float valorHora, String formacao, Endereco endereco) {
			this.id=id;
			this.nome=nome;
			this.valorHora=valorHora;
			this.formacao=formacao;
			this.endereco=endereco;
		}
		
		public void setAll() {}
	//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
