package pe.edu.cibertec.jsf.beans;

import java.text.ParseException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Socio; 
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioJpaImpl; 
import pe.edu.cibertec.util.Util;
 

@ManagedBean
@ViewScoped
public class SocioCrearBean {

	private Socio Socio;
	//private SocioServicio socioServicio;
 
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public SocioCrearBean() { 
		Socio = new Socio(); 
	}

	@PostConstruct
	public void init() { 
		//socioServicio = configuracionAppBean.getSocioServicio();
		
	}
  
	public String crearSocio() throws ParseException {
		this.Socio.setFecha_nac(Util._convertirxfecha(Socio.getFecha_nac()));
		this.Socio.setFlag(true);
		
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioSocioJpaImpl repoSocio =
					new RepositorioSocioJpaImpl(em);
		 em.getTransaction().begin();
		 repoSocio.agregar(Socio);
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
 
	
}
