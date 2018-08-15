package br.sc.senac.dd.aula04.exercicio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Menu {

List<Moto> motos = new ArrayList<Moto>();
List<Caminhao> caminhoes = new ArrayList<Caminhao>();
List<Carro> carros = new ArrayList<Carro>();
	
	
public void apresentarMenu () {	
		
	String [] menu = {"1. Cadastrar Moto", "2.Cadastrar Caminhão","3. Cadastrar Carro",
				"4. Ver Caminhão e Carro", "5. Ver Motos"};
			
		
		String opcao = (String) JOptionPane.showInputDialog(null, "Por gentileza,  selecione uma opção",
				"Cadastro de Veículos", JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
		
		if(opcao != null) {
			
			switch (opcao) {
				
			case "1. Cadastrar Moto": 
				this.cadastrarMoto();
				break;
			
			case "2.Cadastrar Caminhão":
				this.cadastrarCaminhao();
				break;
				
			case "3. Cadastrar Carro":
				this.cadastrarCarro();
				break;
				
			case "4. Ver Caminhão e Carro":
				this.verCaminhaoECarro();
				break;
				
			case "5. Ver Motos":
				this.verMotos();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}	
		}
		
		JOptionPane.showMessageDialog(null, "Você selecionou a opçao cancelar!");
	}


private void cadastrarMoto() {
	Moto moto = new Moto();	
	
	int cont = Integer.parseInt( JOptionPane.showInputDialog("Digite a quantidade de motos a serem cadastradas:"));
	
	for (int i = 0; i < cont; i++) {
			
	moto.setFabricante(JOptionPane.showInputDialog(null,"Digite o fabricante da moto"));
	moto.setModelo(JOptionPane.showInputDialog(null,"Digite o modelo da moto"));
	moto.setAno(JOptionPane.showInputDialog(null, "Digite o ano da moto"));
	moto.setChassi(JOptionPane.showInputDialog("Digite o chassi da moto"));
	moto.setCilindradas(JOptionPane.showInputDialog("Digite as cilindradas da moto"));
	
	motos.add(moto);
		
	}
	
	this.apresentarMenu();
	
}

private void cadastrarCaminhao() {
Caminhao caminhao = new Caminhao();	
	
	int cont = Integer.parseInt( JOptionPane.showInputDialog("Digite a quantidade de caminhões a serem cadastrados:"));
	
	for (int i = 0; i < cont; i++) {
			
	caminhao.setFabricante(JOptionPane.showInputDialog(null,"Digite o fabricante do caminhao"));
	caminhao.setModelo(JOptionPane.showInputDialog(null,"Digite o modelo do caminhao"));
	caminhao.setAno(JOptionPane.showInputDialog(null, "Digite o ano do caminhao"));
	caminhao.setChassi(JOptionPane.showInputDialog("Digite o chassi do caminhao"));
	caminhao.setEixos(JOptionPane.showInputDialog("Digite o número de eixos do caminhao"));
	
	
	caminhoes.add(caminhao);
		
	}
	
	this.apresentarMenu();
	
	
}


private void cadastrarCarro() {
Carro carro = new Carro();	
	
	int cont = Integer.parseInt( JOptionPane.showInputDialog("Digite a quantidade de carros a serem cadastrados:"));
	
	for (int i = 0; i < cont; i++) {
			
	carro.setFabricante(JOptionPane.showInputDialog(null,"Digite o fabricante do carro"));
	carro.setModelo(JOptionPane.showInputDialog(null,"Digite o modelo do carro"));
	carro.setAno(JOptionPane.showInputDialog(null, "Digite o ano do carro"));
	carro.setChassi(JOptionPane.showInputDialog("Digite o chassi do carro"));
		
	carros.add(carro);
		
	}
	
	this.apresentarMenu();
	
}


private void verCaminhaoECarro() {
	JOptionPane.showMessageDialog(null, carros);
	this.apresentarMenu();
	
}


private void verMotos() {
	
	JOptionPane.showMessageDialog(null, motos);
	this.apresentarMenu();
}

	
}
