package pe.edu.cibertec.jsf.beans.clases;

import java.text.ParseException;
import java.util.Map; 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext; 
import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;   
import pe.edu.cibertec.servicio.ClasesServicio;
import pe.edu.cibertec.util.Util;

@ManagedBean
@ViewScoped
public class ClasesUpdateBean {

	private Integer id;
	private Clases Clases;
	private boolean lunes;
	private boolean martes;
	private boolean miercoles;
	private boolean jueves;
	private boolean viernes;
	private boolean sabado;
	private boolean domingo;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ClasesUpdateBean() {
		Clases = new Clases();
	}

	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		id = Integer.parseInt(params.get("id"));
 
		ClasesServicio claseServicio = configuracionAppBean.getClasesServicio();
		Clases =  claseServicio.obtenerClasesPorId(id);

		this.lunes = Util._obt_dia_b(Clases.getLunes());
		this.martes = Util._obt_dia_b(Clases.getMartes());
		this.miercoles = Util._obt_dia_b(Clases.getMiercoles());
		this.jueves = Util._obt_dia_b(Clases.getJueves());
		this.viernes = Util._obt_dia_b(Clases.getViernes());
		this.sabado = Util._obt_dia_b(Clases.getSabado());
		this.domingo = Util._obt_dia_b(Clases.getDomingo()); 
	}

	public String actualizarClases() throws ParseException {
		this.Clases.setHorario_inicio(Util._convertirxhora(Clases.getHorario_inicio()));
		this.Clases.setHorario_fin(Util._convertirxhora(Clases.getHorario_fin()));
		
		ClasesServicio clasesServicio = configuracionAppBean.getClasesServicio();
		clasesServicio.actualizar(id, Clases);
		  
		return "/clases/listar.xhtml?faces-redirect=true";
	}

	public void selecionarcheck() {
		this.Clases.setLunes(Util._obt_dia(lunes));
		this.Clases.setMartes(Util._obt_dia(martes));
		this.Clases.setMiercoles(Util._obt_dia(miercoles));
		this.Clases.setJueves(Util._obt_dia(jueves));
		this.Clases.setViernes(Util._obt_dia(viernes));
		this.Clases.setSabado(Util._obt_dia(sabado));
		this.Clases.setDomingo(Util._obt_dia(domingo));
	}

	public Clases getClases() {
		return Clases;
	}

	public void setClases(Clases Clases) {
		this.Clases = Clases;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
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

	public boolean isLunes() {
		return lunes;
	}

	public void setLunes(boolean lunes) {
		this.lunes = lunes;
	}

	public boolean isMartes() {
		return martes;
	}

	public void setMartes(boolean martes) {
		this.martes = martes;
	}

	public boolean isMiercoles() {
		return miercoles;
	}

	public void setMiercoles(boolean miercoles) {
		this.miercoles = miercoles;
	}

	public boolean isJueves() {
		return jueves;
	}

	public void setJueves(boolean jueves) {
		this.jueves = jueves;
	}

	public boolean isViernes() {
		return viernes;
	}

	public void setViernes(boolean viernes) {
		this.viernes = viernes;
	}

	public boolean isSabado() {
		return sabado;
	}

	public void setSabado(boolean sabado) {
		this.sabado = sabado;
	}

	public boolean isDomingo() {
		return domingo;
	}

	public void setDomingo(boolean domingo) {
		this.domingo = domingo;
	}

}
