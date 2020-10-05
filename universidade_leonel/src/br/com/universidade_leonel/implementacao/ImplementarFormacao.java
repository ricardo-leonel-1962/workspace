package br.com.universidade_leonel.implementacao;

import br.com.universidade_leonel.modelo.Bacharelado;
import br.com.universidade_leonel.modelo.Formacao;
import br.com.universidade_leonel.modelo.Magica;
import br.com.universidade_leonel.modelo.Medio;
import br.com.universidade_leonel.modelo.Pos;

public class ImplementarFormacao {

	public static void main(String[] args) {
		Formacao formacao = new Medio();

		char resp = Magica.s("Digite\n<1> Medio\n<2> Bacharelado\n<3> Pos").charAt(0);
		if (resp=='1') {
			formacao = new Medio(
					Magica.f("Valor......:"),
					Magica.s("Descricao..:"),
					Magica.i("Duracao....:"),
					Magica.i("Tipo.......:")
			
					);
		}else if (resp=='2') {
			formacao = new Bacharelado(
					Magica.f("Valor......:"),
					Magica.s("Descricao..:"),
					Magica.i("Duracao....:"),
					Magica.s("Projeto Conclusao.:"),
					Magica.i("Carga Horario.:")
			
					);
		}else if (resp=='3') {
			formacao = new Pos(
					Magica.f("Valor......:"),
					Magica.s("Descricao..:"),
					Magica.i("Duracao....:"),
					Magica.s("Projeto Conclusao.:"),
					Magica.b("Plano Estendido:")
					
					);
		}else
			System.out.println("Opcao Invalida");
	}

}
