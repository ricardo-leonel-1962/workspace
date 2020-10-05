package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {
		// Solicitar os dados:
		// Nome do Produto
		// Qtde
		// Valor
		// Exibir o total e o nome do produto
		// Exibir o total com 10% de desconto
		
		String produto = JOptionPane.showInputDialog("Produto: ");
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
		double total = valor*qtde;
		System.out.println("Total..: " + total + " - Produto:" + produto);
		System.out.println("Com desconto..: " + (total*0.9));
					
	}

}
