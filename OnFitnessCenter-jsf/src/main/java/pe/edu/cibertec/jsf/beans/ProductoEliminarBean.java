package pe.edu.cibertec.jsf.beans;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Productos; 
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosIbatisImpl; 

@ManagedBean
@ViewScoped
public class ProductoEliminarBean {

	private Integer id;
	private Productos productos;
	Map<String, String> params;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ProductoEliminarBean() {
		System.out.println("Iniciando eliminar ProductoBean");
		productos = new Productos();
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
			RepositorioProductosIbatisImpl repoProducto = new RepositorioProductosIbatisImpl(sqlSession);

			productos = repoProducto.obtenerPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar ProductoEliminarBean");

		SqlSession sqlsession = configuracionAppBean.getSqlSessionFactory();
		RepositorioProductosIbatisImpl repoProducto = new RepositorioProductosIbatisImpl(sqlsession);
		System.out.println("el id del producto es: " + id);

		repoProducto.eliminar(id);
		sqlsession.commit();

		return "/productos/listar.xhtml?faces-redirect=true";
	}
	public String regresar() {
		System.out.println("Sin cambios regresar");
 
		return "/productos/listar.xhtml?faces-redirect=true";
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
  
	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
