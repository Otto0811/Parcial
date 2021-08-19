package edu.uspg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebasSingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebasSingletonApplication.class, args);
		// We register the PostgreSQL driver
		// Registramos el driver de PostgresSQL
		try { 
		    Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException ex) {
		    System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
		}
		
	}

}
