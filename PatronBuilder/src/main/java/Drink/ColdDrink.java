package Drink;

import Packing.Bottle;
import Packing.Item;
import Packing.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();

	
	
}
