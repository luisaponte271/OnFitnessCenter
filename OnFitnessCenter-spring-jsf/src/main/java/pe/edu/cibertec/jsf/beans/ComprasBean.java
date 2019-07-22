package pe.edu.cibertec.jsf.beans;
 
import java.util.List;  
import javax.annotation.PostConstruct; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Compras;  
import pe.edu.cibertec.servicio.ServicioCompras; 
 
@Component
@Scope("view")  
public class ComprasBean {

	private ServicioCompras servicioCompras;
	
	private List<Compras> listaCompras;
 
	public ComprasBean(ServicioCompras servicioCompras) {
		this.servicioCompras = servicioCompras;
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de ComprasBean");  
		listaCompras =  servicioCompras.obtenerTodos();	 
	}
	 
	public List<Compras> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compras> listaCompras) {
		this.listaCompras = listaCompras;
	}
 
}
