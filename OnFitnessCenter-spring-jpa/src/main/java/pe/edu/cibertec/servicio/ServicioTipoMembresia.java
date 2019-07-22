package pe.edu.cibertec.servicio;

import java.util.List;  
import pe.edu.cibertec.dominio.Tipomembresia;  

public interface ServicioTipoMembresia {

	void crear(Tipomembresia tipomembresia);
	void actualizar(Tipomembresia tipomembresia);
	void eliminar(Integer id);
	List<Tipomembresia> obtenerTodos();
	Tipomembresia obtenerPorId(Integer id);
}
