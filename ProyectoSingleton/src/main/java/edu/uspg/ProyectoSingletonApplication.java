package edu.uspg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ProyectoSingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSingletonApplication.class, args);
		SingletonObjeto m= SingletonObjeto.getInstancia();
		
		m.Menjase();
	}

}
