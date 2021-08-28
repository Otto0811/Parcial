package Implementos;

import Interface.Iconexion;

public class ConeccionVacia implements Iconexion{

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("No Conecto con Base de datos");
		
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("No Conecto con Base de datos");
	}

}
