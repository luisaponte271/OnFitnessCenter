package pe.edu.cibertec.servicio;

import java.util.List;  
import pe.edu.cibertec.dominio.Ventas; 

public interface ServicioVentas {

	void crear(Ventas ventas);
	void actualizar(Ventas ventas);
	void eliminar(Integer id);
	List<Ventas> obtenerTodos();
	Ventas obtenerPorId(Integer id);
}
