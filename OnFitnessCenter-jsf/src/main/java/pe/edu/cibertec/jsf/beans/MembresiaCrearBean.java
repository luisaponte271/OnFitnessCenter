package pe.edu.cibertec.jsf.beans;

import java.math.BigDecimal; 
import java.util.ArrayList; 
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.persistence.Embeddable;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Tipomembresia;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;   
import pe.edu.cibertec.repositorio.impl.RepositorioSocioJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioTipoMembresiaJpaImpl; 
 

@ManagedBean
@ViewScoped
public class MembresiaCrearBean {
	   
	private Membresia membresia; 
	private List<Tipomembresia> listatipomembresia;
	private Integer idSeleccionado; 
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
		
//		EntityManager em = configuracionAppBean.getEntityManager();
		EntityManager em2 = configuracionAppBean.getEntityManager();
		try {
//			RepositorioSocioJpaImpl repoSocio =
//					new RepositorioSocioJpaImpl(em);
//			
			 RepositorioTipoMembresiaJpaImpl repotipomembresia = 
					 new RepositorioTipoMembresiaJpaImpl(em2);
			 
			 listatipomembresia = repotipomembresia.obtenerTodos();
//			 
//			 
//		  membresia.setSocio(repoSocio.obtenerPorId(idSocio));
//		 
		
		  
		} finally {
//			em.close();
//			em2.close();
		} 
	}
	public FacesContext getFacesContext() {
	    return FacesContext.getCurrentInstance();
	}
//	public void cargardatoseleccionado() { 
//		EntityManager em = configuracionAppBean.getEntityManager();
//		try {
//			
//			
//			RepositorioTipoMembresiaJpaImpl repoTipo =
//		new RepositorioTipoMembresiaJpaImpl(em);
//			
//			membresia.setTipomembresia(repoTipo
//					.obtenerPorId(idSeleccionado));
//			  
//			_calcularprecioxdia(membresia.getTipomembresia().getId());
//			
//
//		} finally {
//			em.close();
//		}
//	}
	
	public String getCrear()   { 
//		membresia.setFechacreacion((new Date().toString())); 
//		membresia.setFechacreacion(Util._convertirxfecha(membresia.getFechacreacion())); 
//		membresia.setFecha_inicio(Util._convertirxfecha(membresia.getFecha_inicio())); 
//		membresia.setFecha_vencimiento(Util._sumarDiasFecha(membresia.getFecha_inicio(), membresia.getDia()));
//		membresia.setFlag(false); 
//		
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
	
	public Integer getIdSeleccionado() {
		return idSeleccionado;
	}

	public void setIdSeleccionado(Integer idSeleccionado) {
		this.idSeleccionado = idSeleccionado;
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

	public Integer getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(Integer idSocio) {
		this.idSocio = idSocio;
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

	public List<Tipomembresia> getListatipomembresia() {
		return listatipomembresia;
	}

	public void setListatipomembresia(List<Tipomembresia> listatipomembresia) {
		this.listatipomembresia = listatipomembresia;
	} 
}
