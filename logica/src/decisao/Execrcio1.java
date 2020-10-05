package decisao;

import javax.swing.JOptionPane;

public class Execrcio1 {

	public static void main(String[] args) {
		// Pedir nome do cliente, valor investido, tempo (anos) de fidelidade
		// regiao (Brasil) onde mora
		// Se a regiao for sul ou sudeste (somar 20% no tempo de fidelidade)
		// Se o valor investido for menor 1000, acrescer 1.5% no valor
		// Se o valor investido for entre 1000 e 5000 acrescer 2%
		// Se o valor investido for > 5000 acrescer 3%
		// Se a fidelidade >5 anos acrescer 1% no valor investido
		// No final exibir o valor investido atualizado de acordo com o perfil
		// do usuario e a diferen'ca que foi obtido entre o valor investido e o valor atual (2h40)
		// depois lista 2 do github
		// ! significa negacao
		String nome = JOptionPane.showInputDialog("Nome do Cliente: ");
		String regiao = JOptionPane.showInputDialog("Regiao do Cliente: ").toUpperCase();
		short fidelidade = Short.parseShort(JOptionPane.showInputDialog("Tempo investido (anos): "));
		float valori = Float.parseFloat(JOptionPane.showInputDialog("Valor investido: "));
		float valora = 0;
		
		if (regiao.equals("SUL") || regiao.equals("SUDESTE")) {
			fidelidade = (short) (fidelidade * 1.20);
		//	fidelidade *= (short) 1.20);  // multiplica pelo valor da variavel
		}
		if (valori<1000) {
			valora = valori * (float) 1.015;
		}else if (valori>5000) {
			valora = valori * (float) 1.03;
		}else {
			valora = valori * (float) 1.02;
		}
		if (fidelidade>5) {
			valora = valora * (float) 1.01;
		}
		System.out.println("Nome do Cliente: " + nome);
		System.out.println("Regiao do cliente: " + regiao);
		System.out.println("Valor investido: " + valori);
		System.out.println("Valor diferenca: " + (valora - valori));
		System.out.printf("Valor diferenca: %.2f\n", + (valora - valori));
		System.out.println("Valor total: " + valora);
		System.out.println("Tempo fidelidade: " + fidelidade);
		System.out.printf("SR %s, sua regiao %s, gerou rendimento de %.2f\n", nome, regiao, valora);
				
	} // fecha o metodo

} // fecha a classe  
