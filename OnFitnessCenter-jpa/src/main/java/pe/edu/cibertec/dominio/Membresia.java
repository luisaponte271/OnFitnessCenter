package pe.edu.cibertec.dominio;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
  
 
@Entity 
public class Membresia extends Entidad{
		
		@ManyToOne(optional=false,fetch=FetchType.EAGER)
		@JoinColumn(name="id_socio")
		private Socio socio;
		@ManyToOne(optional=false,fetch=FetchType.EAGER)
		@JoinColumn(name="id_tipo_memb")
		private Tipomembresia tipomembresia;  
		private BigDecimal precio;
		private Integer dia;
		private String fecha_inicio;
		private String fecha_vencimiento;
		private String observacion;
		private String fechacreacion;
		private boolean flag;
	  
 		public Membresia() { 
//			socio = new Socio(); 
			tipomembresia = new Tipomembresia();
		} 
		
		public Membresia(Integer id, Socio socio, Tipomembresia tipomembresia, BigDecimal precio, Integer dia, String fecha_inicio,
				String fecha_vencimiento, String observacion, String fechacreacion, boolean flag) { 
			this.id = id;
			this.socio = socio;
			this.tipomembresia = tipomembresia;
			this.precio = precio;
			this.dia = dia;
			this.fecha_inicio = fecha_inicio;
			this.fecha_vencimiento = fecha_vencimiento;
			this.observacion = observacion;
			this.fechacreacion = fechacreacion;
			this.flag = flag;
		}
   
		public Socio getSocio() {
			return socio;
		}

		public void setSocio(Socio socio) {
			this.socio = socio;
		}
		 
		public Tipomembresia getTipomembresia() {
			return tipomembresia;
		}

		public void setTipomembresia(Tipomembresia tipomembresia) {
			this.tipomembresia = tipomembresia;
		}

		public BigDecimal getPrecio() {
			return precio;
		}

		public void setPrecio(BigDecimal precio) {
			this.precio = precio;
		}

		public Integer getDia() {
			return dia;
		}

		public void setDia(Integer dia) {
			this.dia = dia;
		}

		public String getFecha_inicio() {
			return fecha_inicio;
		}

		public void setFecha_inicio(String fecha_inicio) {
			this.fecha_inicio = fecha_inicio;
		}

		public String getFecha_vencimiento() {
			return fecha_vencimiento;
		}

		public void setFecha_vencimiento(String fecha_vencimiento) {
			this.fecha_vencimiento = fecha_vencimiento;
		}

		public String getObservacion() {
			return observacion;
		}

		public void setObservacion(String observacion) {
			this.observacion = observacion;
		}

		public String getFechacreacion() {
			return fechacreacion;
		}

		public void setFechacreacion(String fechacreacion) {
			this.fechacreacion = fechacreacion;
		}

		public boolean getFlag() {
			return flag;
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}

	 
		  
}
