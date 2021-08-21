package uspg.edu;

import java.awt.Image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Fabrica.MueblesModernos;
import Fabrica.MueblesVictorianos;
import Interfaces.IMesa;
import Interfaces.ISilla;
import Interfaces.ISillon;
import Modelos.SillaVictoriana;

@SpringBootApplication
public class AbstractaMuebleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractaMuebleApplication.class, args);
				
		//Muebles Modernos
		
		System.out.println("--------------------------------------------------");
		System.out.println("--Muebles Modernos--");
		System.out.println("--------------------------------------------------");
		MueblesModernos moderno = new MueblesModernos();
		
		
		
		System.out.println("Silla Moderna");
		ISilla SillaM = moderno.getISilla("Silla");
			
		SillaM.tienePatas();
		SillaM.Uso();
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Mesa Moderna");
		IMesa MesaM = moderno.getIMesa("Mesa");
		
		MesaM.tienePatas();
		MesaM.espacioPersonas();
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Sillon Moderno");
		ISillon SillonM =moderno.getISillon("Sillon");
		
		SillonM.tienePatas();
		SillonM.numeroPersonas();
		
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		
		// Victorianos
		
		System.out.println("--------------------------------------------------");
		System.out.println("--Muebles Victorianos--");
		System.out.println("--------------------------------------------------");
		
		MueblesVictorianos Victoriano = new MueblesVictorianos();
		
		System.out.println("Silla Victoriana");
		ISilla sillaVic = Victoriano.getISilla("Silla");
		
		sillaVic.tienePatas();
		sillaVic.Uso();
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Mesa Victoriana");
		
		IMesa mesaVic = Victoriano.getIMesa("Mesa");
		
		mesaVic.espacioPersonas();
		mesaVic.tienePatas();
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Sillon Victoriano");
		
		ISillon sillonVic = Victoriano.getISillon("Sillon");
		
		sillonVic.numeroPersonas();
		sillonVic.tienePatas();

		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");

	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


