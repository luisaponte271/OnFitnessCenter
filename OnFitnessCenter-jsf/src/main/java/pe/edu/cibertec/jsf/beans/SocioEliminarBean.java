package pe.edu.cibertec.jsf.beans;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.ibatis.session.SqlSession;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioIbatisImpl;

@ManagedBean
@ViewScoped
public class SocioEliminarBean {

	private Integer id;
	private Socio socio;
	Map<String, String> params;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public SocioEliminarBean() {
		System.out.println("Iniciando eliminar SocioBean");
		socio = new Socio();
	}

	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		FacesContext fc = FacesContext.getCurrentInstance();
		params = fc.getExternalContext().getRequestParameterMap();

		System.out.println("validando");
		if (!params.isEmpty()) {
			id = Integer.parseInt(params.get("id"));
			SqlSession sqlSession = configuracionAppBean.getSqlSessionFactory();
			RepositorioSocioIbatisImpl repoSocio = new RepositorioSocioIbatisImpl(sqlSession);

			socio = repoSocio.obtenerPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar SocioEliminarBean");

		SqlSession sqlsession = configuracionAppBean.getSqlSessionFactory();
		RepositorioSocioIbatisImpl repoSocio = new RepositorioSocioIbatisImpl(sqlsession);
		System.out.println("el id del socio es: " + id);

		repoSocio.eliminar(id);
		sqlsession.commit();

		return "/socio/listar.xhtml?faces-redirect=true";
	}
	public String regresar() {
		System.out.println("Sin cambios regresar");
 
		return "/socio/listar.xhtml?faces-redirect=true";
	}
	
	
	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
