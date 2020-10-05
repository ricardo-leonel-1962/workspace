package br.com.universidade_leonel.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade_leonel.modelo.Endereco;
import br.com.universidade_leonel.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		Endereco end = new Endereco();
		Professor prof = new Professor();
		prof.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Id")), 
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Hora")), 
				JOptionPane.showInputDialog("Formacao").toLowerCase()
				);
		prof.setId(Integer.parseInt(JOptionPane.showInputDialog("Id")));
		prof.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		prof.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Valor Hora"))); 
		prof.setFormacao(JOptionPane.showInputDialog("Formacao").toLowerCase());
		end.setLogradouro(JOptionPane.showInputDialog("Endereco").toUpperCase());
		end.setBairro(JOptionPane.showInputDialog("Bairro").toUpperCase());
		end.setCidade(JOptionPane.showInputDialog("Cidade").toUpperCase());
		System.out.println("Id........: " + prof.getId());
		System.out.println("Nome......: " + prof.getNome());
		System.out.println("Valor Hora: " + prof.getValorHora());
		System.out.println("Formacao..: " + prof.getFormacao());
		System.out.println(prof.getAll());
	}

}
