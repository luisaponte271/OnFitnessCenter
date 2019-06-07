package pe.edu.cibertec.jsf.beans.ejemploscope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ScopeRequest {

	private int dato;

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public void incrementar() {
		dato++;
	}
}
