package pe.edu.cibertec.repositorio;

import java.util.List; 
import pe.edu.cibertec.dominio.Entidad;
 
public interface Repositorio<E extends Entidad> {

	void agregar(E entidad);

	List<E> obtenerTodos();

	E obtenerPorId(Integer id);

	void actualizar(E entidad);

	void eliminar(Integer id);
}
