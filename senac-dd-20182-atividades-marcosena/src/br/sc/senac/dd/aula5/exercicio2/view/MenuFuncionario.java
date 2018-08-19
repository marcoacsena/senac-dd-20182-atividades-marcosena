package br.sc.senac.dd.aula5.exercicio2.view;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.sc.senac.dd.aula5.exercicio2.dao.FuncionarioDAO;
import br.sc.senac.dd.aula5.exercicio2.vo.FuncionarioVO;

public class MenuFuncionario{
	
	public void apresentarMenuFuncionario() {
	
		int opcao = -1;
		
		while (opcao !=6) {
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(criarMenuFuncionario()));
				
			}catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "O n�mero digitado deve ser um inteiro entre 1 e 5;");
			}
			switch(opcao) {
			case 1:{
				this.cadastrarFuncionario();
				break;
			}
			case 2:{
				this.excluirFuncionario();
				break;
			}
			case 3:{
				this.atualizarFuncionario();
				break;
			}
			case 4:{
				this.exibirTodosFuncionarios();
				break;
			}
			case 5:{
				this.consultarFuncionarioPorCPF();
				break;
			}
			case 6: {
				int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza?");
				if(resposta == 0) {
					JOptionPane.showMessageDialog(null, "Voc� foi desconectado do Menu Funcion�rio!");
				}
				break;
			}
			default: {
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
				}
			}
		}
	}
	
		private String criarMenuFuncionario() {
			String mensagem = "Menu Funcion�rio";
			mensagem += "\n Digite uma op��o:";
			mensagem += "\n 1 - Cadastrar Funcion�rio.";
			mensagem += "\n 2 - Excluir Funcion�rio.";
			mensagem += "\n 3 - Alterar Cadastro de Funcion�rio.";
			mensagem += "\n 4 - Exibir Todos os Funcion�rio.";
			mensagem += "\n 5 - Exibir Funcion�rio por CPF.";
			mensagem += "\n 6 - Sair.";
			mensagem +="\n Digite a Op��o: ";
			
			return mensagem;
		}	
	
	private void cadastrarFuncionario() {
		
		FuncionarioVO funcionarioVO = new FuncionarioVO();
			
		funcionarioVO.setNome(JOptionPane.showInputDialog(null, "Digite o nome do funcion�rio."));
		funcionarioVO.setCpf(JOptionPane.showInputDialog(null,"Digite o CPF."));
		funcionarioVO.setTelefone(JOptionPane.showInputDialog(null,"Digite o telefone."));
		funcionarioVO.setEmail(JOptionPane.showInputDialog(null,"Digite o e-mail."));
			
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
			
		funcionarioDAO.inserir(funcionarioVO);
		JOptionPane.showMessageDialog(null, "Funcion�rio cadastrado com sucesso!");
		
		}

	private void excluirFuncionario() {
	
		FuncionarioVO funcionarioVO = new FuncionarioVO();
		funcionarioVO.setIdFuncionario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do funcion�rio a ser exclu�do.")));
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();		
		
		try {
			funcionarioDAO.excluir(funcionarioVO.getIdFuncionario());
			JOptionPane.showMessageDialog(null, "Funcion�rio exclu�do com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	private void atualizarFuncionario() {
		
		FuncionarioVO funcionarioVO = new FuncionarioVO();		
		funcionarioVO.setIdFuncionario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do funcion�rio que ser� atualizado.")));
		funcionarioVO.setNome(JOptionPane.showInputDialog(null, "Digite o novo nome do funcion�rio."));
		funcionarioVO.setCpf(JOptionPane.showInputDialog(null,"Digite o novo CPF do funcion�rio."));
		funcionarioVO.setTelefone(JOptionPane.showInputDialog(null,"Digite o novo telefone."));
		funcionarioVO.setEmail(JOptionPane.showInputDialog(null,"Digite o novo e-mail."));
	 
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		try {
			
			funcionarioDAO.atualizar(funcionarioVO, funcionarioVO.getIdFuncionario());
			// por que eu tenho que passar o argumento funcionarioVO?
			
			JOptionPane.showMessageDialog(null, "Funcion�rio atualizado com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	private void exibirTodosFuncionarios() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		try {
			funcionarioDAO.listarTodos();
						
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	private void consultarFuncionarioPorCPF() {
	     
		FuncionarioVO funcionarioVO = new FuncionarioVO();
		funcionarioVO.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF do funcion�rio a ser consultado."));
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		funcionarioDAO.consultarPorCPF(funcionarioVO.getCpf());
	}

	

}
