package pe.edu.cibertec.repositorio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Socio;
 

public interface RepositorioSocio {

	void agregar(Socio socio);

	List<Socio> obtenerTodos();

	Socio obtenerPorId(Integer id);

	void actualizar(Integer id, Socio socio);
}
