package br.sc.senac.dd.aula5.exercicio2.vo;

public class ProdutoVO {
	private int idProduto;
	private String nome;
	private double valor;
	private String secao;
	
	
	public ProdutoVO(String nome, String secao, double valor) {
		super();
		this.nome = nome;
		this.secao = secao;
		this.valor = valor;
	}

	public ProdutoVO() {
		super();
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSecao() {
		return secao;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "\n IdProduto: " + idProduto + ",\n Nome: " + nome + ",\n Secao: " + secao + ",\n Valor: " + valor;
	}	
}
