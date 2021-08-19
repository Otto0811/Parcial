package edu.uspg.factory;

import edu.uspg.interfaz.Interface;
import edu.uspg.models.Rectangle;
import edu.uspg.models.Square;


public class ShapeFactory extends AbstractFactory {

	
	public Interface getInterface(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
