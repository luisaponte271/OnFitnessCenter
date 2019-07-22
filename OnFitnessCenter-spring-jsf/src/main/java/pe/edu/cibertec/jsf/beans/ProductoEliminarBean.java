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
public class ProductoEliminarBean {
	
	private ProductoFachada productoFachada;
	private Integer id;
	private Productos productos;
	Map<String, String> params;

	public ProductoEliminarBean(ProductoFachada productoFachada) {
		System.out.println("Iniciando eliminar ProductoBean");
		productos = new Productos();
	}

	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		FacesContext fc = FacesContext.getCurrentInstance();
		params = fc.getExternalContext().getRequestParameterMap();

		System.out.println("validando");
		if (!params.isEmpty()) {
			id = Integer.parseInt(params.get("id")); 
			productos = productoFachada.obtenerPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar ProductoEliminarBean");
  
		productoFachada.eliminar(id); 
		return "/productos/listar.xhtml?faces-redirect=true";
	}
	public String regresar() {
		System.out.println("Sin cambios regresar"); 
		return "/productos/listar.xhtml?faces-redirect=true";
	}
	
	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
  
	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	} 

}
