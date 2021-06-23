package com.loiane.cursojava.intermediario.aula56;

public enum TipoDocumento {

	CPF {
		@Override
		public String geraNumeroTeste() {
			// o método cpf() da Classe GeraCpfCnpj é estático, por isso é possível fazer a
			// sua chamada como retorno do enum CPF
			return GeraCpfCnpj.cpf();
		}
	},
	CNPJ {
		@Override
		public String geraNumeroTeste() {
			// o método cpf() da Classe GeraCpfCnpj é estático, por isso é possível fazer a
			// sua chamada como retorno do enum CNPJ
			return GeraCpfCnpj.cnpj();
		}
	};

	// Ao criar um método abstrato é obrigatório adicionar os métodos não
	// implementados
	public abstract String geraNumeroTeste();

}
