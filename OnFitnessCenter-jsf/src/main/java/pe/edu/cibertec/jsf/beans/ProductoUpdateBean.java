package pe.edu.cibertec.jsf.beans;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosJpaImpl;
 
@ManagedBean
@ViewScoped
public class ProductoUpdateBean {
	
	private Integer id;
	private Productos Producto; 
 

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ProductoUpdateBean() {
		Producto = new Productos();
	}

	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		id = Integer.parseInt(params.get("id"));
		EntityManager em = configuracionAppBean.getEntityManager();
	 
		try {
			RepositorioProductosJpaImpl repoProducto =
					new RepositorioProductosJpaImpl(em);
 
		Producto =  repoProducto.obtenerPorId(id);
		   
		} finally {
			em.close();
		}
	}
	public String actualizarProducto() {  
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioProductosJpaImpl repoProducto =
					new RepositorioProductosJpaImpl(em);
		 em.getTransaction().begin();
		 repoProducto.actualizar(Producto);
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
  
	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
