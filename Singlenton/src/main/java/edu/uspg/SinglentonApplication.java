package edu.uspg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SinglentonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SinglentonApplication.class, args);
		
		
		//Conexion c=new Conexion();
		Conexion c= Conexion.getInstancia();
		
		c.conectar();
		c.desconectar();
		
		
		
		
	}

}
