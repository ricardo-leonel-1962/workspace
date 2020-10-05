package br.com.universidade_leonel.modelo;

public class Aluno {
	/* Design Patterns (padroes de melhores praticas para projetos com OO)
	 * DTO (Data Transfer Object) -> melhores praticas para os modelos
	 * 1o - sugere q todos atributos devem ser privados
	 * 2o - sugere q cada atributo deve ter seu metodo (getter=input(preencher) e setter=output(exibir)) 
	 * 3o - sugere q  
	 *--------------------------------------------------------------------------------------------------
	*/
	private int rm;
	private String nome;
	private String email;
	private Endereco endereco;
	// para exibir todas as informacoes ao mesmo tempo - criado manualmente
		public String getAll() {
			return
					"Matricula: " + rm + "\n" +
					"Nome.....: " + nome + "\n" +
					"Email....: " + email + "\n" +
					"Endereco.: " + endereco.getAll();
		}
	// para preencher todas as informacoes ao mesmo tempo - criado manualmente
	public void setAll(int p1, String p2, String p3, Endereco p4) {
		rm=p1;
		nome=p2;
		email=p3;
		endereco=p4;
	}
	// No menu - Source; Generate Getters and Setters
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
