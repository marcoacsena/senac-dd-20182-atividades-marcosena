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
				JOptionPane.showMessageDialog(null, "O número digitado deve ser um inteiro entre 1 e 5;");
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
					JOptionPane.showMessageDialog(null, "Você foi desconectado do Menu Funcionário!");
				}
				break;
			}
			default: {
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				}
			}
		}
	}
	
		private String criarMenuFuncionario() {
			String mensagem = "Menu Funcionário";
			mensagem += "\n Digite uma opção:";
			mensagem += "\n 1 - Cadastrar Funcionário.";
			mensagem += "\n 2 - Excluir Funcionário.";
			mensagem += "\n 3 - Alterar Cadastro de Funcionário.";
			mensagem += "\n 4 - Exibir Todos os Funcionário.";
			mensagem += "\n 5 - Exibir Funcionário por CPF.";
			mensagem += "\n 6 - Sair.";
			mensagem +="\n Digite a Opção: ";
			
			return mensagem;
		}	
	
	private void cadastrarFuncionario() {
		
		FuncionarioVO funcionarioVO = new FuncionarioVO();
			
		funcionarioVO.setNome(JOptionPane.showInputDialog(null, "Digite o nome do funcionário."));
		funcionarioVO.setCpf(JOptionPane.showInputDialog(null,"Digite o CPF."));
		funcionarioVO.setTelefone(JOptionPane.showInputDialog(null,"Digite o telefone."));
		funcionarioVO.setEmail(JOptionPane.showInputDialog(null,"Digite o e-mail."));
			
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
			
		funcionarioDAO.inserir(funcionarioVO);
		JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
		
		}

	private void excluirFuncionario() {
	
		FuncionarioVO funcionarioVO = new FuncionarioVO();
		funcionarioVO.setIdFuncionario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do funcionário a ser excluído.")));
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();		
		
		try {
			funcionarioDAO.excluir(funcionarioVO.getIdFuncionario());
			JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	private void atualizarFuncionario() {
		
		FuncionarioVO funcionarioVO = new FuncionarioVO();		
		funcionarioVO.setIdFuncionario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do funcionário que será atualizado.")));
		funcionarioVO.setNome(JOptionPane.showInputDialog(null, "Digite o novo nome do funcionário."));
		funcionarioVO.setCpf(JOptionPane.showInputDialog(null,"Digite o novo CPF do funcionário."));
		funcionarioVO.setTelefone(JOptionPane.showInputDialog(null,"Digite o novo telefone."));
		funcionarioVO.setEmail(JOptionPane.showInputDialog(null,"Digite o novo e-mail."));
	 
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		try {
			
			funcionarioDAO.atualizar(funcionarioVO, funcionarioVO.getIdFuncionario());
			// por que eu tenho que passar o argumento funcionarioVO?
			
			JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
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
		funcionarioVO.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF do funcionário a ser consultado."));
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		funcionarioDAO.consultarPorCPF(funcionarioVO.getCpf());
	}

	

}
