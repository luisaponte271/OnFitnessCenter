package pe.edu.cibertec.jsf.beans;

import java.util.ArrayList;
import java.util.List; 

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioVentasJpaImpl;
 

@ManagedBean
@ViewScoped
public class VentasBean {

	private List<Ventas> listaVentas;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public VentasBean() {
			listaVentas = new ArrayList<Ventas>();
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de VentasBean");
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioVentasJpaImpl repoVentas =
					new RepositorioVentasJpaImpl(em);
			listaVentas = repoVentas.obtenerTodos();
		} finally {
			em.close();
		}
	}

	public List<Ventas> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentass(List<Ventas> listaVentas) {
		this.listaVentas = listaVentas;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
