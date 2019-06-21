package pe.edu.cibertec.jsf.beans.clases;

import java.text.ParseException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.ViewScoped;
 
import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
 
import pe.edu.cibertec.servicio.ClasesServicio;
import pe.edu.cibertec.util.Util;
 

@ManagedBean
@ViewScoped
public class ClasesCrearBean {

	private Clases Clases;
	private boolean lunes;
	private boolean martes;
	private boolean miercoles;
	private boolean jueves;
	private boolean viernes;
	private boolean sabado;
	private boolean domingo;
	private ClasesServicio Claseservicio;
 
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ClasesCrearBean() { 
		Clases = new Clases(); 
	}

	@PostConstruct
	public void init() { 
		Claseservicio = configuracionAppBean.getClasesServicio(); 
		Clases.setFlag(true);
	}
  
	public String crearClases() throws ParseException {
		 this.Clases.setHorario_inicio(Util._convertirxhora(Clases.getHorario_inicio()));
		 this.Clases.setHorario_fin(Util._convertirxhora(Clases.getHorario_fin()));
		 
	 
		Claseservicio.agregar(Clases);
		return "/clases/listar.xhtml?faces-redirect=true";
	}
	
	public void selecionarcheck(){  
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
 
	public ClasesServicio getClaseservicio() {
		return Claseservicio;
	}

	public void setClaseservicio(ClasesServicio claseservicio) {
		Claseservicio = claseservicio;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
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
