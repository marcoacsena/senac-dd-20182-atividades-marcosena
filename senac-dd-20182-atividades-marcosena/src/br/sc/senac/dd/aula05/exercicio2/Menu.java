package br.sc.senac.dd.aula05.exercicio2;

import javax.swing.JOptionPane;

public class Menu {

	public void apresentarMenu() {
		
		String [] menu = {"Produto", "Funcion�rio", "Sair"};
		ApresentarMenuProduto menuProduto = new ApresentarMenuProduto();
		
		String opcao = (String)JOptionPane.showInputDialog(null, "Por gentileza, selecione uma op��o", 
				"Sistema de Gest�o de Supermercado", JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
		
		if(opcao != null) {
		switch(opcao) {
		
		case "Produto":
			menuProduto.apresentarMenuProduto();
			break;
			
		case "Funcion�rio":
			//menuProduto.apresentarMenuFuncionario();
			break;
			
		case "Sair":
			//menuProduto.sair();
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
		break;
		
			};
		
		}
		
	}	
	
}
