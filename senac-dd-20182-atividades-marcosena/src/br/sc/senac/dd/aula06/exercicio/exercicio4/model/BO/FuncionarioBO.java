package br.sc.senac.dd.aula06.exercicio.exercicio4.model.BO;

import java.util.ArrayList;
import br.sc.senac.dd.aula06.exercicio.exercicio4.model.DAO.FuncionarioDAO;
import br.sc.senac.dd.aula06.exercicio.exercicio4.model.VO.FuncionarioVO;

public class FuncionarioBO {

	public ArrayList<FuncionarioVO> listarTodosOsFuncionariosBO() {
		
		FuncionarioDAO funcionariosDAO = new FuncionarioDAO();
		
		return funcionariosDAO.listarTodosOsFuncionarios();
	}

	public FuncionarioVO consultarFuncionarioBOPorId(int idfuncionario) {
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		return funcionarioDAO.consultarFuncionarioPorId(idfuncionario);
	}
		

	
	
	
}
