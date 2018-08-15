package br.sc.senac.dd.aula05.exercicio2;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class BancoDeDados {

		private static final String driver = "com.mysql.jdbc.Driver";
		private static final String banco = "super";
		private static final String conexao = "jdbc:mysql://localhost:3306/" + banco;
		private static final String user = "root";
		private static final String password = "123";
		
		public static Connection getConnection(){
			try {
				Connection conn = null;
				Class.forName(driver);
				conn = DriverManager.getConnection(conexao, user, password);
				return conn;
			} catch (ClassNotFoundException e) {
				System.out.println("Classe do Driver n�o foi encontrada.");
				return null;
			} catch (SQLException e) {
				System.out.println("Erro ao obter a Connection.");
				return null;
			}
		}
		
		public static void closeConnection(Connection conn){
			try {
				if(conn != null){
					conn.close();
				}
			} catch (SQLException e) {
				System.out.println("Problema no fechamento da conex�o.");
			}	
		}
		
		public static Statement getStatement(Connection conn){
			try {
				Statement stmt = conn.createStatement();
				return stmt;
			} catch (SQLException e) {
				System.out.println("Erro ao obter o Statement.");
				return null;
			}
		}
			
		public static void closeStatement(Statement stmt){
			try {
				if(stmt != null){
					stmt.close();
				}
			} catch (SQLException e) {
				System.out.println("Problema no fechamento do Statement.");
			}	
		}
		
		public static PreparedStatement getPreparedStatement(Connection conn){
			try {
				
				PreparedStatement stmt = null;	
				return stmt;
				
			} catch (Exception e) {
				System.out.println("Erro ao obter o PreparedStatement.");
				return null;
			}
		}

		public static void closePreparedStatement(Statement stmt){
			try {
				if(stmt != null){
					stmt.close();
				}
			} catch (SQLException e) {
				System.out.println("Problema no fechamento do PreparedStatement.");
			}	
		}
		
		public static void closeResultSet(ResultSet result){
			try {
				if(result != null){
					result.close();
				}
			} catch (SQLException e) {
				System.out.println("Problema no fechamento do ResultSet");
			}
		}
}


