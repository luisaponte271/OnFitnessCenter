package pe.edu.cibertec.jsf.beans;

import java.text.ParseException;   
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.servicio.fachada.ClasesFachada;
import pe.edu.cibertec.util.Util;

@Component
@Scope("view")
public class ClasescrearBean {
	 
	private Clases clases;
	private boolean lunes;
	private boolean martes;
	private boolean miercoles;
	private boolean jueves;
	private boolean viernes;
	private boolean sabado;
	private boolean domingo;
	private ClasesFachada clasesFachada;
 
	public ClasescrearBean(ClasesFachada clasesFachada) {
		this.clasesFachada = clasesFachada;
		clases = new Clases();
	}
 
	public String crear() throws ParseException {
		this.clases.setHorario_inicio(Util._convertirxhora(clases.getHorario_inicio()));
		this.clases.setHorario_fin(Util._convertirxhora(clases.getHorario_fin()));
		this.clases.setFlag(true);
		 
		clasesFachada.crear(clases); 
		return "/clases/listar.xhtml?faces-redirect=true";
	}

	public void selecionarcheck() {
		this.clases.setLunes(Util._obt_dia(lunes));
		this.clases.setMartes(Util._obt_dia(martes));
		this.clases.setMiercoles(Util._obt_dia(miercoles));
		this.clases.setJueves(Util._obt_dia(jueves));
		this.clases.setViernes(Util._obt_dia(viernes));
		this.clases.setSabado(Util._obt_dia(sabado));
		this.clases.setDomingo(Util._obt_dia(domingo));
	}

	public Clases getClases() {
		return clases;
	}

	public void setClases(Clases clases) {
		this.clases = clases;
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
