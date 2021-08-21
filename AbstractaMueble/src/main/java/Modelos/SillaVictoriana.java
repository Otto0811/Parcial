package Modelos;

import Interfaces.ISilla;

public class SillaVictoriana implements ISilla {

	@Override
	public void tienePatas() {

		System.out.println("Silla de 4 patas");		
	}

	@Override
	public void Uso() {
		
		System.out.println("Soporta el peso de hasta 2 personas");
		
	}

	
	
}
