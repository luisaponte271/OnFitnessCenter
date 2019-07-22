package pe.edu.cibertec.jsf.beans;

import java.util.List; 
import javax.annotation.PostConstruct; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.servicio.ServicioSocio;

@Component
@Scope("view")  
public class SocioBean {

	private ServicioSocio servicioSocio; 
	
	private List<Socio> listaSocios;
 
	public SocioBean(ServicioSocio servicioSocio) {
		System.out.println("instanciando socioBean");
		this.servicioSocio = servicioSocio;
	}

	@PostConstruct
	public void init() {
		System.out.println("Inicializando socio bean");
		listaSocios = servicioSocio.obtenerTodos();
	}
 
	public List<Socio> getListaSocios() {
		System.out.println("obtener lista de socios");
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public ServicioSocio getServicioSocio() {
		return servicioSocio;
	}

	public void setServicioSocio(ServicioSocio servicioSocio) {
		this.servicioSocio = servicioSocio;
	}
 
	
} 