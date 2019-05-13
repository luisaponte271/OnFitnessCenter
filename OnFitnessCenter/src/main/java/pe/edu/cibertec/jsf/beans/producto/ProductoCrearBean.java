package pe.edu.cibertec.jsf.beans.producto;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.ViewScoped;
 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
 
import pe.edu.cibertec.servicio.ProductosServicio;
import pe.edu.cibertec.util.Util;
 

@ManagedBean
@ViewScoped
public class ProductoCrearBean {

	private Productos Producto;
	private ProductosServicio ProductoServicio;
 
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ProductoCrearBean() { 
		Producto = new Productos(); 
	}

	@PostConstruct
	public void init() { 
		ProductoServicio = configuracionAppBean.getProductoServicio();
		Producto.setFechacreacion(Util._obt_fecha());
		Producto.setFlag(true);
	}
  
	public String crearProducto() {
		ProductoServicio.agregar(Producto);
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
