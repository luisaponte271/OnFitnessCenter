package pe.edu.cibertec.jsf.beans.clases;

import java.util.Map; 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;  
import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;  
import pe.edu.cibertec.servicio.ClasesServicio;
  
@ManagedBean
@ViewScoped
public class ClasesEliminarBean {
	
	private Integer id;
	private Clases clases;
	Map<String, String> params;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ClasesEliminarBean() {
		System.out.println("Iniciando eliminar ClasesBean");
		clases = new Clases();
	}

	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		FacesContext fc = FacesContext.getCurrentInstance();
		params = fc.getExternalContext().getRequestParameterMap();

		System.out.println("validando");
		if (!params.isEmpty()) {
			id = Integer.parseInt(params.get("id"));
			ClasesServicio clasesServicio = configuracionAppBean.getClasesServicio(); 
			clases = clasesServicio.obtenerClasesPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar SocioEliminarBean"); 
		ClasesServicio claseServicio = configuracionAppBean.getClasesServicio();
		
		System.out.println("el id de la clase es: " + id); 
		claseServicio.eliminar(id);
  
		return "/clases/listar.xhtml?faces-redirect=true";
	}
	public String regresar() {
		System.out.println("Sin cambios regresar");
 
		return "/clases/listar.xhtml?faces-redirect=true";
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
  
	public Clases getClases() {
		return clases;
	}

	public void setClases(Clases clases) {
		this.clases = clases;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
