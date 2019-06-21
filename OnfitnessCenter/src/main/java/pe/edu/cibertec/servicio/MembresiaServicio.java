package pe.edu.cibertec.servicio;

import java.util.List;

import pe.edu.cibertec.dominio.Membresia; 
import pe.edu.cibertec.repositorio.RepositorioMembresia;
import pe.edu.cibertec.repositorio.RepositorioSocio;
import pe.edu.cibertec.repositorio.RepositorioTipoMembresia; 

public class MembresiaServicio {
 
	private final RepositorioSocio repositorioSocio;
	private final RepositorioMembresia repositorioMembresia; 
	private final RepositorioTipoMembresia repositorioTipoMembresia;

	public MembresiaServicio(RepositorioMembresia repositoriomembresia, 
			RepositorioSocio repositorioSocio, RepositorioTipoMembresia repositorioTipoMembresia) { 
		this.repositorioMembresia = repositoriomembresia;
		this.repositorioSocio = repositorioSocio;
		this.repositorioTipoMembresia = repositorioTipoMembresia;
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
 
	}
   
	public RepositorioMembresia getRepositorioMembresia() {
		return repositorioMembresia;
	}
}
