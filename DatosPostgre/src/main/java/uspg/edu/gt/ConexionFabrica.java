package uspg.edu.gt;



import java.sql.Connection;

import Implementos.Postgre;

public class ConexionFabrica {

	public Connection getConexion(String tipoDeConexion) {
		if(tipoDeConexion == null) {
			return null;
		} else if(tipoDeConexion.equalsIgnoreCase("POSTGRES")) {
			Postgre ps = new Postgre();
			return ps.conectar();
		} else if(tipoDeConexion.equalsIgnoreCase("SQLSERVER")) {
			return null;
		}
		
		return null;
		
	}
}
