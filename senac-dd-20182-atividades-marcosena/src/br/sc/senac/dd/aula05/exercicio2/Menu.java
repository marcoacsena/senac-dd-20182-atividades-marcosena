package br.sc.senac.dd.aula05.exercicio2;

import javax.swing.JOptionPane;

public class Menu {

	public void apresentarMenu() {
		
		String [] menu = {"Produto", "Funcionário", "Sair"};
		ApresentarMenuProduto menuProduto = new ApresentarMenuProduto();
		
		String opcao = (String)JOptionPane.showInputDialog(null, "Por gentileza, selecione uma opção", 
				"Sistema de Gestão de Supermercado", JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
		
		if(opcao != null) {
		switch(opcao) {
		
		case "Produto":
			menuProduto.apresentarMenuProduto();
			break;
			
		case "Funcionário":
			//menuProduto.apresentarMenuFuncionario();
			break;
			
		case "Sair":
			//menuProduto.sair();
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		break;
		
			};
		
		}
		
	}	
	
}
