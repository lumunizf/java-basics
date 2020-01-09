package com.lumunizf.cursojava.aula11;

public class curiosidadeInt {

	public static void main(String[] args) {
		int var1 = 2147483647; // valor máximo do tipo int
		int var2 = 100; // somar mais 100 
		System.out.println(var1 + var2); // printar o valor máximo de uma variável + 100
		// O que ocorre neste caso?
		// Não vai dar erro e nem mensagem de alerta, o resultado cairá nos números negativos.

	}

}
