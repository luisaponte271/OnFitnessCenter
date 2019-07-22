package pe.edu.cibertec.servicio;

import java.util.List; 
import pe.edu.cibertec.dominio.Membresia;  

public interface ServicioMembresia {

	void crear(Membresia membresia);
	void actualizar(Membresia membresia);
	void eliminar(Integer id);
	List<Membresia> obtenerTodos();
	Membresia obtenerPorId(Integer id);
}
