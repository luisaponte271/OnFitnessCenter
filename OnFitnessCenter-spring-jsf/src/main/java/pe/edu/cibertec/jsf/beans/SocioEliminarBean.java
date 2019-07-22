package pe.edu.cibertec.jsf.beans;

import java.util.Map;

import javax.annotation.PostConstruct; 
import javax.faces.context.FacesContext;
 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.servicio.fachada.SocioFachada;
 

@Component
@Scope("view") 
public class SocioEliminarBean {

	private Integer id;
	private Socio socio;
	Map<String, String> params;
	
	private SocioFachada socioFachada;
  
	public SocioEliminarBean(SocioFachada socioFachada) {
		System.out.println("Iniciando eliminar SocioBean");
		this.socioFachada = socioFachada;
		socio = new Socio();
	}

	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		FacesContext fc = FacesContext.getCurrentInstance();
		params = fc.getExternalContext().getRequestParameterMap();

		System.out.println("validando");
		if (!params.isEmpty()) {
			id = Integer.parseInt(params.get("id")); 
			socio = socioFachada.obtenerPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar SocioEliminarBean"); 
		System.out.println("el id del socio es: " + id);

		socioFachada.eliminar(id);  
		return "/socio/listar.xhtml?faces-redirect=true";
	}
	public String regresar() {
		System.out.println("Sin cambios regresar"); 
		return "/socio/listar.xhtml?faces-redirect=true";
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

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}
  
}
