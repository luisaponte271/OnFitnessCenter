package pe.edu.cibertec.servicio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Ventas;
 
import pe.edu.cibertec.repositorio.RepositorioVentas;

public class VentasServicio {

	private final RepositorioVentas repositorioVentas;  

	public VentasServicio(RepositorioVentas repositorioVentas) {
		this.repositorioVentas = repositorioVentas; 
	}
	 
	public List<Ventas> obtenerVentas() {
		return repositorioVentas.obtenerTodos();
	} 
	public void agregar(Ventas Ventas) {
		repositorioVentas.agregar(Ventas);
	}
	public void eliminar(Integer id) { 
		repositorioVentas.eliminar(id);
	}
 
	public Ventas obtenerVentasPorId(Integer id) {
        return repositorioVentas.obtenerPorId(id);
    }
	public void actualizar(Integer id,Ventas Ventas) {
		repositorioVentas.actualizar(id,Ventas);
	}
  
	public RepositorioVentas getRepositorioVentas() {
		return repositorioVentas;
	}
}
