package pe.edu.cibertec.jsf.beans.socio;

 
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
 


import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.SocioServicio;
 

@ManagedBean
@ViewScoped
public class SocioEliminarBean {
 
	private Integer id;
	private String nombre;
	 
	@ManagedProperty(value = "#{socioBean}")
	private SocioBean socioBean;

	public SocioEliminarBean() {

	}
	 
	@PostConstruct
	public void init() {
	  
	}
	 
	public String delete() { 
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		
		System.out.println("delete socio");
//		Map<String, String> params = socioBean.getEx().getRequestParameterMap();
 
		System.out.println("validando");
		if(!params.isEmpty()) { 
		Integer id = Integer.parseInt(params.get("id"));
		String nombre = params.get("nombre") + params.get("apellido");
		System.out.println("llave" + id);
	//	SocioServicio.eliminar(id);
		}
		return "/socio/listar.xhtml?faces-redirect=true"; 
	}
	  
	public Integer getId() {
		System.out.println("validando 2");
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public SocioBean getSocioBean() {
		return socioBean;
	}

	public void setSocioBean(SocioBean socioBean) {
		this.socioBean = socioBean;
	}
 
}
