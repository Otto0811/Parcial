package Fabrica;

import Interfaces.IMesa;
import Interfaces.ISilla;
import Interfaces.ISillon;
import Modelos.MesaModerna;
import Modelos.SillaModerna;
import Modelos.SillonModerno;

public class MueblesModernos extends FabricaAbstracta {

	@Override
	public IMesa getIMesa(String tipoMesa) {
		if (tipoMesa.equalsIgnoreCase("Mesa")) {
			return new MesaModerna();
			
		}
		return null;
	}

	@Override
	public ISilla getISilla(String tipoSilla) {
		
		if (tipoSilla.equalsIgnoreCase("Silla")) {
			return new SillaModerna();
		}
		return null;
	}

	@Override
	public ISillon getISillon(String tipoSillon) {
		if (tipoSillon.equalsIgnoreCase("Sillon")) {
			return new SillonModerno();
			
		}
		return null;
	}

}
