package pe.edu.cibertec.servicio;

import java.util.List; 
import pe.edu.cibertec.dominio.Socio; 

public interface ServicioSocio {

	void crear(Socio socio);
	void actualizar(Socio socio);
	void eliminar(Integer id);
	List<Socio> obtenerTodos();
	Socio obtenerPorId(Integer id);
}
