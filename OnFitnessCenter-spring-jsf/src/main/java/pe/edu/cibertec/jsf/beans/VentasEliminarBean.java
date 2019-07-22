package pe.edu.cibertec.jsf.beans;

import java.util.Map; 
import javax.annotation.PostConstruct; 
import javax.faces.context.FacesContext; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.servicio.fachada.VentasFachada; 
 

@Component
@Scope("view")  
public class VentasEliminarBean {
	
	private VentasFachada ventasFachada;
	private Integer id;
	private Ventas ventas;
	Map<String, String> params;
 
	public VentasEliminarBean() {
		System.out.println("Iniciando eliminar Ventas");
		ventas = new Ventas();
	}

	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		FacesContext fc = FacesContext.getCurrentInstance();
		params = fc.getExternalContext().getRequestParameterMap();

		System.out.println("validando");
		if (!params.isEmpty()) {
			id = Integer.parseInt(params.get("id"));
	 
			ventas = ventasFachada.obtenerPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar ventaEliminarBean");
 
		ventasFachada.eliminar(id); 
		return "/ventas/listar.xhtml?faces-redirect=true";
	}
	public String regresar() {
		System.out.println("Sin cambios regresar");
 
		return "/ventas/listar.xhtml?faces-redirect=true";
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
    
	public Ventas getVentas() {
		return ventas;
	}

	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}
  
}
