package br.sc.senac.dd.aula04.exercicio;

public class Carro extends Automovel{
	
	private String categoria; //passeio, SUV, transporte.

	public Carro(String fabricante, String modelo, int ano, String chassi, int numRodas, String categoria) {
		super(fabricante, modelo, ano, chassi, numRodas);
		this.categoria = categoria;
	}
	
	public Carro() {
		super();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
		
	

}
