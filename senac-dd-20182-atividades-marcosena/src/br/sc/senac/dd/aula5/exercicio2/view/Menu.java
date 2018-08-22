package br.sc.senac.dd.aula5.exercicio2.view;

import javax.swing.JOptionPane;

public class Menu {
	
	public void apresentarMenu() {
		
//		String [] menu = {"Produto", "Funcion�rio", "Sair"};
//		MenuProduto menuProduto = new MenuProduto();
//		
//		String opcao = (String)JOptionPane.showInputDialog(null, "Por gentileza, selecione uma op��o", 
//				"M�dulo Gest�o do Supermercado Marco Sena", JOptionPane.INFORMATION_MESSAGE,
		//null, menu, menu[0]);
//		
//		Professor, por que esse c�digo acima n�o � recomendado, pois entendo que � mais simples,
//		pois n�o precisa criar o m�todo criarOpcaoMenu?		
		
		int opcao = -1; //Professor, por que a vari�vel op��o = -1?
		
		while (opcao!=3) {
		 	
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(criarOpcaoMenu()));
				
			}catch(NumberFormatException ex){
				
				JOptionPane.showMessageDialog(null, "Caro usu�rio, o n�mero da op��o selecionada "
						+ "deve ser um inteiro, entre 1 e 3.");
			}//Professor, por que a exce��o NumberFormatException? O que representa ex?
			
			switch(opcao) {
			
			case 1:{
				MenuFuncionario menuFuncionario = new MenuFuncionario();
				menuFuncionario.apresentarMenuFuncionario();
				break;
			}
			case 2:{
				MenuProduto menuProduto = new MenuProduto();
				menuProduto.apresentaMenuProduto();
				break;
			}
			case 3:{
				int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza?");
				if(resposta == 0) {
					JOptionPane.showMessageDialog(null, "Voc� foi desconectado do sistema!");
				}
				break;
			}
			default: {
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
				}
			}
		}
	}

	public String criarOpcaoMenu() {
		String mensagem = "M�dulo Gest�o do Supermercado Marco Sena";
		mensagem += "\n Digite uma op��o:";
		mensagem += "\n 1 - Menu Funcion�rio.";
		mensagem += "\n 2 - Menu Produto.";
		mensagem += "\n 3 - Sair";
		mensagem +="\n Digite a Op��o: ";
		
		return mensagem;

	}

}
