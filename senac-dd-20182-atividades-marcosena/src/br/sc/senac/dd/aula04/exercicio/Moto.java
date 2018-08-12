package br.sc.senac.dd.aula04.exercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Moto extends Automovel{
	
	private String cilindradas;

		
	public Moto(String fabricante, String modelo, String ano, String chassi, String cilindradas) {
		super(fabricante, modelo, ano, chassi);
		this.cilindradas = cilindradas;
	}

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

	

		
	
}
