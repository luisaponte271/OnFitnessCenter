package pe.edu.cibertec.jsf.beans.ejemploscope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ScopeSesion {

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
