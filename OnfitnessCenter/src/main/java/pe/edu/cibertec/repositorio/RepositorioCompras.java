package pe.edu.cibertec.repositorio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Compras;
 

public interface RepositorioCompras {

	void agregar(Compras Compras);

	List<Compras> obtenerTodos();

	Compras obtenerPorId(Integer id);

	void actualizar(Integer id, Compras Compras);

	void eliminar(Integer id);
}
