package pe.edu.cibertec.jsf.beans;

import java.util.List; 

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioClasesJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosJpaImpl;
 

@ManagedBean
@ViewScoped
public class ClasesBean {

	private List<Clases> listaClases;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ClasesBean() {

	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de TiendaBean");
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioClasesJpaImpl repoClases =
					new RepositorioClasesJpaImpl(em);
			listaClases = repoClases.obtenerTodos();
		} finally {
			em.close();
		}
	}
	public String delete() { 
		return "";
	}
	public List<Clases> getListaClases() {
		return listaClases;
	}

	public void setListaClasess(List<Clases> listaClases) {
		this.listaClases = listaClases;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
