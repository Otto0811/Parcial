package Burger;

import Packing.Item;
import Packing.Packing;
import Packing.Wrapper;

public abstract class Burguer implements Item{

	

	@Override
	public Packing packing() {
		
		return new Wrapper();
	}

	@Override
	public float price() {
		
		return 0;
	}
	

}
