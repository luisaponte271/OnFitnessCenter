package pe.edu.cibertec.jsf.beans;
  
import java.text.ParseException; 
import java.util.Date;
import java.util.List;  
import javax.annotation.PostConstruct; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Compras; 
import pe.edu.cibertec.dominio.Productos;  
import pe.edu.cibertec.servicio.fachada.ComprasFachada;
import pe.edu.cibertec.servicio.fachada.ProductoFachada;
import pe.edu.cibertec.util.Util;
  
@Component
@Scope("view")
public class ComprasCrearBean { 
	
	private ProductoFachada productosFachada;
	private ComprasFachada comprasFachada;
	private Compras compras; 
	private List<Productos> listaProductos; 
	
	public ComprasCrearBean(ProductoFachada productosFachada, ComprasFachada comprasFachada) { 
		System.out.println("Iniciando configuración de Cargar");
		this.comprasFachada = comprasFachada;
		this.productosFachada = productosFachada;
	    compras = new Compras(); 
 	}
	
	@PostConstruct
	public void init() { 
		listaProductos = productosFachada.obtenerTodos(); 
	}
  
	public String crearCompra() throws ParseException {
		compras.setFechacreacion((new Date().toString())); 
	 	compras.setFechacreacion(Util._convertirxfecha(compras.getFechacreacion())); 
		compras.setFlag(true);
		
		compras.setProducto(productosFachada.obtenerPorId(compras.getProducto().getId())); 
		compras.setTotal(Util.Calculate(compras.getProducto().getPrecio(), compras.getCantidad()));
		
		comprasFachada.crear(compras); 
		return "/compras/listar.xhtml?faces-credirect=true";
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
  
}
