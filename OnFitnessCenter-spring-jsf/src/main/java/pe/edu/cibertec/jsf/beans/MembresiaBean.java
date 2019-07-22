package pe.edu.cibertec.jsf.beans; 

import java.util.List; 
import javax.annotation.PostConstruct; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Membresia; 
import pe.edu.cibertec.servicio.ServicioMembresia;  
  
@Component
@Scope("view")  
public class MembresiaBean {
 
	private ServicioMembresia servicioMembresia;
	
	private List<Membresia> listaMembresias;
 
	public MembresiaBean(ServicioMembresia servicioMembresia) {
		System.out.println("Iniciando  MembresiaBean"); 
		this.servicioMembresia = servicioMembresia;
	}
	 
	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de MembresiaBean");
	    listaMembresias = servicioMembresia.obtenerTodos();  
	} 
  
	public List<Membresia> getListaMembresias() {
		return listaMembresias;
	}

	public void setListaMembresias(List<Membresia> listaMembresias) {
		this.listaMembresias = listaMembresias;
	}
 
}
