package pe.edu.cibertec.jsf.beans;

import java.util.ArrayList;
import java.util.List; 

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.RepositorioCompras;
import pe.edu.cibertec.repositorio.impl.RepositorioClasesJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasJpaImpl;
 
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
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioComprasJpaImpl repoCompras =
					new RepositorioComprasJpaImpl(em);
			listaCompras = repoCompras.obtenerTodos();
	 
		} finally {
			em.close();
		}
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
