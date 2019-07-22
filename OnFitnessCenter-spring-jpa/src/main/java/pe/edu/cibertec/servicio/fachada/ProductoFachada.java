package pe.edu.cibertec.servicio.fachada;

import java.util.List;
import pe.edu.cibertec.dominio.Productos;

public interface ProductoFachada {
	
	void crear(Productos productos);
	void actualizar(Productos productos);
	void eliminar(Integer id);
	List<Productos> obtenerTodos();
	Productos obtenerPorId(Integer id);
}
