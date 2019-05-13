package pe.edu.cibertec.jsf.beans.membresia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.SocioServicio;
 

@ManagedBean
@ViewScoped
public class MembresiaBean {
	 
	private Integer id_socio;
	private List<Membresia> listaMembresias;
	private SocioServicio socioServicio;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;
  
	public MembresiaBean() {
		listaMembresias = new ArrayList<Membresia>();
	}


	@PostConstruct
	public void init() { 
		this.id_socio = configuracionAppBean.getId_socio();  
		SocioServicio socioServicio = configuracionAppBean.getSocioServicio(); 
		listaMembresias =  socioServicio.getRepositorioMembresia().obtenerPorId(id_socio);
		
		 
	}

	public List<Membresia> getListaMembresias() {
		return listaMembresias;
	}

	public void setListaMembresias(List<Membresia> listaMembresias) {
		this.listaMembresias = listaMembresias;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public Integer getId_socio() {
		return id_socio;
	}

	public void setId_socio(Integer id_socio) {
		this.id_socio = id_socio;
	}

	public SocioServicio getSocioServicio() {
		return socioServicio;
	}

	public void setSocioServicio(SocioServicio socioServicio) {
		this.socioServicio = socioServicio;
	}
 

}
