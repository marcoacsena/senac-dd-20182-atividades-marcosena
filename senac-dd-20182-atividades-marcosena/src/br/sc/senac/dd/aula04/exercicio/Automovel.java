package br.sc.senac.dd.aula04.exercicio;

public class Automovel {
	
	private String fabricante;
	private String modelo;
	private String ano;
	private String chassi;
		

	public Automovel(String fabricante, String modelo, String ano, String chassi) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.chassi = chassi;
	}


	public Automovel() {
		super();
	}


		public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getChassi() {
		return chassi;
	}


	public void setChassi(String chassi) {
		this.chassi = chassi;
	}


		public void ligar() {
		
	}
	
	public void acelerar() {
		
	}
	
	public void desligar() {
		
	}


	@Override
	public String toString() {
		return "\nfabricante: " + fabricante + "\nmodelo: " + modelo 
				+ "\nano: " + ano + "\nchassi: " + chassi; 
	}
	
	
	

}
