package pe.edu.cibertec.repositorio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Clases;
 

public interface RepositorioClases {

	void agregar(Clases Clases);

	List<Clases> obtenerTodos();

	Clases obtenerPorId(Integer id);

	void actualizar(Integer id, Clases Clases);
	
	void eliminar(Integer id);
}
