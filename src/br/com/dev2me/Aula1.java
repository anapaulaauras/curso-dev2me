package br.com.dev2me;

import javax.swing.JOptionPane;

public class Aula1 {

	public static void main(String[] args) {
		int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite seu numero 1"));
		int n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite seu numero 2"));
		
		int soma = 0;
		soma = n1 + n2;
		
		System.out.println(soma);

	}

}
