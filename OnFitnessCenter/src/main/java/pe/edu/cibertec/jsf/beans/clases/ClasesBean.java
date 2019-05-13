package pe.edu.cibertec.jsf.beans.clases;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.ClasesServicio;

@ManagedBean
@ViewScoped
public class ClasesBean {

	private List<Clases> listaClases;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ClasesBean() {

	}

	@PostConstruct
	public void init() {
		ClasesServicio ClasesServicio = configuracionAppBean.getClasesServicio();
		listaClases = ClasesServicio.obtenerClases();
	}

	public List<Clases> getListaClases() {
		return listaClases;
	}

	public void setListaClasess(List<Clases> listaClases) {
		this.listaClases = listaClases;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
