package Fabrica;

import Interfaces.ISilla;
import Interfaces.ISillon;
import Interfaces.IMesa;



public abstract class FabricaAbstracta {

	public abstract IMesa getIMesa(String tipoMesa);
	public abstract ISilla getISilla(String tipoSilla);
	public abstract ISillon getISillon(String tipoSillon);
	
}
