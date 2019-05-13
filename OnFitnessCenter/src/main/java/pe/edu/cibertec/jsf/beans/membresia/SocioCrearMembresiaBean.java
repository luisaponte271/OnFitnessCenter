package pe.edu.cibertec.jsf.beans.membresia;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Socio;

import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.SocioServicio;
import pe.edu.cibertec.util.Util;

@ManagedBean
@SessionScoped
public class SocioCrearMembresiaBean {
 
	private String nombre_socio;
	private Socio Socio;
	private SocioServicio socioServicio;
	private Membresia membresia;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public SocioCrearMembresiaBean() {
		Socio = new Socio();
		membresia = new Membresia();
	}

	@PostConstruct
	public void init() { 
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		configuracionAppBean.setId_socio(Integer.parseInt(params.get("id")));
		socioServicio = configuracionAppBean.getSocioServicio();
		Socio = socioServicio.obtenerSociosPorId(configuracionAppBean.getId_socio());
		this.membresia.setId_socio(configuracionAppBean.getId_socio());
		this.nombre_socio = _nombrecompleto();
		 
	} 
	public String _nombrecompleto() { 
		return Socio.getNombre() + " " + Socio.getApellido_pat() + " " + Socio.getApellido_mat();
	}

	public String crearMembresia() throws ParseException { 
		membresia.setFechacreacion((new Date().toString())); 
		membresia.setFechacreacion(Util._convertirxfecha(membresia.getFechacreacion())); 
		membresia.setFecha_inicio(Util._convertirxfecha(membresia.getFecha_inicio())); 
		membresia.setFecha_Vencimiento(Util._sumarDiasFecha(membresia.getFecha_inicio(), membresia.getDia()));
		membresia.setEstado_des(estado(membresia.getFlag()));
		membresia.setMembresia_Des(membresia(membresia.getTipo_membresia()));
		
		socioServicio.agregarMembresia(membresia);
		return "/membresia/listar.xhtml?faces-redirect=true";
	}
	public String listarSocio() { 
		return "/socio/listar.xhtml?faces-redirect=true";
	}
	
	public String estado(boolean e) {  
		String r;
		if(e) { 
			r = "CANCELADO";
		} else { 
			r = "SIN PAGAR";
		} 
		return r;
	}
	public String membresia(Integer i) {  
		String r;
		switch (i) {
		case 0:
			r = "NO EXISTE";
			break;
		case 1:
			r = "MENSUAL";
			break;
		case 2:
			r = "ANUAL";
			break;
		case 3:
			r = "SEMANAL";
			break;
		default:
			r = "VISITANTE";
			break;
		}
		return r;
	}

	public void cargardatoseleccionado() {
		switch (membresia.getTipo_membresia()) {
		case 0:
			this.membresia.setPrecio(new BigDecimal("0"));
			this.membresia.setDia(0);
			this.membresia.setMembresia_Des("NO EXISTE");
			break;
		case 1:
			this.membresia.setPrecio(new BigDecimal("150.00"));
			this.membresia.setDia(30);
			this.membresia.setMembresia_Des("MENSUAL");
			break;
		case 2:
			this.membresia.setPrecio(new BigDecimal("1250.00"));
			this.membresia.setDia(365);
			this.membresia.setMembresia_Des("ANUAL");
			break;
		case 3:
			this.membresia.setPrecio(new BigDecimal("33.00"));
			this.membresia.setDia(7);
			this.membresia.setMembresia_Des("SEMANAL");
			break;
		default:
			this.membresia.setPrecio(new BigDecimal("0"));
			this.membresia.setDia(0);
			this.membresia.setMembresia_Des("VISITANTE");
			break;
		}
	}

	public Socio getSocio() {
		return Socio;
	}

	public void setSocio(Socio Socio) {
		this.Socio = Socio;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public SocioServicio getSocioServicio() {
		return socioServicio;
	}

	public void setSocioServicio(SocioServicio socioServicio) {
		this.socioServicio = socioServicio;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}
 
	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}
 
	public String getNombre_socio() {
		return nombre_socio;
	}

	public void setNombre_socio(String nombre_socio) {
		this.nombre_socio = nombre_socio;
	}

	 

}
