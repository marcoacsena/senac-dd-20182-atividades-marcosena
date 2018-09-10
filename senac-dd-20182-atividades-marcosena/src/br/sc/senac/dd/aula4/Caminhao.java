package br.sc.senac.dd.aula4;

public class Caminhao extends Automovel{
	
	private int eixos;
	private boolean carroceria;
	private int capacidade;
	
	
	
	public Caminhao(String fabricante, String modelo, int ano, String chassi, int numRodas, int eixos,
			boolean carroceria, int capacidade) {
		super(fabricante, modelo, ano, chassi, numRodas);
		this.eixos = eixos;
		this.carroceria = carroceria;
		this.capacidade = capacidade;
	}

	public Caminhao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Caminhao(String fabricante, String modelo, int ano, String chassi, int numRodas) {
		super(fabricante, modelo, ano, chassi, numRodas);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public boolean isCarroceria() {
		return carroceria;
	}

	public void setCarroceria(boolean carroceria) {
		this.carroceria = carroceria;
		carroceria = true;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	
	
	
}
