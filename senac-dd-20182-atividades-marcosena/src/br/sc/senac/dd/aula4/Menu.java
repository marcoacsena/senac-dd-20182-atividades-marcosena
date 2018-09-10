package br.sc.senac.dd.aula4;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu {
	public List<Caminhao>caminhoes = new ArrayList<Caminhao>();
	public List<Carro>carros = new ArrayList<Carro>();
	public List<Moto>motos = new ArrayList<Moto>();

 Scanner teclado = new Scanner(System.in);
	
	public void apresentarMenu() {
		
		int opcao = -1;
		
		try {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(criarOpcoesMenu()));
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Valor informado deve ser um n�mero inteiro entre 1 e 6");
		} 
				
		while (opcao != 6){
				
			switch(opcao){
				case 1: {
					Menu cadastrarMoto = new Menu();
					cadastrarMoto.cadastrarMoto();
					break;
				}
				case 2: {
					Menu cadastrarCaminhao = new Menu();
					cadastrarCaminhao.cadastrarCaminhao();
					break;
				}
				case 3: {
					Menu cadastrarCarro = new Menu();
					cadastrarCarro.cadastrarCarro();
					break;
				}
				case 4: {
					Menu exibirCaminhaoCarro = new Menu();
					exibirCaminhaoCarro.exibirCaminhaoCarro();
					break;
				}
				case 5: {
					Menu exibirMoto = new Menu();
					exibirMoto.exibirMoto();
					break;
				}
				default: {
					JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
					break;
				}
			}
			
		}
		//Op��o 6 - Sair
		int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Voc� foi desconectado do sistema!");
		}else if(resposta == 1) {
			JOptionPane.showInputDialog(criarOpcoesMenu());
		}
	}

	public String criarOpcoesMenu() {
		String mensagem = "Sistema Gerenciador de Autom�veis";
		mensagem += "\n Op��es:";
		mensagem += "\n 1 - Cadastrar Moto.";
		mensagem += "\n 2 - Cadastrar Caminh�o.";
		mensagem += "\n 3 - Cadastrar Carro.";
		mensagem += "\n 4 - Exibir Caminh�o e Carro.";
		mensagem += "\n 5 - Exibir Moto.";
		mensagem += "\n 6 - Sair";
		mensagem +="\n Digite a Op��o: ";
		
		return mensagem;
	}
	
	private void cadastrarCarro() {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidades de carros a serem cadastrados."));
				
		for(int i = 0; i< n;i++) {
		Carro carro = new Carro();
		
		carro.setFabricante(JOptionPane.showInputDialog(null, "Digite o fabricante:"));
		carro.setModelo(JOptionPane.showInputDialog(null,"Digite o modelo:"));
		carro.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano:")));
		carro.setChassi(JOptionPane.showInputDialog(null,"Digite o chassi:"));
		carro.setNumRodas(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero de rodas:")));
		carro.setCategoria(JOptionPane.showInputDialog(null,"Digite a categoria:"));
		
		carros.add(carro);
		}
		this.apresentarMenu();
}
	private void cadastrarMoto() {		
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidades de motos a serem cadastradas."));
				
		for(int i = 0; i< n;i++) {
		Moto moto = new Moto();
		
		moto.setFabricante(JOptionPane.showInputDialog(null, "Digite o fabricante:"));
		moto.setModelo(JOptionPane.showInputDialog(null,"Digite o modelo:"));
		moto.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano:")));
		moto.setChassi(JOptionPane.showInputDialog(null,"Digite o chassi:"));
		moto.setNumRodas(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero de rodas:")));
		moto.setCilindradas(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite as cilindradas:")));
		
		motos.add(moto);
		}
		
		this.apresentarMenu();
			
	}
	private void cadastrarCaminhao() {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidades de caminh�es a serem cadastrados."));
				
		for(int i = 0; i< n;i++) {
		Caminhao caminhao = new Caminhao();
		
		caminhao.setFabricante(JOptionPane.showInputDialog(null, "Digite o fabricante:"));
		caminhao.setModelo(JOptionPane.showInputDialog(null,"Digite o modelo:"));
		caminhao.setAno(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano:")));
		caminhao.setChassi(JOptionPane.showInputDialog(null,"Digite o chassi:"));
		caminhao.setNumRodas(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n�mero de rodas:")));
		caminhao.setEixos(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de eixos:")));
		caminhao.setCarroceria(Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Este caminh�o tem carroceria?")));
		
		caminhoes.add(caminhao);
		}
		
		this.apresentarMenu();
		
	}
	
	private void exibirCaminhaoCarro() {
		
		carros.toString();
		caminhoes.toString();
		JOptionPane.showMessageDialog(null, "Lista dos carros e caminh�es cadastrados");
		JOptionPane.showMessageDialog(null, carros);
		JOptionPane.showMessageDialog(null,caminhoes);
			
		this.apresentarMenu();
		
	}
	private void exibirMoto() {
		motos.toString();
		JOptionPane.showMessageDialog(null, "Lista das motos cadastradas");
		JOptionPane.showMessageDialog(null, motos);
		
		this.apresentarMenu();
		
	}
	
}