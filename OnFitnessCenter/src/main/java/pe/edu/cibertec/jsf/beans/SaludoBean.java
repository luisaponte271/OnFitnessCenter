package pe.edu.cibertec.jsf.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SaludoBean {

	private String nombre = "florecita";

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String saludar() {
		return "oculto/hola";
	}
}
