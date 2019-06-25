package pe.edu.cibertec.repositorio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Productos;
 

public interface RepositorioProductos {

	void agregar(Productos Productos);

	List<Productos> obtenerTodos();

	Productos obtenerPorId(Integer id);

	void actualizar(Integer id, Productos Productos);
	
	void eliminar(Integer id);
}
