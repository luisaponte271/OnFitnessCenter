package pe.edu.cibertec.servicio;

import java.util.List;

  
import pe.edu.cibertec.dominio.Tipomembresia; 
import pe.edu.cibertec.repositorio.RepositorioTipoMembresia;

public class TipoMembresiaServicio {

	private final RepositorioTipoMembresia repositorioTipomembresia;  

	public TipoMembresiaServicio(RepositorioTipoMembresia repositorioTipomembresia) {
		this.repositorioTipomembresia = repositorioTipomembresia; 
	}
	 
	public List<Tipomembresia> obtenerTipoMembresia() {
		return repositorioTipomembresia.obtenerTodos();
	} 
	public void agregar(Tipomembresia Productos) {
		repositorioTipomembresia.agregar(Productos);
	}
 
	public Tipomembresia obtenerTipoMembresiaPorId(Integer id) {
        return repositorioTipomembresia.obtenerPorId(id);
    }
	public void actualizar(Integer id,Tipomembresia Productos) {
		repositorioTipomembresia.actualizar(id,Productos);
	}
  
	public RepositorioTipoMembresia getRepositorioTipoMembresia() {
		return repositorioTipomembresia;
	}
}
