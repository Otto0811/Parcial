package Conexion;

import java.sql.Connection;

public interface Iconexion {

	Connection conectar();
	void desconectar ();
	
}
