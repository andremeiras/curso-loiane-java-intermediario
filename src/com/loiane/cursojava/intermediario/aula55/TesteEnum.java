package com.loiane.cursojava.intermediario.aula55;

import com.loiane.cursojava.intermediario.aula54.DiaSemanaEnum;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemanaEnum[] dias = DiaSemanaEnum.values();

		System.out.println(dias); // imprime endereço de memória do array

		// imprime os dias da semana do Enum
		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}

		System.out.println();

		// for() melhorado que tem o mesmo efeito do for() anterior. A leitura desse
		// bloco ficaria assim: para cada dia imprima/mostre o valor contido
		for (DiaSemanaEnum dia : DiaSemanaEnum.values()) {
			System.out.println(dia);
		}

	}

}
