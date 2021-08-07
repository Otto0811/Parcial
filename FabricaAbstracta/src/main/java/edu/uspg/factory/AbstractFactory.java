package edu.uspg.factory;

import edu.uspg.interfaz.Interface;

public abstract class AbstractFactory {
	
	public abstract Interface getInterface(String shapeType);
	
}
