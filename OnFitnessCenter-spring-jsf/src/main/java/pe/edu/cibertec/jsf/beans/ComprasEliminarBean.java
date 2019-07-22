package pe.edu.cibertec.jsf.beans;

import java.util.Map; 
import javax.annotation.PostConstruct; 
import javax.faces.context.FacesContext; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.servicio.fachada.ComprasFachada; 

@Component
@Scope("view")
public class ComprasEliminarBean {
	
	private ComprasFachada comprasFachada;
	private Integer id;
	private Compras compras;
	Map<String, String> params;
 
	public ComprasEliminarBean(ComprasFachada comprasFachada) {
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
			compras = comprasFachada.obtenerPorId(id);
		}
	}

	public String eliminar() {
		System.out.println("Iniciando Eliminar CompraEliminarBean");
 
		comprasFachada.eliminar(id); 
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
 
}
