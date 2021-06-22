package com.loiane.cursojava.intermediario.aula53;

public class Teste {
	
	public static void main(String[] args) {
		
		System.out.println("--------- UTILIZANDO CONSTANTES ------------");
		usandoConstantes();
		
		System.out.println();
		
		System.out.println("--------- UTILIZANDO ENUM ------------");
		usandoEnum();
	}

	private static void usandoConstantes() {
		
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta= DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado= DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java");
		
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
		
	}
	
	
	private static void usandoEnum() {
		DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
		DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
		DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
		DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
		DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
		DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
		DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;
		
		System.out.println("Teste utilizando enum no Java");
			
		imprimeDiaSemanaEnum(segunda);
		imprimeDiaSemanaEnum(terca);
		imprimeDiaSemanaEnum(quarta);
		imprimeDiaSemanaEnum(quinta);
		imprimeDiaSemanaEnum(sexta);
		imprimeDiaSemanaEnum(sabado);
		imprimeDiaSemanaEnum(domingo);
		
	}

	// mostrar o dia da semana conforme o dia informado/passado por parâmetro
	private static void imprimeDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
			
		}
	}
	
	private static void imprimeDiaSemanaEnum(DiaSemanaEnum dia) {
		switch (dia) {
		case DOMINGO:
			System.out.println("Domingo");
			break;
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
			
		}
	}
}