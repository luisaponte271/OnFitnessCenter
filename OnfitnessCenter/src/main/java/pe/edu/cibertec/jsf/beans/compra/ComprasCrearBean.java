package pe.edu.cibertec.jsf.beans.compra;
 
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;  
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped; 
import pe.edu.cibertec.dominio.Compras; 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;  
import pe.edu.cibertec.servicio.ComprasServicio;
import pe.edu.cibertec.servicio.ProductosServicio;
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
		ProductosServicio productosServicio = configuracionAppBean.getProductoServicio();
		listaProductos =  productosServicio.obtenerProductos();
	}
  
	public String crearCompra() throws ParseException {
		compras.setFechacreacion((new Date().toString())); 
	 	compras.setFechacreacion(Util._convertirxfecha(compras.getFechacreacion())); 
		compras.setFlag(true);
		
		ProductosServicio productosServicio = configuracionAppBean.getProductoServicio();
		ComprasServicio comprasServicio = configuracionAppBean.getComprasServicio(); 
		
		compras.setProducto(productosServicio.obtenerProductosPorId(compras.getProducto().getId())); 
		compras.setTotal(Util.Calculate(compras.getProducto().getPrecio(), compras.getCantidad()));
		comprasServicio.agregar(compras);
	  
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
