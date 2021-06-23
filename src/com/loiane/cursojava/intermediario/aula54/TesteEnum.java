package com.loiane.cursojava.intermediario.aula54;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemanaEnum dia = DiaSemanaEnum.DOMINGO;

		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(22, 6, 2021, DiaSemanaEnum.TERCA);
	}

}
