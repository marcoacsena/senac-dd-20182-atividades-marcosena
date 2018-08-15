package br.sc.senac.dd.aula05.exercicio2;

import javax.swing.JOptionPane;

public class ApresentarMenuProduto {
	
	Produto produto = new Produto();

	public void apresentarMenuProduto() {
		
		String [] menu = {"Cadastrar Produto", "Consultar Produto", "Excluir Produto", "Atualizar Produto", "Sair"};
				
		String opcao = (String)JOptionPane.showInputDialog(null, "Por gentileza, selecione uma opção", 
				"Produtos", JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
		
		
		switch(opcao) {
		
		case "Cadastrar Produto":
			this.cadastrarProduto();
			break;
		
		case "Consultar Produto":
			
			this.consultarProduto();
			break;
			
//		case "Excluir Produto":
//			this.cadastrarProduto();
//			break;
//			
//		case "Atualizar Produto":
//			this.cadastrarProduto();
//			break;
//			
//		case "Sair":
//			this.cadastrarProduto();
//			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
		break;
		
		};
		
	}

	private void consultarProduto() {
		
		produto.setNome(JOptionPane.showInputDialog(null, "Digite o nome do produto:"));
		
		ProdutoDAO produtodao = new ProdutoDAO();
		produtodao.consultarProdutoDAO(produto);
		
	}

	private void cadastrarProduto() {
		
		produto.setNome(JOptionPane.showInputDialog(null, "Digite o nome do produto:"));
		produto.setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto:")));
		produto.setDepto(JOptionPane.showInputDialog(null, "Digite o departamento do produto:"));
		
		ProdutoDAO produtodao = new ProdutoDAO();
		produtodao.cadastrarProdutoDAO(produto);
		
	}

}
