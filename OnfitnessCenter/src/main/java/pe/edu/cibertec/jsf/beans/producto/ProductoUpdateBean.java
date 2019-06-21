package pe.edu.cibertec.jsf.beans.producto;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
 
import pe.edu.cibertec.servicio.ProductosServicio;

@ManagedBean
@ViewScoped
public class ProductoUpdateBean {
	
	private Integer id;
	private Productos Producto; 
	private ProductosServicio ProductoServicio;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ProductoUpdateBean() {
		Producto = new Productos();
	}

	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		this.id = Integer.parseInt(params.get("id"));
		
		ProductoServicio = configuracionAppBean.getProductoServicio(); 
		Producto =  ProductoServicio.obtenerProductosPorId(id);
	}
	public String actualizarProducto() {
		ProductoServicio.actualizar(id , Producto); 
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
   
	public ProductosServicio getProductoServicio() {
		return ProductoServicio;
	}

	public void setProductoServicio(ProductosServicio ProductoServicio) {
		this.ProductoServicio = ProductoServicio;
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
