package pe.edu.cibertec.dominio;

import java.math.BigDecimal;
import javax.persistence.Entity;
  
@Entity 
public class Tipomembresia  extends Entidad{
		 
		private String nombre;
	  
		public Tipomembresia() {  
		}
		 
		public Tipomembresia(Integer id,String nombre) { 
			this.id = id;
			this.nombre = nombre;
		}
 
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
 
}
