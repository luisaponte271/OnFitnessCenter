package pe.edu.cibertec.jsf.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.repositorio.RepositorioProductos;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosIbatisImpl;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

@ManagedBean
@ViewScoped
public class ProductoBean {

	private List<Productos> listaProductos;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ProductoBean() {
		System.out.println("Creando instancia de TiendaBean");
		listaProductos = new ArrayList<Productos>();
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de ProductoBean");
		SqlSession sqlsession  = configuracionAppBean.getSqlSessionFactory();   
		RepositorioProductosIbatisImpl repoProducto = new RepositorioProductosIbatisImpl(sqlsession); 
		
//		sqlsession.getMapper(ProductoMapper.class); 
		listaProductos = repoProducto.obtenerTodos(); 
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
