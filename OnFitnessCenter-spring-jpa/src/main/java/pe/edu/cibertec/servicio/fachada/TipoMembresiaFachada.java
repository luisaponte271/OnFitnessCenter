package pe.edu.cibertec.servicio.fachada;

import java.util.List; 
import pe.edu.cibertec.dominio.Tipomembresia;

public interface TipoMembresiaFachada {
	
	void crear(Tipomembresia tipomembresia);
	void actualizar(Tipomembresia membresia);
	void eliminar(Integer id);
	List<Tipomembresia> obtenerTodos();
	Tipomembresia obtenerPorId(Integer id);
}
