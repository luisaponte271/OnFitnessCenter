package pe.edu.cibertec.jsf.beans.socio;

import java.util.Map; 
import javax.annotation.PostConstruct; 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext; 
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean; 
import pe.edu.cibertec.servicio.SocioServicio;
  
@ManagedBean
@ViewScoped
public class SocioEliminarBean {
 
	private Integer id;
	private Socio socio;
	Map<String,String> params;
	 
	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public SocioEliminarBean() {
		System.out.println("Iniciando eliminar SocioBean");
		socio = new Socio();
	}
	 
	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		params = fc.getExternalContext().getRequestParameterMap();

		System.out.println("validando");
		if (!params.isEmpty()) {
			id = Integer.parseInt(params.get("id"));
			SocioServicio socioServicio = configuracionAppBean.getSocioServicio();
			socio =  socioServicio.obtenerSociosPorId(id);
			 
		}
	}
	 
	public String eliminar() { 
		System.out.println("Iniciando Eliminar SocioEliminarBean");
		SocioServicio socioServicio = configuracionAppBean.getSocioServicio();
		System.out.println("el id del socio es: " + id);
		socioServicio.eliminar(id); 
		  
		return "/socio/listar.xhtml?faces-redirect=true";
	}
	
	public String regresar() {
		System.out.println("Sin cambios regresar");
 
		return "/socio/listar.xhtml?faces-redirect=true";
	}
	  
	public Integer getId() {
		System.out.println("validando 2");
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

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
  
}
