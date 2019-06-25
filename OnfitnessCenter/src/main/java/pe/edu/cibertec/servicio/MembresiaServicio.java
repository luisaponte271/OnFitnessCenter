package pe.edu.cibertec.servicio;

import java.util.List;
import pe.edu.cibertec.dominio.Membresia; 
import pe.edu.cibertec.repositorio.RepositorioMembresia;

public class MembresiaServicio {
 
	private final RepositorioMembresia repositorioMembresia; 

	public MembresiaServicio(RepositorioMembresia repositoriomembresia) { 
		this.repositorioMembresia = repositoriomembresia;
	}
	 
	public List<Membresia> obtenerMembresia() {
		return repositorioMembresia.obtenerTodos();
	} 
	public void agregarMembresia(Membresia membresia) {
		repositorioMembresia.agregar(membresia);
	} 
	public List<Membresia> obtenerMembresiaPorId(Integer id) {
        return repositorioMembresia.obtenerPorId(id);
    }
	public void actualizarMembresia(Integer id,Membresia Socio) {
		repositorioMembresia.actualizar(id,Socio);
	}
	public void eliminar(Integer id) { 
		repositorioMembresia.eliminar(id);
	} 
	public RepositorioMembresia getRepositorioMembresia() {
		return repositorioMembresia;
	}
}
