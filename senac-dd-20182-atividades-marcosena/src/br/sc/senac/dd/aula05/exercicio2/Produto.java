package br.sc.senac.dd.aula05.exercicio2;

public class Produto {
	
	private String nome;
	private Double valor;
	private String depto;
	
	public Produto(String nome, Double valor, String depto) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.depto = depto;
	}
	
	public Produto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	@Override
	public String toString() {
		return "\nNome:" + nome + "\nvalor:" + valor +"\ndepartamento:" + depto;
	}
	
	

}
