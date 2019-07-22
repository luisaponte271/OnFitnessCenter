package pe.edu.cibertec.jsf.beans;
 
import java.util.List; 
import javax.annotation.PostConstruct; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Ventas;  
import pe.edu.cibertec.servicio.ServicioVentas;

@Component
@Scope("view")  
public class VentasBean {
	
	private ServicioVentas servicioVentas;
	
	private List<Ventas> listaVentas;
 
	public VentasBean(ServicioVentas servicioVentas) {
		this.servicioVentas = servicioVentas;
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de VentasBean"); 
		listaVentas = servicioVentas.obtenerTodos();

	}

	public List<Ventas> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentass(List<Ventas> listaVentas) {
		this.listaVentas = listaVentas;
	}
 
}
