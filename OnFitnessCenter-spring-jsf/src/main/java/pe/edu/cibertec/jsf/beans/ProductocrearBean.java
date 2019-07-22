package pe.edu.cibertec.jsf.beans;
 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Productos; 
import pe.edu.cibertec.servicio.fachada.ProductoFachada;
import pe.edu.cibertec.util.Util;
  
@Component
@Scope("request") //view
public class ProductocrearBean {
	
	private ProductoFachada productoFachada;
	private Productos producto;
  
	public ProductocrearBean(ProductoFachada productoFachada) { 
		this.productoFachada = productoFachada;
		producto = new Productos(); 
	}
 
	public String crear() {
		producto.setFechacreacion(Util._obt_fecha());
		producto.setFlag(true);
 
		productoFachada.crear(producto);  
		return "/productos/listar.xhtml?faces-redirect=true";
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos Producto) {
		this.producto = Producto;
	}
   
}
