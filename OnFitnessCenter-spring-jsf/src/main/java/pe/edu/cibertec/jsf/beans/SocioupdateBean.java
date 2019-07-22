package pe.edu.cibertec.jsf.beans;

import java.text.ParseException;
import java.util.Map;

import javax.annotation.PostConstruct; 
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.servicio.fachada.SocioFachada;
import pe.edu.cibertec.util.Util;

@Component
@Scope("view")  
public class SocioupdateBean {
	
	private Integer id;
	private Socio Socio; 
	
	private SocioFachada socioFachada;
  
	public SocioupdateBean(SocioFachada socioFachada) {
		this.socioFachada = socioFachada;
		Socio = new Socio();
	}

	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		if (!params.isEmpty()) {
		id = Integer.parseInt(params.get("id"));
		 
		Socio = socioFachada.obtenerPorId(id); 
		}
	}
	public String actualizarSocio() throws ParseException {
		Socio.setFecha_nac(Util._convertirxfecha(Socio.getFecha_nac())); 
 		
		socioFachada.actualizar(Socio); 
		return "/socio/listar.xhtml?faces-redirect=true";
	}

	public Socio getSocio() {
		return Socio;
	}

	public void setSocio(Socio Socio) {
		this.Socio = Socio;
	}
 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
