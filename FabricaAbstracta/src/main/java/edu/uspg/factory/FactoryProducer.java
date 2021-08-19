package edu.uspg.factory;

public class FactoryProducer {

	public static AbstractFactory getFactory(boolean rounded) {
		if(rounded) {
			return new RoundeShapeFactory();
		}else {
			return new ShapeFactory();
		}
	}
}
