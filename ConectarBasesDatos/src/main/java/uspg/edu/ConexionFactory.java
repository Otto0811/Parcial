package uspg.edu;

import Implementos.ConeccionVacia;
import Implementos.Mysql;
import Implementos.Postgree;
import Implementos.Sqlserver;
import Interface.Iconexion;

public class ConexionFactory  {
 
	public Iconexion getIconexion(String cx) {
		if (cx==null) {
		return new ConeccionVacia();
		}if	(cx.equalsIgnoreCase("MySql")) {
			return new Mysql();
		} else if (cx.equalsIgnoreCase("PostGree")) {
			return new Postgree();
			
		}else if (cx.equalsIgnoreCase("SqlServer")) {
			return new Sqlserver();
			
		}
		return new ConeccionVacia();
	}
	
}
