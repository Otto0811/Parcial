package Implementos;

import Interface.Iconexion;

public class Mysql implements Iconexion {
	
	private String host;
	private String nombre;
	private String contraseña;

	
	public void ConexcionMysql() {
		this.host="Host Local";
		this.nombre="Base Teta";
		this.contraseña="error0811";
		
	}
	
	
	
	@Override
	public void conectar() {
	
		System.out.println("Conecto a Mysql");
		
		
	}



	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("Se desconectó de MySQL");
		}

	

	
}
