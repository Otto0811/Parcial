package uspg.edu.Implementos;

public class Motor {

	private  double volume=0;
	private double mileage;
	private boolean started;
	
	public Motor (double volum, double mileage) {
		this.volume=volume;
		this.mileage=mileage;
		
	}
	public void on() {
		started = true;
	}
	public void of() {
		started = false;
	}
	public boolean isStarted() {
		return started;
	}
	public void go(double mileage) {
		if(started) {
			this.mileage+=mileage;
		}else {
			System.err.println("No puedo avanzar, necesitas encender el automovil");
		}
		
		
		
		
		
		
		
		
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
}
