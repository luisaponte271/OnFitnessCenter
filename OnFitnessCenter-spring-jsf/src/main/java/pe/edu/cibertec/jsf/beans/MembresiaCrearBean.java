package pe.edu.cibertec.jsf.beans;

import java.math.BigDecimal;
import java.text.ParseException; 
import java.util.Date;
import java.util.List; 
import javax.annotation.PostConstruct; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.dominio.Tipomembresia;
import pe.edu.cibertec.servicio.fachada.MembresiaFachada;
import pe.edu.cibertec.servicio.fachada.SocioFachada;
import pe.edu.cibertec.servicio.fachada.TipoMembresiaFachada;
import pe.edu.cibertec.util.Util;

@Component
@Scope("view")
public class MembresiaCrearBean {
	
	private SocioFachada socioFachada;
	private TipoMembresiaFachada tipoMembresiaFachada;
	private MembresiaFachada membresiaFachada;
	private Membresia membresia;
	private List<Socio> listaSocios;
	private List<Tipomembresia> listatipomembresia;
 
	public MembresiaCrearBean(SocioFachada socioFachada,TipoMembresiaFachada tipoMembresiaFachada, MembresiaFachada membresiaFachada) {
		System.out.println("Iniciando  MembresiaBean");
		this.socioFachada = socioFachada;
		this.tipoMembresiaFachada = tipoMembresiaFachada;
		this.membresiaFachada = membresiaFachada;
		membresia = new Membresia(); 
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de MembresiaBean"); 
		listaSocios = socioFachada.obtenerTodos();
		listatipomembresia = tipoMembresiaFachada.obtenerTodos();
	}

	public String crear() throws ParseException { 
		_calcularprecioxdia(membresia.getTipomembresia().getId());
		membresia.setFechacreacion((new Date().toString()));
		membresia.setFechacreacion(Util._convertirxfecha(membresia.getFechacreacion()));
		membresia.setFecha_inicio(Util._convertirxfecha(membresia.getFecha_inicio()));
		membresia.setFecha_vencimiento(Util._sumarDiasFecha(membresia.getFecha_inicio(), membresia.getDia()));
		membresia.setFlag(false);
		  
		membresiaFachada.crear(membresia); 
		return "/membresia/listar.xhtml?faces-redirect=true";
	}

	public void _calcularprecioxdia(Integer I) {
		switch (I) {
		case 1:
			this.membresia.setPrecio(new BigDecimal("33.00"));
			this.membresia.setDia(7);
			break;
		case 2:
			this.membresia.setPrecio(new BigDecimal("150.00"));
			this.membresia.setDia(30);
			break;
		case 3:
			this.membresia.setPrecio(new BigDecimal("1250.00"));
			this.membresia.setDia(365);
			break;
		default:
			this.membresia.setPrecio(new BigDecimal("0"));
			this.membresia.setDia(0);
			break;
		}
	}

	public List<Tipomembresia> getListatipomembresia() {
		return listatipomembresia;
	}

	public void setListatipomembresia(List<Tipomembresia> listatipomembresia) {
		this.listatipomembresia = listatipomembresia;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}
 
}
