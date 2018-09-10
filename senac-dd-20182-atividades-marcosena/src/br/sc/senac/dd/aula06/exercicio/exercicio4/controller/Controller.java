package br.sc.senac.dd.aula06.exercicio.exercicio4.controller;

import java.util.ArrayList;

import br.sc.senac.dd.aula06.exercicio.exercicio4.model.BO.FuncionarioBO;
import br.sc.senac.dd.aula06.exercicio.exercicio4.model.VO.FuncionarioVO;

public class Controller {

	public ArrayList<FuncionarioVO> listarTodosOsFuncionariosController() {
		FuncionarioBO funcionariosBO = new FuncionarioBO();		

		return funcionariosBO.listarTodosOsFuncionariosBO();
	}

	
	

}
