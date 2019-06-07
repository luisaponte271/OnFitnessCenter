package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosJpaImpl;

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
		
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioProductosJpaImpl repoProducto =
					new RepositorioProductosJpaImpl(em);
		 em.getTransaction().begin();
		 repoProducto.agregar(Producto);
		 em.getTransaction().commit();
		 
		} finally {
			em.close();
		}
		
		
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
