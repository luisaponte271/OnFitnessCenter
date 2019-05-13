package pe.edu.cibertec.dominio;

import java.math.BigDecimal; 
 
public class Membresia extends Entidad{
	
		private Integer id_socio; 
		private Integer tipo_membresia; 
		private String membresia_Des;
		private BigDecimal precio;
		private String fecha_inicio;
		private String fecha_Vencimiento;
		private Integer dia;
		private String estado_des;
		private String fechacreacion;
	 
		public Membresia() { 
			
		}

		public Membresia(Integer id, Integer id_socio, String nombre_mem, String fecha_inicio, BigDecimal precio,
				Integer dia, String estado, String fecha_Creac, String fecha_vencimiento, boolean flag) {
			this.id = id;
			this.id_socio = id_socio;
			this.setMembresia_Des(nombre_mem);  
			this.fecha_inicio = fecha_inicio;
			this.precio = precio;
			this.estado_des = estado;
			this.dia = dia;
			this.fechacreacion = fecha_Creac;
			this.fecha_Vencimiento = fecha_vencimiento;
			this.flag = flag;
		}
		 
 
		public String getFecha_inicio() {
			return fecha_inicio;
		}

		public void setFecha_inicio(String fecha_inicio) {
			this.fecha_inicio = fecha_inicio;
		}

		public BigDecimal getPrecio() {
			return precio;
		}

		public void setPrecio(BigDecimal precio) {
			this.precio = precio;
		} 

		public Integer getTipo_membresia() {
			return tipo_membresia;
		}

		public void setTipo_membresia(Integer tipo_membresia) {
			this.tipo_membresia = tipo_membresia;
		}

		public Integer getDia() {
			return dia;
		}

		public void setDia(Integer dia) {
			this.dia = dia;
		}

		public Integer getId_socio() {
			return id_socio;
		}

		public void setId_socio(Integer id_socio) {
			this.id_socio = id_socio;
		}
  
		public String getEstado_des() {
			return estado_des;
		}

		public void setEstado_des(String estado_des) {
			this.estado_des = estado_des;
		}

		public String getFechacreacion() {
			return fechacreacion;
		}

		public void setFechacreacion(String fechacreacion) {
			this.fechacreacion = fechacreacion;
		}

		public String getMembresia_Des() {
			return membresia_Des;
		}

		public void setMembresia_Des(String membresia_Des) {
			this.membresia_Des = membresia_Des;
		}

		public String getFecha_Vencimiento() {
			return fecha_Vencimiento;
		}

		public void setFecha_Vencimiento(String fecha_Vencimiento) {
			this.fecha_Vencimiento = fecha_Vencimiento;
		}
  
}
