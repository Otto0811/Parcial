package uspg.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Interface.Iconexion;

@SpringBootApplication
public class ConectarBasesDatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConectarBasesDatosApplication.class, args);
		ConexionFactory conexionFactory= new ConexionFactory();
		
		ConexionFactory fabrica = new ConexionFactory();
		
		Iconexion c1= fabrica.getIconexion("MySql");
		
		c1.conectar();
		c1.desconectar();
		
		Iconexion c2= fabrica.getIconexion("Postgree");
		
		c2.conectar();
		c2.desconectar();
		
		Iconexion c3= fabrica.getIconexion("SqlServer");
		
		c3.conectar();
		c3.desconectar();

		
	}

}
