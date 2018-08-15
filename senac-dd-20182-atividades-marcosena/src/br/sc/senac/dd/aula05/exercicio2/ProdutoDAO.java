package br.sc.senac.dd.aula05.exercicio2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ProdutoDAO {		
	
	public int cadastrarProdutoDAO(Produto produto) {
		
		Connection conn = BancoDeDados.getConnection();
		Statement stmt = BancoDeDados.getStatement(conn);
		int resultado = 0;
		String sql = "insert into produto (nome, valor, depto) VALUES ('" + produto.getNome() + "', '" 
		+ produto.getValor() + "', '" + produto.getDepto() + "')";
		
		try {
			resultado = stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Produto Cadastrado com sucesso!");	
			
		}catch (SQLException e) {			
			System.out.println("Erro ao executar Query de Cadastro de Colecionador!");
			
		}finally {
			BancoDeDados.closeStatement(stmt);
			BancoDeDados.closeConnection(conn);
		}
		return resultado;			
		
		//insert into produtos (nome, valo, depto) values (?,?,?);
		
	}	
	
	public Produto consultarProdutoDAO(Produto produto) {
				
		Connection conn = BancoDeDados.getConnection();
		Statement stmt = BancoDeDados.getStatement(conn);
		ResultSet resultado = null;
				
		String sql = "select nome, valor from produto where nome = '" + produto.getNome() + "'";
		
		try {
			resultado = stmt.executeQuery(sql);
			
			if(resultado.next()) {
				produto.setNome(resultado.getString(1));
								
				JOptionPane.showMessageDialog(null, produto);
				
			}
				
			
		}catch (SQLException e) {			
			System.out.println("Erro ao executar a consulta do produto pão!");
			
		}finally {
			BancoDeDados.closeStatement(stmt);
			BancoDeDados.closeConnection(conn);
		}
		return produto;
		
	}
	
	
}
