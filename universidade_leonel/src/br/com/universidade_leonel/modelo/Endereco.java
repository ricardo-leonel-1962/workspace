package br.com.universidade_leonel.modelo;

public class Endereco {
	/* Design Patterns (padroes de melhores praticas para projetos com OO)
	 * DTO (Data Transfer Object) -> melhores praticas para os modelos
	 * 1o - sugere q todos atributos devem ser privados
	 * 2o - sugere q cada atributo deve ter seu metodo (getter=input(preencher) e setter=output(exibir)) 
	 * 3o - sugere q  
	 *--------------------------------------------------------------------------------------------------
	*/
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String numero;
	private String complemento;
	// para exibir todas as informacoes ao mesmo tempo - criado manualmente
			public String getAll() {
				return
						"Logradouro.: " + logradouro + "\n" +
						"Bairro.....: " + bairro + "\n" +
						"Cidade.....: " + cidade + "\n" +
						"Estado.....: " + estado + "\n" +
						"CEP........: " + cep + "\n" +
						"Numero.....: " + numero + "\n" +
						"Complemento: " + complemento + "\n";
			}
		// para preencher todas as informacoes ao mesmo tempo - criado manualmente
		public void setAll(String logradouro, String bairro, String estado,
				String cep, String numero, String complemento) {
			this.logradouro=logradouro;
			this.bairro=bairro;
			this.cidade=cidade;
			this.estado=estado;
			this.cep=cep;
			this.numero=numero;
			this.complemento=complemento;
		}
	// No menu - Source; Generate Getters and Setters7
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
