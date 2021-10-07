package Implementos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;



import Conexion.Iconexion;

public class Postgre implements Iconexion {
	
	private static Connection instancia;
	private static String DB_URL = "jdbc:postgresql://localhost:5432/Prueba";
	private static String DRIVER = "org.postgresql.Driver";
	private static String USER = "postgres";
	private static String PASS = "error0811";
	
	
	@Override
	public Connection conectar() {

		try {
			if (instancia == null) {
				Class.forName(DRIVER);
				instancia=(Connection) DriverManager.getConnection(DB_URL,USER,PASS);
					
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Error en Conexion",e);
		}
		
		
		return instancia;
	}
	@Override
	public void desconectar() {

		try {
			Connection conn = conectar();
			conn.close();
		} catch(SQLException ex) {
			throw new RuntimeException(ex);
		}

	}
}
