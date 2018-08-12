package br.sc.senac.dd.aula04.exercicio;

public class Caminhao extends Automovel{
	
	private String eixos;
	private Carroceria carroceria;
	
		
	public Caminhao(String fabricante, String modelo, String ano, String chassi, String eixos, Carroceria carroceria) {
		super(fabricante, modelo, ano, chassi);
		this.eixos = eixos;
		this.carroceria = carroceria;
	}

	public Caminhao() {
		super();
	}

	public String getEixos() {
		return eixos;
	}

	public void setEixos(String eixos) {
		this.eixos = eixos;
	}

	public Carroceria getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}

	
	
	
}
