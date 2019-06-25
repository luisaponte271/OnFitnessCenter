package pe.edu.cibertec.jsf.beans.socio;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.SocioServicio;
  
@ManagedBean
@ViewScoped
public class SocioBean {

	private List<Socio> listaSocios;
	private SocioServicio SocioServicio; 

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;
	
	public SocioBean() {

	}
	 
	@PostConstruct
	public void init() {
		System.out.println("init socioBean");
		SocioServicio = configuracionAppBean.getSocioServicio();
		listaSocios = SocioServicio.obtenerSocios();
	}
	   
	public SocioServicio getSocioServicio() {
		return SocioServicio;
	}

	public void setSocioServicio(SocioServicio socioServicio) {
		SocioServicio = socioServicio;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
