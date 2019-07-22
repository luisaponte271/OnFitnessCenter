package pe.edu.cibertec.dominio.filtro;

import java.math.BigDecimal;

public class FiltroProducto {

	private String nombre;
	private BigDecimal precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
