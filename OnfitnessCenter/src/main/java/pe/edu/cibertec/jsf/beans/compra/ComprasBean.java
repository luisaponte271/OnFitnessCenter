package pe.edu.cibertec.jsf.beans.compra;

import java.util.ArrayList;
import java.util.List; 

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped; 
import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.RepositorioCompras; 
import pe.edu.cibertec.servicio.ComprasServicio;
 
@ManagedBean
@ViewScoped
public class ComprasBean {

	private List<Compras> listaCompras;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ComprasBean() {
			listaCompras = new ArrayList<Compras>();
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de ComprasBean");
		ComprasServicio comprasServicio = configuracionAppBean.getComprasServicio();
		listaCompras =  comprasServicio.obtenerCompras();
		  
	}
	 
	public List<Compras> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compras> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
}
