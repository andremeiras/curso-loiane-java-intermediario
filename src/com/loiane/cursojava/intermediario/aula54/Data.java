package com.loiane.cursojava.intermediario.aula54;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private DiaSemanaEnum diaSemanaEnum;

	public Data() {
		// construtor vazio
		super();
	}
	
	public Data(int dia, int mes, int ano, DiaSemanaEnum diaSemanaEnum) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaSemanaEnum = diaSemanaEnum;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public DiaSemanaEnum getDiaSemanaEnum() {
		return diaSemanaEnum;
	}

	public void setDiaSemanaEnum(DiaSemanaEnum diaSemanaEnum) {
		this.diaSemanaEnum = diaSemanaEnum;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

}
