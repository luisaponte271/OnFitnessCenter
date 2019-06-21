package pe.edu.cibertec.jsf.beans.membresia;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map; 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext; 
import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Tipomembresia;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.MembresiaServicio;
import pe.edu.cibertec.servicio.SocioServicio;
import pe.edu.cibertec.servicio.TipoMembresiaServicio;
import pe.edu.cibertec.util.Util;   
  
@ManagedBean
@SessionScoped 
public class MembresiaCrearBean {
	   
	private Membresia membresia; 
	private List<Tipomembresia> listatipomembresia;
	private TipoMembresiaServicio tipoMembresiaServicio;
//	private SocioServicio socioServicio;
	private MembresiaServicio membresiaServicio;
	
//	private Integer idSeleccionado; 
	private Integer idSocio;
	private FacesContext fc;
	
	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;
    
	public MembresiaCrearBean() {
		System.out.println("Iniciando  MembresiaBean");
		
		membresia = new Membresia();
		listatipomembresia = new ArrayList<Tipomembresia>();
	
	}
	 	
	@PostConstruct
	public void init() { 
		System.out.println("Iniciando configuración de MembresiaBean");
		fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		idSocio = Integer.parseInt(params.get("id"));
		System.out.println("id del socio :" + idSocio);
		
		tipoMembresiaServicio = configuracionAppBean.getTipomembresiaServicio();
		listatipomembresia = tipoMembresiaServicio.obtenerTipoMembresia();
	//	socioServicio = configuracionAppBean.getSocioServicio();
		//membresiaServicio = configuracionAppBean.getMem
	}
	
	public String crear() throws ParseException   {  
		membresia.setFechacreacion((new Date().toString())); 
		membresia.setFechacreacion(Util._convertirxfecha(membresia.getFechacreacion())); 
		membresia.setFecha_inicio(Util._convertirxfecha(membresia.getFecha_inicio())); 
		membresia.setFecha_vencimiento(Util._sumarDiasFecha(membresia.getFecha_inicio(), membresia.getDia()));
		membresia.setFlag(false); 
		
		 
	 
	//	socioServicio.agregarMembresia(membresia);
		 
		
//		EntityManager em = configuracionAppBean.getEntityManager();
//		EntityManager em2 = configuracionAppBean.getEntityManager();
//		 
//		try {
//			RepositorioTipoMembresiaJpaImpl repoTipo =
//					new RepositorioTipoMembresiaJpaImpl(em);
//			
//			RepositorioMembresiaJpaImpl repomembresia =
//					new RepositorioMembresiaJpaImpl(em);
//			
//			membresia.setTipomembresia(repoTipo
//					.obtenerPorId(membresia.getTipomembresia().getId()));
//			  
//			_calcularprecioxdia(membresia.getTipomembresia().getId());
//			
//			em2.getTransaction().begin();
//			repomembresia.agregar(membresia); 
//			em2.getTransaction().commit();
//			
//		} finally {
//			em.close();
//			em2.close();
//		} 
		 
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

	public FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}

	
	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}

	public List<Tipomembresia> getListatipomembresia() {
		return listatipomembresia;
	}

	public void setListatipomembresia(List<Tipomembresia> listatipomembresia) {
		this.listatipomembresia = listatipomembresia;
	}

	public TipoMembresiaServicio getTipoMembresiaServicio() {
		return tipoMembresiaServicio;
	}

	public void setTipoMembresiaServicio(TipoMembresiaServicio tipoMembresiaServicio) {
		this.tipoMembresiaServicio = tipoMembresiaServicio;
	}

//	public Integer getIdSeleccionado() {
//		return idSeleccionado;
//	}
//
//	public void setIdSeleccionado(Integer idSeleccionado) {
//		this.idSeleccionado = idSeleccionado;
//	}

//	public Integer getIdSocio() {
//		return idSocio;
//	}
//
//	public void setIdSocio(Integer idSocio) {
//		this.idSocio = idSocio;
//	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
	
	
}
