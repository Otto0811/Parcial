	package edu.uspg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.uspg.factory.AbstractFactory;
import edu.uspg.factory.FactoryProducer;
import edu.uspg.factory.ShapeFactory;
import edu.uspg.interfaz.Interface;

import org.springframework.boot.autoconfigure.SpringBootApplication;

public class FabricaAbstractaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FabricaAbstractaApplication.class, args);


		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		AbstractFactory shapeFactoryRounded = FactoryProducer.getFactory(true);
		
		Interface rectangulo = shapeFactory.getInterface("RECTANGLE");
		Interface cuadrado = shapeFactory.getInterface("SQUARE");
		
		Interface rectanguloRedondeado = shapeFactoryRounded.getInterface("RECTANGLE");
		Interface cuadradoRedondeado = shapeFactoryRounded.getInterface("SQUARE");
		
		rectangulo.draw();
		cuadrado.draw();
		
		rectanguloRedondeado.draw();
		cuadradoRedondeado.draw();
		
		
	}

}
