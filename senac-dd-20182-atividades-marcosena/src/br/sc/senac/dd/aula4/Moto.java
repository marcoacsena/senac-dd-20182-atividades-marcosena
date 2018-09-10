package br.sc.senac.dd.aula4;

import java.util.Scanner;

public class Moto extends Automovel{
	
	private int cilindradas;

	public Moto(String fabricante, String modelo, int ano, String chassi, int numRodas, int cilindradas) {
		super(fabricante, modelo, ano, chassi, numRodas);
		this.cilindradas = cilindradas;
	}

	public Moto() {
		super();
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	
	
}
