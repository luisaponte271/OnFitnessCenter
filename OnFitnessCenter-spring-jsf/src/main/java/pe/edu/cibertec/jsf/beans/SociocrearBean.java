package pe.edu.cibertec.jsf.beans;

import java.text.ParseException;  
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.servicio.fachada.SocioFachada;
import pe.edu.cibertec.util.Util; 
  
@Component
@Scope("request")
public class SociocrearBean {

	private SocioFachada socioFachada;
	private Socio Socio;
	
	public SociocrearBean(SocioFachada socioFachada) { 
		this.socioFachada = socioFachada;
		Socio = new Socio();
	}
 
	public String crear() throws ParseException {
		Socio.setFecha_nac(Util._convertirxfecha(Socio.getFecha_nac()));
		Socio.setFlag(true);
	 
		socioFachada.crear(Socio);
		return "/socio/listar.xhtml?faces-redirect=true";
	}

	public Socio getSocio() {
		return Socio;
	}

	public void setSocio(Socio socio) {
		this.Socio = socio;
	}
 
}
