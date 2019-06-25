package pe.edu.cibertec.jsf.beans.producto;

import java.util.ArrayList;
import java.util.List; 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped; 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.ProductosServicio;

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
		ProductosServicio ProductosServicio = configuracionAppBean.getProductoServicio();
		listaProductos = ProductosServicio.obtenerProductos();
	}

	public List<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductoss(List<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
