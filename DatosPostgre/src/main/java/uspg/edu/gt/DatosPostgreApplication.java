package uspg.edu.gt;

import java.sql.PreparedStatement;
import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DatosPostgreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatosPostgreApplication.class, args);
		

		ConexionFabrica fabricaConexiones = new ConexionFabrica();
		
		Connection cnPostgres = (Connection) fabricaConexiones.getConexion("POSTGRES");
		
		
		if(cnPostgres != null) {
			System.out.println("Conectado a postgres");
			try {
				PreparedStatement st = cnPostgres.prepareStatement("insert into Numero(id,nombre) values(?,?)");
				st.setInt(1,3);
				st.setString(2, "Mariana");
				st.execute();
				st.close();
			} catch(Exception e) {
				e.getMessage();
			}
		}
		
	}
	
	public void registrar() {
		
	}

}


