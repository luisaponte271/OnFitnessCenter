package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.repositorio.RepositorioMembresia;
import pe.edu.cibertec.repositorio.RepositorioSocio;

public class SocioServicio {

	private final RepositorioSocio repositorioSocio; 
 

	public SocioServicio(RepositorioSocio repositorioSocio) {
		this.repositorioSocio = repositorioSocio; 
	}
	 
	public List<Socio> obtenerSocios() {
		return repositorioSocio.obtenerTodos();
	} 
	public void agregar(Socio Socio) {
		repositorioSocio.agregar(Socio);
	} 
	public Socio obtenerSociosPorId(Integer id) {
        return repositorioSocio.obtenerPorId(id);
    }
	public void actualizar(Integer id,Socio Socio) {
		repositorioSocio.actualizar(id,Socio);
	}
	public void eliminar(Integer id) { 
 
	} 
	public RepositorioSocio getRepositorioSocio() {
		return repositorioSocio;
	}
}
