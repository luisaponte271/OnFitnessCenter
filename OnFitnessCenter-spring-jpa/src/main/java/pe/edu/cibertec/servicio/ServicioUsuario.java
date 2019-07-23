package pe.edu.cibertec.servicio;

import java.util.List; 
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.dominio.Usuario; 

public interface ServicioUsuario {

	void crear(Usuario usuario);
	void actualizar(Usuario usuario);
	void eliminar(Integer id);
	List<Usuario> obtenerTodos();
	Usuario obtenerPorId(Integer id);
}
