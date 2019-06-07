package pe.edu.cibertec.jsf.beans;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.persistence.EntityManager;

import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosJpaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioJpaImpl;
 ;

@ManagedBean
@ViewScoped
public class SocioBean {

	private List<Socio> listaSocios;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public SocioBean() {

	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de TiendaBean");
		EntityManager em = configuracionAppBean.getEntityManager();
		try {
			RepositorioSocioJpaImpl repoSocio =
					new RepositorioSocioJpaImpl(em);
			listaSocios = repoSocio.obtenerTodos();
		} finally {
			em.close();
		}
	}
	
//	public String eliminar() {  
//		FacesContext fc = FacesContext.getCurrentInstance();
//		Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
//		int id = Integer.parseInt(params.get("id"));
//		EntityManager em = configuracionAppBean.getEntityManager();
//		try {
//			RepositorioSocioJpaImpl repoSocio =
//					new RepositorioSocioJpaImpl(em);
//		 em.getTransaction().begin();
//		 repoSocio.eliminar(id);
//		 em.getTransaction().commit();
//		 
//		} finally {
//			em.close();
//		}
//		 
//		return "/productos/listar.xhtml?faces-redirect=true";
//	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
