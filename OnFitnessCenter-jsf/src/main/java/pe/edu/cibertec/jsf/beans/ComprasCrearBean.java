package pe.edu.cibertec.jsf.beans;

 
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;  
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

import org.hibernate.annotations.SelectBeforeUpdate;

import pe.edu.cibertec.dominio.Compras; 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.RepositorioCompras;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosJpaImpl;
import pe.edu.cibertec.util.Util;
 
  
@ManagedBean
@ViewScoped
public class ComprasCrearBean { 
	private Compras compras; 
	private List<Productos> listaProductos; 
	private Util util; 
  
	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ComprasCrearBean() { 
		System.out.println("Iniciando configuración de Cargar");
		if(compras == null || listaProductos == null) {
			compras = new Compras();
			listaProductos = new ArrayList<Productos>(); 
		}
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de CompraBean");
		
		
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioProductosJpaImpl repoProducto =
					new RepositorioProductosJpaImpl(em);
			listaProductos = repoProducto.obtenerTodos();
		} finally {
			em.close();
		}
	}
  
	public String crearCompra() throws ParseException {
		compras.setFechacreacion((new Date().toString())); 
	 	compras.setFechacreacion(Util._convertirxfecha(compras.getFechacreacion())); 
		compras.setFlag(true);
	 	
		EntityManager em = configuracionAppBean.getEntityManager();
		EntityManager em2 = configuracionAppBean.getEntityManager();
		
		try {
			RepositorioProductosJpaImpl repoProducto =
					new RepositorioProductosJpaImpl(em);
			
			RepositorioComprasJpaImpl repoCompras = 
					new RepositorioComprasJpaImpl(em2);
			 
			compras.setProducto(repoProducto
					.obtenerPorId(compras.getProducto().getId())); 
			
			compras.setTotal(Util.Calculate(compras.getProducto().getPrecio(), compras.getCantidad()));
			
			em2.getTransaction().begin();
			repoCompras.agregar(compras);
			em2.getTransaction().commit();
			
		} finally {
			em.close();
			em2.close();
		} 
		
		return "/compras/listar.xhtml?faces-redirect=true";
	}

	public Compras getCompras() {
		return compras;
	}

	public void setCompras(Compras compras) {
		this.compras = compras;
	}

	public List<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}
  
	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	




}
