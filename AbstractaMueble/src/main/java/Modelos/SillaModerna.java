package Modelos;

import Interfaces.ISilla;

public class SillaModerna implements ISilla

{

	@Override
	public void tienePatas() {

		System.out.println("Silla de 4 patas");		
	}

	@Override
	public void Uso() {
	
		System.out.println("Soporta unicamente el peso de una persona");
		
	}

}
