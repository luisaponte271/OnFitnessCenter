package pe.edu.cibertec.jsf.beans;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasIbatisImpl; 

@ManagedBean
@ViewScoped
public class ComprasEliminarBean {

	private Integer id;
	private Compras compras;
	Map<String, String> params;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ComprasEliminarBean() {
		System.out.println("Iniciando eliminar Compras");
		compras = new Compras();
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
			RepositorioComprasIbatisImpl repoCompras = new RepositorioComprasIbatisImpl(sqlSession);

			compras = repoCompras.obtenerPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar CompraEliminarBean");

		SqlSession sqlsession = configuracionAppBean.getSqlSessionFactory();
		RepositorioComprasIbatisImpl repoCompras = new RepositorioComprasIbatisImpl(sqlsession);
  
		repoCompras.eliminar(id);
		sqlsession.commit();

		return "/compras/listar.xhtml?faces-redirect=true";
	}
	public String regresar() {
		System.out.println("Sin cambios regresar");
 
		return "/compras/listar.xhtml?faces-redirect=true";
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
  
	public Compras getCompras() {
		return compras;
	}

	public void setCompras(Compras compras) {
		this.compras = compras;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
