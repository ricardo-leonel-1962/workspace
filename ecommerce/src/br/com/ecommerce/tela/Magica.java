package br.com.ecommerce.tela;

import javax.swing.JOptionPane;

public class Magica {
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}

	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
}