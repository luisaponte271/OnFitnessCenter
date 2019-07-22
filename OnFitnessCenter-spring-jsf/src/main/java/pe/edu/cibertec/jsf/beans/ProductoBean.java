package pe.edu.cibertec.jsf.beans;
 
import java.util.List; 
import javax.annotation.PostConstruct; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Productos; 
import pe.edu.cibertec.servicio.ServicioProductos;
 
@Component
@Scope("view")  
public class ProductoBean {
	
	private ServicioProductos servicioProductos;
	
	private List<Productos> listaProductos;
 
	public ProductoBean(ServicioProductos servicioProductos) {
		System.out.println("Creando instancia de ProductoBean");
		this.servicioProductos = servicioProductos;
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de ProductoBean");
	 	listaProductos = servicioProductos.obtenerTodos(); 
	}
 
	 
	public List<Productos> getListaProductos() {
		System.out.println("obtener listaProductos");
		return listaProductos;
	}

	public void setListaProductos(List<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}
 
}
