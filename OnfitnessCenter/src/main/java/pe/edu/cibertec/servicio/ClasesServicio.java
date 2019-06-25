package pe.edu.cibertec.servicio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Clases;
 
import pe.edu.cibertec.repositorio.RepositorioClases;

public class ClasesServicio {

	private final RepositorioClases repositorioClases;  

	public ClasesServicio(RepositorioClases repositorioClases) {
		this.repositorioClases = repositorioClases; 
	}
	public List<Clases> obtenerClases() {
		return repositorioClases.obtenerTodos();
	} 
	public void agregar(Clases Clases) {
		repositorioClases.agregar(Clases);
	}
	public Clases obtenerClasesPorId(Integer id) {
        return repositorioClases.obtenerPorId(id);
    }
	public void actualizar(Integer id,Clases Clases) {
		repositorioClases.actualizar(id,Clases);
	}
	public void eliminar(Integer id) {
		repositorioClases.eliminar(id);
	}
  	public RepositorioClases getRepositorioClases() {
		return repositorioClases;
	}
}
