package variaveis;

public class Primitivos {

	public static void main(String[] args) {
		/*
		 * Tipos primitivos em ordem hierarquica (menor ocup de memoria para maior):
		 * boolean => tipo logico (true ou false)
		 * char => armazena UM caracter (aspas simples)
		 * byte => menor entre inteiros (-127 ate +127)
		 * short => numeros inteiros (-32k ate + 32k)
		 * int => numeros inteiros (default)
		 * long => maior entre os inteiros (CPF)
		 * float = menor precisao nas casas decimais (ate 4 casas dec)
		 * double = maior precisao nas casas decimais (default)
		 */
		
		boolean gravida = true;
		char sexo = 'M';
		byte golsVisitante = 0;
		short qtdeCestas=0;
		long cpf=0;
		float nota=0;
		double valorLitroCombustivel=0;
		float desconto = 500 * (float) 0.9; 
		// (double (0.9) nao cabe em um float (500);
		// tem q fazer um cast (conversao com tipos compativeis) dizendo float ante do numero
		cpf = (long) 1.5;

	}

}
