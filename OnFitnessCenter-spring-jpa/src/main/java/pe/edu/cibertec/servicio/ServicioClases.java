package pe.edu.cibertec.servicio;

import java.util.List; 
import pe.edu.cibertec.dominio.Clases; 

public interface ServicioClases {

	void crear(Clases clases);
	void actualizar(Clases clases);
	void eliminar(Integer id);
	List<Clases> obtenerTodos();
	Clases obtenerPorId(Integer id);
}
