package pe.edu.cibertec.jsf.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

 
import pe.edu.cibertec.dominio.Productos; 
import pe.edu.cibertec.repositorio.RepositorioProductos; 
import pe.edu.cibertec.repositorio.impl.RepositorioProductosJpaImpl;

@ManagedBean
@ViewScoped
public class ProductoBean {

	private List<Productos> listaProductos;

	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ProductoBean() {
		System.out.println("Creando instancia de TiendaBean");
		listaProductos = new ArrayList<Productos>();
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de ProductoBean");
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioProductosJpaImpl repoProducto =
					new RepositorioProductosJpaImpl(em);
			listaProductos = repoProducto.obtenerTodos();
		} finally {
			em.close();
		}
	}
	public String delete(){ 
		return "";
	}
	 
	public List<Productos> getListaProductos() {
		System.out.println("obtener listaProductos");
		return listaProductos;
	}

	public void setListaProductos(List<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
}
