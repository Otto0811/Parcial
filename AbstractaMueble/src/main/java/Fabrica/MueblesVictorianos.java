package Fabrica;

import Interfaces.IMesa;
import Interfaces.ISilla;
import Interfaces.ISillon;
import Modelos.MesaVictoriana;
import Modelos.SillaVictoriana;
import Modelos.SillonVictoriano;

public class MueblesVictorianos extends FabricaAbstracta {

	@Override
	public IMesa getIMesa(String tipoMesa) {
		if (tipoMesa.equalsIgnoreCase("Mesa")) {
			return new MesaVictoriana();
			
		}
		return null;
	}

	@Override
	public ISilla getISilla(String tipoSilla) {
		if (tipoSilla.equalsIgnoreCase("Silla")) {
			return new SillaVictoriana();
			
		}
		return null;
	}

	@Override
	public ISillon getISillon(String tipoSillon) {

		if (tipoSillon.equalsIgnoreCase("Sillon")) {
			return new SillonVictoriano();
			
		}
		return null;
	}

}
