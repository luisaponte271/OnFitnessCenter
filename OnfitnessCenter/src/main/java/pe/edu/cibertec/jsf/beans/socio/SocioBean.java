package pe.edu.cibertec.jsf.beans.socio;

 
import java.util.List;
import java.util.Map; 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext; 
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.SocioServicio;
  
@ManagedBean
@RequestScoped
public class SocioBean {

	private List<Socio> listaSocios;
	private SocioServicio SocioServicio; 
	private Integer id;
	private ExternalContext ex;
	 
	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;
	
	public SocioBean() {

	}
	 
	@PostConstruct
	public void init() {
		System.out.println("init socioBean");
		SocioServicio = configuracionAppBean.getSocioServicio();
		listaSocios = SocioServicio.obtenerSocios();
		FacesContext fc = FacesContext.getCurrentInstance();
		ex = fc.getCurrentInstance().getExternalContext();
	}
	   
	public ExternalContext getEx() {
		return ex;
	}

	public void setEx(ExternalContext ex) {
		this.ex = ex;
	}

	public Integer getId() {
		System.out.println("validando 2");
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
