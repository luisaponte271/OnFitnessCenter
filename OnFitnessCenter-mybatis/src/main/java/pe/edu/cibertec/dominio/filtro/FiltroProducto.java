package pe.edu.cibertec.dominio.filtro;

import java.math.BigDecimal;
import java.util.List;

public class FiltroProducto {

	private String nombre;
	private BigDecimal precio;
	private List<Integer> listaCategoriaSeleccionada;

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

	public List<Integer> getListaCategoriaSeleccionada() {
		return listaCategoriaSeleccionada;
	}

	public void setListaCategoriaSeleccionada(List<Integer> listaCategoriaSeleccionada) {
		this.listaCategoriaSeleccionada = listaCategoriaSeleccionada;
	}
}
