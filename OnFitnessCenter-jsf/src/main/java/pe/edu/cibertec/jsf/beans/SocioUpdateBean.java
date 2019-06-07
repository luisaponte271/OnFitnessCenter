package pe.edu.cibertec.jsf.beans;

import java.text.ParseException;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioJpaImpl;
 
import pe.edu.cibertec.util.Util;

@ManagedBean
@ViewScoped
public class SocioUpdateBean {
	
	private Integer id;
	private Socio Socio; 
 

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public SocioUpdateBean() {
		Socio = new Socio();
	}

	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
		id = Integer.parseInt(params.get("id"));
		EntityManager em = configuracionAppBean.getEntityManager();
	 
		try {
			RepositorioSocioJpaImpl repoSocio =
					new RepositorioSocioJpaImpl(em);
 
		 Socio =  repoSocio.obtenerPorId(id);
		   
		} finally {
			em.close();
		}
	}
	public String actualizarSocio() throws ParseException {
		this.Socio.setFecha_nac(Util._convertirxfecha(Socio.getFecha_nac())); 
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioSocioJpaImpl repoSocio  =
					new RepositorioSocioJpaImpl(em);
		 em.getTransaction().begin();
		 repoSocio.actualizar(Socio);
		 em.getTransaction().commit();
		 
		} finally {
			em.close();
		}
		return "/socio/listar.xhtml?faces-redirect=true";
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
     

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
