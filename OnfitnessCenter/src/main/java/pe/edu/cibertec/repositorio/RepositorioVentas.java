package pe.edu.cibertec.repositorio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Ventas;
 

public interface RepositorioVentas {

	void agregar(Ventas Ventas);

	List<Ventas> obtenerTodos();

	Ventas obtenerPorId(Integer id);

	void actualizar(Integer id, Ventas Ventas);
	
	void eliminar(Integer id);
}
