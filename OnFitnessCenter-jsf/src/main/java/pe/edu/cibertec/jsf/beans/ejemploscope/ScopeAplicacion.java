package pe.edu.cibertec.jsf.beans.ejemploscope;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ScopeAplicacion {

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
