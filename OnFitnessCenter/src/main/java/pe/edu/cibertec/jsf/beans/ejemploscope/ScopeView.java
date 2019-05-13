package pe.edu.cibertec.jsf.beans.ejemploscope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ScopeView {

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
