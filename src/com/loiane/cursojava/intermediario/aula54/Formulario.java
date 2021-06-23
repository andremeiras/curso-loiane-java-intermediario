package com.loiane.cursojava.intermediario.aula54;

public class Formulario {
	
	enum Genero {
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		private Genero(char valor) {
			this.valor = valor;
		}
	}
	
	private String nome;
	private Genero genero;

}
