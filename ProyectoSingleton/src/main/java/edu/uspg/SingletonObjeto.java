package edu.uspg;

public class SingletonObjeto {

	private static SingletonObjeto instancia = new SingletonObjeto();
	
	private SingletonObjeto() {
		
	}
	public static SingletonObjeto getInstancia() {
		return instancia;
	}
	public void Menjase() {
		System.out.println("Hola Mundo");
		
	}
}
