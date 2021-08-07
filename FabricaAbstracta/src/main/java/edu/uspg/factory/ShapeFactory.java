package edu.uspg.factory;

import edu.uspg.interfaz.Interface;
import edu.uspg.models.Rectangle;

public class ShapeFactory extends AbstractFactory {

	
	public Interface getInterface(String shapeType) {
		if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
			
		}else {
			
		}
		
		return null;
	}

}
