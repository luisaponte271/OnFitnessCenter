package pe.edu.cibertec.jsf.beans.socio;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.SocioServicio;

@ManagedBean
@ViewScoped
public class SocioBean {

	private List<Socio> listaSocios;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public SocioBean() {

	}

	@PostConstruct
	public void init() {
		SocioServicio SocioServicio = configuracionAppBean.getSocioServicio();
		listaSocios = SocioServicio.obtenerSocios();
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
