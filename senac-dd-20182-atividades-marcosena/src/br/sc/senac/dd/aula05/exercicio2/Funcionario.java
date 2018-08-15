package br.sc.senac.dd.aula05.exercicio2;

public class Funcionario {
	
	private String nome;
	private String matricula;
	private String cargo;
	
	public Funcionario(String nome, String matricula, String cargo) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cargo = cargo;
	}

	public Funcionario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
