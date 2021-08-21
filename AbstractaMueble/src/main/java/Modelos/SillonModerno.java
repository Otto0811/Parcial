package Modelos;

import Interfaces.ISillon;

public class SillonModerno implements ISillon {

	@Override
	public void tienePatas() {
		
		System.out.println("No tiene patas, usa una plataforma.");
	}

	@Override
	public void numeroPersonas() {

		System.out.println("Espacio para 4 personas ");
	}

	
}
