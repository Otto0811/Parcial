package Implementos;

import Interface.Iconexion;

public class Postgree implements Iconexion {
	
	private String host;
	private String nombre;
	private String contraseña;

	
	public void ConexcionMysql() {
		this.host="Host Local";
		this.nombre="Base Alfa";
		this.contraseña="d200108e";
		
	}
	
	
	

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("Conectado a Postgree");
	}




	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconectó de PostGre");
	}

}
