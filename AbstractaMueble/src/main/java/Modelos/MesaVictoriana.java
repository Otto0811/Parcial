package Modelos;

import Interfaces.IMesa;

public class MesaVictoriana implements IMesa {

	@Override
	public void tienePatas() {
		
		System.out.println("Mesa de 4 patas");
	}

	@Override
	public void espacioPersonas() {
		
		System.out.println("Espacio para 8 personas");
		
	}

}
