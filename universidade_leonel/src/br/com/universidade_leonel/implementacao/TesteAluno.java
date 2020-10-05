package br.com.universidade_leonel.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade_leonel.modelo.Aluno;
import br.com.universidade_leonel.modelo.Endereco;

public class TesteAluno {

	public static void main(String[] args) {
		Endereco end = new Endereco();
		Aluno aluno = new Aluno();
		aluno.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Matricula")), 
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				JOptionPane.showInputDialog("Email").toLowerCase(),
				end
				);
		end.setLogradouro(JOptionPane.showInputDialog("Endereco").toUpperCase());
		end.setBairro(JOptionPane.showInputDialog("Bairro").toUpperCase());
		end.setCidade(JOptionPane.showInputDialog("Cidade").toUpperCase());
		System.out.println(aluno.getAll());

	}

}
