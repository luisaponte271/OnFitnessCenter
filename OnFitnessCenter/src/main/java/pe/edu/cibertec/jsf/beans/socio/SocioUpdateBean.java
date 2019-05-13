package pe.edu.cibertec.jsf.beans.socio;

import java.text.ParseException;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.SocioServicio;
import pe.edu.cibertec.util.Util;

@ManagedBean
@ViewScoped
public class SocioUpdateBean {
	
	private Integer id;
	private Socio Socio; 
	private SocioServicio socioServicio;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public SocioUpdateBean() {
		Socio = new Socio();
	}

	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		this.id = Integer.parseInt(params.get("id"));
		socioServicio = configuracionAppBean.getSocioServicio(); 
		Socio =  socioServicio.obtenerSociosPorId(id);
	}
	public String actualizarSocio() throws ParseException {
		this.Socio.setFecha_nac(Util._convertirxfecha(Socio.getFecha_nac())); 
		
		socioServicio.actualizar(id , Socio); 
		return "/socio/listar.xhtml?faces-redirect=true";
	}

	public Socio getSocio() {
		return Socio;
	}

	public void setSocio(Socio Socio) {
		this.Socio = Socio;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
   
	public SocioServicio getSocioServicio() {
		return socioServicio;
	}

	public void setSocioServicio(SocioServicio socioServicio) {
		this.socioServicio = socioServicio;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
