package pe.edu.cibertec.jsf.beans;

import java.util.List; 

import javax.annotation.PostConstruct; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Clases; 
import pe.edu.cibertec.servicio.ServicioClases; 
  
@Component
@Scope("view")  
public class ClasesBean {

	private ServicioClases servicioClases;
	
	private List<Clases> listaClases;
 
	public ClasesBean(ServicioClases servicioClases) {
		this.servicioClases = servicioClases;
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de TiendaBean");
		listaClases = servicioClases.obtenerTodos(); 
	}
	 
	public List<Clases> getListaClases() {
		return listaClases;
	}

	public void setListaClasess(List<Clases> listaClases) {
		this.listaClases = listaClases;
	}
 
}
