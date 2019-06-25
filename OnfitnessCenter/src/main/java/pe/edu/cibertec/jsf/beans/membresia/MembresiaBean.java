package pe.edu.cibertec.jsf.beans.membresia;

import java.util.ArrayList;
import java.util.List; 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.ViewScoped;  
import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioMembresiaMemoriaImpl;
import pe.edu.cibertec.servicio.MembresiaServicio;  
  
@ManagedBean
@ViewScoped
public class MembresiaBean {
 
	private List<Membresia> listaMembresias;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public MembresiaBean() {
		System.out.println("Iniciando  MembresiaBean"); 
		listaMembresias = new ArrayList<Membresia>();
	}
	 
	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de MembresiaBean");
		MembresiaServicio membresiaServicio = configuracionAppBean.getMembresiaServicio();
		 
		listaMembresias = membresiaServicio.obtenerMembresia(); 
	} 
  
	public List<Membresia> getListaMembresias() {
		return listaMembresias;
	}

	public void setListaMembresias(List<Membresia> listaMembresias) {
		this.listaMembresias = listaMembresias;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
