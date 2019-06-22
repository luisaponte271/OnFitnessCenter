package pe.edu.cibertec.jsf.beans;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioVentasIbatisImpl;
 

@ManagedBean
@ViewScoped
public class VentasEliminarBean {

	private Integer id;
	private Ventas ventas;
	Map<String, String> params;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public VentasEliminarBean() {
		System.out.println("Iniciando eliminar Ventas");
		ventas = new Ventas();
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
			RepositorioVentasIbatisImpl repoventas = new RepositorioVentasIbatisImpl(sqlSession);

			ventas = repoventas.obtenerPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar ventaEliminarBean");

		SqlSession sqlsession = configuracionAppBean.getSqlSessionFactory();
		RepositorioVentasIbatisImpl repoVentas = new RepositorioVentasIbatisImpl(sqlsession);
  
		repoVentas.eliminar(id);
		sqlsession.commit();

		return "/ventas/listar.xhtml?faces-redirect=true";
	}
	public String regresar() {
		System.out.println("Sin cambios regresar");
 
		return "/ventas/listar.xhtml?faces-redirect=true";
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
    
	public Ventas getVentas() {
		return ventas;
	}

	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
