package br.sc.senac.dd.aula06.exercicio.exercicio4.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import br.sc.senac.dd.aula06.exercicio.exercicio4.model.VO.FuncionarioVO;



public class FuncionarioDAO {
	
	
	public int inserir(FuncionarioVO funcionarioVO) {
		int novoId = -1; 
		
		String query = "INSERT INTO funcionario (nome, cpf, telefone, email)" + " VALUES (?,?,?,?)";

		Connection conn = AcessoAoBanco.getConnection();
		PreparedStatement prepStmt = AcessoAoBanco.getPreparedStatement(conn, query, Statement.RETURN_GENERATED_KEYS);

		try {
			prepStmt.setString(1,  funcionarioVO.getNome());
			prepStmt.setString(2,  funcionarioVO.getCpf());
			prepStmt.setString(3,  funcionarioVO.getTelefone());
			prepStmt.setString(4,  funcionarioVO.getEmail());

			prepStmt.executeUpdate();

			ResultSet generatedKeys = prepStmt.getGeneratedKeys();
			
			if (generatedKeys.next()) {
				novoId = generatedKeys.getInt(1);
			}
			
		}catch (SQLException e) {
			System.out.println("Erro ao executar Query de Cadastro de Produto! Causa: \n: " + e.getMessage());

		}finally {
			AcessoAoBanco.closePreparedStatement(prepStmt);
			AcessoAoBanco.closeConnection(conn);
		}
		return novoId;
	}

	public boolean delete(int idFuncionario) {
		
		boolean sucesso = false;

		String query = "DELETE FROM funcionario WHERE idfuncionario = ? ";

		Connection conn = AcessoAoBanco.getConnection();
		PreparedStatement prepStmt = AcessoAoBanco.getPreparedStatement(conn, query);

		try {
			prepStmt.setInt(1,  idFuncionario);

			int codigoRetorno = prepStmt.executeUpdate();

			if(codigoRetorno == 1){
				sucesso = true;				
			}

			
		}catch (SQLException e) {
			System.out.println("Erro ao executar Query de Exclusão do Funcionario! Causa: \n: " + e.getMessage());
		}finally {
			AcessoAoBanco.closePreparedStatement(prepStmt);
			AcessoAoBanco.closeConnection(conn);
		}
		return sucesso;
	}

	public boolean atualizar(FuncionarioVO funcionarioVO) {

		boolean sucesso = false;

		String query = "UPDATE funcionario SET nome=?, cpf=?, telefone=?, email=? " + "WHERE idfuncionario = ?";

		Connection conn = AcessoAoBanco.getConnection();
		PreparedStatement prepStmt = AcessoAoBanco.getPreparedStatement(conn, query);

		try {
			
						
			prepStmt.setString(1,  funcionarioVO.getNome());
			prepStmt.setString(2,  funcionarioVO.getCpf());
			prepStmt.setString(3,  funcionarioVO.getTelefone());
			prepStmt.setString(4,  funcionarioVO.getEmail());	
			prepStmt.setInt(5,  funcionarioVO.getIdFuncionario());
			int codigoRetorno = prepStmt.executeUpdate();
			

			if(codigoRetorno == 1){
				sucesso = true;
			}
			

		}catch (SQLException e) {
			System.out.println("Erro ao executar Query de Atualização do Funcionário! Causa: \n: " + e.getMessage());
		}finally {
			AcessoAoBanco.closePreparedStatement(prepStmt);
			AcessoAoBanco.closeConnection(conn);
		}
		
		return sucesso;

	}

	public ArrayList<FuncionarioVO> listarTodosOsFuncionarios() {

		String query = "select * from funcionario";

		Connection conn = AcessoAoBanco.getConnection();
		PreparedStatement prepStmt = AcessoAoBanco.getPreparedStatement(conn, query);
		
		ArrayList<FuncionarioVO> funcionariosVO = new ArrayList<FuncionarioVO>();
		
		try {
			ResultSet resultado = prepStmt.executeQuery(query);

			while (resultado.next()) {
				
				FuncionarioVO funcionarioVO = new FuncionarioVO();
				funcionarioVO.setIdFuncionario(resultado.getInt(1));
				funcionarioVO.setNome(resultado.getString("nome"));
				funcionarioVO.setCpf(resultado.getString("cpf"));
				funcionarioVO.setTelefone(resultado.getString("telefone"));
				funcionarioVO.setEmail(resultado.getString("email"));

				funcionariosVO.add(funcionarioVO);
			}				
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return funcionariosVO;
	}

	public FuncionarioVO consultarFuncionarioPorId(int idfuncionario) {
				
		String query = "SELECT * FROM funcionario" + " WHERE idfuncionario = ?";
		FuncionarioVO funcionario = null;
		
		Connection conn = AcessoAoBanco.getConnection();
		PreparedStatement prepStmt = AcessoAoBanco.getPreparedStatement(conn, query);
					

		try {
			prepStmt.setInt(1, idfuncionario);
			ResultSet result = prepStmt.executeQuery();

			while (result.next()){
				funcionario = new FuncionarioVO();
				
				funcionario.setIdFuncionario(result.getInt("idFuncionario"));
				funcionario.setNome(result.getString("nome"));
				funcionario.setCpf(result.getString("cpf"));
				funcionario.setTelefone(result.getString("telefone"));
				funcionario.setEmail(result.getString("email"));
				
				
			}			

		} catch(SQLException e) {
			System.out.println("Erro ao executar a Query de Consulta de funcionarios!Causa: \n: " + e.getMessage());
		} finally {
			AcessoAoBanco.closeStatement(prepStmt);
			AcessoAoBanco.closeConnection(conn);
		}
		return funcionario;
	}

}
