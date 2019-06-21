package pe.edu.cibertec.jsf.beans.compra;

import java.math.BigDecimal;
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
public class CompraNuevoBean {
	private static final String Estado = "ACTIVO";
	private List<Productos> listaProductos;
	private Integer idSeleccionado;
	private Compras compras;
	private Productos productos;
	private ProductosServicio productosServicio;
	private ComprasServicio comprasServicio;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public CompraNuevoBean() {
		productos = new Productos();
		compras = new Compras();
		listaProductos = new ArrayList<Productos>();
		productos.setPrecio(new BigDecimal("0.00"));
		productos.setCosto(new BigDecimal("0.00"));
	}
	public void cargarDatosSeleccionados() {
		productosServicio = configuracionAppBean.getProductoServicio(); 
		productos = productosServicio.obtenerProductosPorId(getIdSeleccionado());

	}
	public String agregarCarrito() throws ParseException {
		compras.setFechacreacion((new Date().toString())); 
		compras.setFechacreacion(Util._convertirxfecha(compras.getFechacreacion())); 
		compras.setProducto(this.productos); 
	//	compras.setE(Estado);
		compras.setTotal(Calculate(productos.getPrecio(), compras.getCantidad()));
		comprasServicio.agregar(compras); 
		  
		return "/compras/nuevo.xhtml?faces-redirect=true";
	}
	public BigDecimal Calculate(BigDecimal P, Integer C ) { 
		BigDecimal T = BigDecimal.ZERO;

		T  = P.multiply(new BigDecimal(C)); 
    return T;
		 
	}

	@PostConstruct
	public void init() {
		comprasServicio = configuracionAppBean.getComprasServicio();
		productosServicio = configuracionAppBean.getProductoServicio();  
		listaProductos = productosServicio.obtenerProductos();
	}
	
	
	public List<Productos> getListaProductos() {
		return listaProductos;
	}
 
	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public Integer getIdSeleccionado() {
		return idSeleccionado;
	}

	public void setIdSeleccionado(Integer idSeleccionado) {
		this.idSeleccionado = idSeleccionado;
	}

	public void setListaProductos(List<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}
 
	public Compras getCompras() {
		return compras;
	}
	public void setCompras(Compras compras) {
		this.compras = compras;
	}
	public ProductosServicio getProductosServicio() {
		return productosServicio;
	}
	public void setProductosServicio(ProductosServicio productosServicio) {
		this.productosServicio = productosServicio;
	}
	public ComprasServicio getComprasServicio() {
		return comprasServicio;
	}
	public void setComprasServicio(ComprasServicio comprasServicio) {
		this.comprasServicio = comprasServicio;
	}
  
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	public Productos getProductos() {
		return productos;
	}

}
