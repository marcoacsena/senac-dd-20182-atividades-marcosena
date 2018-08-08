package br.sc.senac.dd.aula04.exercicio;

public class moto extends Automovel{
	
	private int cilindradas;

	public moto(String fabricante, String modelo, int ano, String chassi, int numRodas, int cilindradas) {
		super(fabricante, modelo, ano, chassi, numRodas);
		this.cilindradas = cilindradas;
	}

	public moto() {
		super();
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	
}
