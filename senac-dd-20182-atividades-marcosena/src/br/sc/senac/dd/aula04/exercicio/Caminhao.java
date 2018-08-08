package br.sc.senac.dd.aula04.exercicio;

public class Caminhao extends Automovel{
	
	private int eixos;
	private Carroceria carroceria;
	
	public Caminhao(String fabricante, String modelo, int ano, String chassi, int numRodas, int eixos,
			Carroceria carroceria) {
		super(fabricante, modelo, ano, chassi, numRodas);
		this.eixos = eixos;
		this.carroceria = carroceria;
	}

	public Caminhao() {
		super();
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public Carroceria getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}
	
	
}
