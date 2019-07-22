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
	
	private ClasesFachada clasesFachada;
	private Clases Clases;
	private boolean lunes;
	private boolean martes;
	private boolean miercoles;
	private boolean jueves;
	private boolean viernes;
	private boolean sabado;
	private boolean domingo;
 
	public ClasescrearBean(ClasesFachada clasesFachada) {
		this.clasesFachada = clasesFachada;
		Clases = new Clases();
	}
 
	public String crear() throws ParseException {
		this.Clases.setHorario_inicio(Util._convertirxhora(Clases.getHorario_inicio()));
		this.Clases.setHorario_fin(Util._convertirxhora(Clases.getHorario_fin()));
		this.Clases.setFlag(true);
		 
		clasesFachada.crear(Clases); 
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
