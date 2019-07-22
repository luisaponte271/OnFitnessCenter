package pe.edu.cibertec.jsf.beans;

import java.util.Map; 
import javax.annotation.PostConstruct; 
import javax.faces.context.FacesContext; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Productos; 
import pe.edu.cibertec.servicio.fachada.ProductoFachada; 
 
@Component
@Scope("view")
public class ProductoUpdateBean {
	
	private ProductoFachada productoFachada;
	private Integer id;
	private Productos Producto; 
  

	public ProductoUpdateBean() {
		Producto = new Productos();
	}

	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		id = Integer.parseInt(params.get("id"));
		if (!params.isEmpty()) { 
			Producto = productoFachada.obtenerPorId(id); 
		} 
	}
	public String actualizarProducto() {    
		productoFachada.actualizar(Producto); 
		return "/productos/listar.xhtml?faces-redirect=true";
	}

	public Productos getProducto() {
		return Producto;
	}

	public void setProducto(Productos Producto) {
		this.Producto = Producto;
	}
   
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
