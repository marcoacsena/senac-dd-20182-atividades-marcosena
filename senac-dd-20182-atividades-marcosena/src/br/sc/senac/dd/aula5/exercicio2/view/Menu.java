package br.sc.senac.dd.aula5.exercicio2.view;

import javax.swing.JOptionPane;

public class Menu {
	
	public void apresentarMenu() {
		
//		String [] menu = {"Produto", "Funcionário", "Sair"};
//		MenuProduto menuProduto = new MenuProduto();
//		
//		String opcao = (String)JOptionPane.showInputDialog(null, "Por gentileza, selecione uma opção", 
//				"Módulo Gestão do Supermercado Marco Sena", JOptionPane.INFORMATION_MESSAGE,
		//null, menu, menu[0]);
//		
//		Professor, por que esse código acima não é recomendado, pois entendo que é mais simples,
//		pois não precisa criar o método criarOpcaoMenu?		
		
		int opcao = -1; //Professor, por que a variável opção = -1?
		
		while (opcao!=3) {
		 	
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(criarOpcaoMenu()));
				
			}catch(NumberFormatException ex){
				
				JOptionPane.showMessageDialog(null, "Caro usuário, o número da opção selecionada "
						+ "deve ser um inteiro, entre 1 e 3.");
			}//Professor, por que a exceção NumberFormatException? O que representa ex?
			
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
					JOptionPane.showMessageDialog(null, "Você foi desconectado do sistema!");
				}
				break;
			}
			default: {
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				}
			}
		}
	}

	public String criarOpcaoMenu() {
		String mensagem = "Módulo Gestão do Supermercado Marco Sena";
		mensagem += "\n Digite uma opção:";
		mensagem += "\n 1 - Menu Funcionário.";
		mensagem += "\n 2 - Menu Produto.";
		mensagem += "\n 3 - Sair";
		mensagem +="\n Digite a Opção: ";
		
		return mensagem;

	}

}
