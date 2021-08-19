package edu.uspg.factory;

import edu.uspg.interfaz.Interface;
import edu.uspg.models.RectangleRounded;
import edu.uspg.models.SquareRounded;

public class RoundeShapeFactory extends AbstractFactory{

	@Override
	public Interface getInterface(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
				return new RectangleRounded();
			} else if (shapeType.equalsIgnoreCase("SQUARE")) {
				return new SquareRounded();
			}
			return null;
		}

}
