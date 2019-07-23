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
public class ProductoupdateBean {
	
	private ProductoFachada productoFachada;
	private Integer id;
	private Productos producto; 
  

	public ProductoupdateBean(ProductoFachada productoFachada) {
		this.productoFachada = productoFachada;
		producto = new Productos();
		
	}

	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		id = Integer.parseInt(params.get("id"));
		if (!params.isEmpty()) { 
			producto = productoFachada.obtenerPorId(id); 
		} 
	}
	public String actualizar() {    
		productoFachada.actualizar(producto); 
		return "/productos/listar.xhtml?faces-redirect=true";
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}
   
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
