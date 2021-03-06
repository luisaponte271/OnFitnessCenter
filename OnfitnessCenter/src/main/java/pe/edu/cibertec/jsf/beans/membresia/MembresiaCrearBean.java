package pe.edu.cibertec.jsf.beans.membresia;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List; 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped;   
import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.dominio.Tipomembresia;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioMembresiaMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioTipoMembresiaMemoriaImpl;
import pe.edu.cibertec.servicio.MembresiaServicio;
import pe.edu.cibertec.servicio.SocioServicio;
import pe.edu.cibertec.servicio.TipoMembresiaServicio;
import pe.edu.cibertec.util.Util;

@ManagedBean
@ViewScoped
public class MembresiaCrearBean {

	private Membresia membresia;
	private List<Socio> listaSocios;
	private List<Tipomembresia> listatipomembresia;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public MembresiaCrearBean() {
		System.out.println("Iniciando  MembresiaBean");
		membresia = new Membresia();
		listaSocios = new ArrayList<Socio>();
		listatipomembresia = new ArrayList<Tipomembresia>();
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de MembresiaBean");
		SocioServicio socioServicio = configuracionAppBean.getSocioServicio();
		TipoMembresiaServicio tipoServicio = configuracionAppBean.getTipomembresiaServicio();
		  
		listaSocios = socioServicio.obtenerSocios();
		listatipomembresia = tipoServicio.obtenerTipoMembresia();
	}


	public String crear() throws ParseException { 
		_calcularprecioxdia(membresia.getTipomembresia().getId());
		membresia.setFechacreacion((new Date().toString()));
		membresia.setFechacreacion(Util._convertirxfecha(membresia.getFechacreacion()));
		membresia.setFecha_inicio(Util._convertirxfecha(membresia.getFecha_inicio()));
		membresia.setFecha_vencimiento(Util._sumarDiasFecha(membresia.getFecha_inicio(), membresia.getDia()));
		membresia.setFlag(false);
		 
		MembresiaServicio membresiaServicio = configuracionAppBean.getMembresiaServicio();
		 
		membresiaServicio.agregarMembresia(membresia); 
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

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
}
