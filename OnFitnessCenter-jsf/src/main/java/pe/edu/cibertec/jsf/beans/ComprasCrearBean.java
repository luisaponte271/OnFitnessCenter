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

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Compras; 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.RepositorioCompras;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasIbatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosIbatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioIbatisImpl;
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
		
		SqlSession sqlsession  = configuracionAppBean.getSqlSessionFactory();   
		RepositorioProductosIbatisImpl repoProductos = new RepositorioProductosIbatisImpl(sqlsession); 
		
		listaProductos = repoProductos.obtenerTodos(); 
	}
  
	public String crearCompra() throws ParseException {
		compras.setFechacreacion((new Date().toString())); 
	 	compras.setFechacreacion(Util._convertirxfecha(compras.getFechacreacion())); 
		compras.setFlag(true);
		
		SqlSession sqlsession  = configuracionAppBean.getSqlSessionFactory();   
		RepositorioProductosIbatisImpl repoProductos = new RepositorioProductosIbatisImpl(sqlsession); 
		RepositorioComprasIbatisImpl repoCompras = new RepositorioComprasIbatisImpl(sqlsession); 
		
		compras.setProducto(repoProductos.obtenerPorId(compras.getProducto().getId())); 
		compras.setTotal(Util.Calculate(compras.getProducto().getPrecio(), compras.getCantidad()));
		
		repoCompras.agregar(compras);
		sqlsession.commit();
	 	
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
