package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.ViewScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosIbatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioIbatisImpl;
import pe.edu.cibertec.util.Util;
 

@ManagedBean
@ViewScoped
public class ProductoCrearBean {

	private Productos Producto;
//	private ProductosServicio ProductoServicio;
 
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ProductoCrearBean() { 
		Producto = new Productos(); 
	}

	@PostConstruct
	public void init() { 
		//ProductoServicio = configuracionAppBean.getProductoServicio(); 
	}
  
	public String crearProducto() {
		Producto.setFechacreacion(Util._obt_fecha());
		Producto.setFlag(true);

		SqlSession sqlsession  = configuracionAppBean.getSqlSessionFactory();   
		RepositorioProductosIbatisImpl repoProducto = new RepositorioProductosIbatisImpl(sqlsession); 
		
		repoProducto.agregar(Producto);
		sqlsession.commit();
		   	
		
		return "/productos/listar.xhtml?faces-redirect=true";
	}

	public Productos getProducto() {
		return Producto;
	}

	public void setProducto(Productos Producto) {
		this.Producto = Producto;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
 
	
}
