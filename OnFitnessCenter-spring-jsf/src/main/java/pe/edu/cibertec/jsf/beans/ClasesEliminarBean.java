package pe.edu.cibertec.jsf.beans;

import java.util.Map; 
import javax.annotation.PostConstruct; 
import javax.faces.context.FacesContext; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.servicio.fachada.ClasesFachada;
 
@Component
@Scope("view")
public class ClasesEliminarBean {
	
	private ClasesFachada clasesFachada;
	private Integer id;
	private Clases clases;
	Map<String, String> params;
 
	public ClasesEliminarBean(ClasesFachada clasesFachada) {
		System.out.println("Iniciando eliminar ClasesBean");
		this.clasesFachada = clasesFachada;
		clases = new Clases();
	}

	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		FacesContext fc = FacesContext.getCurrentInstance();
		params = fc.getExternalContext().getRequestParameterMap();

		System.out.println("validando");
		if (!params.isEmpty()) {
			id = Integer.parseInt(params.get("id")); 
			clases = clasesFachada.obtenerPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar SocioEliminarBean");
 
		clasesFachada.eliminar(id); 
		return "/clases/listar.xhtml?faces-redirect=true";
	}
	public String regresar() {
		System.out.println("Sin cambios regresar"); 
		return "/clases/listar.xhtml?faces-redirect=true";
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
  
	public Clases getClases() {
		return clases;
	}

	public void setClases(Clases clases) {
		this.clases = clases;
	}
 

}
