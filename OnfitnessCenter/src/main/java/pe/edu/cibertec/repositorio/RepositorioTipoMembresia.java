package pe.edu.cibertec.repositorio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Tipomembresia;
 

public interface RepositorioTipoMembresia {

	void agregar(Tipomembresia tipomembresia);

	List<Tipomembresia> obtenerTodos();

	Tipomembresia obtenerPorId(Integer id);

	void actualizar(Integer id, Tipomembresia tipomembresia);
	
	void eliminar(Integer id);
}
