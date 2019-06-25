package pe.edu.cibertec.dominio;

import java.math.BigDecimal;

public class Productos extends Entidad {
	private String nombre;
	private String descripcion;
	private BigDecimal Costo;
	private BigDecimal Precio;
	private String fechacreacion;
	private String activo;
	private boolean flag;
	
	public Productos() { 
		
	}

	public Productos(Integer id, String nombre, String descripcion, BigDecimal costo, BigDecimal precio, String fechacreacion, boolean flag) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.Costo = costo;
		this.Precio = precio;
		this.fechacreacion = fechacreacion;
		this.flag = flag; 
	}
	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getCosto() {
		return Costo;
	}

	public void setCosto(BigDecimal costo) {
		Costo = costo;
	}

	public BigDecimal getPrecio() {
		return Precio;
	}

	public void setPrecio(BigDecimal precio) {
		Precio = precio;
	}

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	 
}