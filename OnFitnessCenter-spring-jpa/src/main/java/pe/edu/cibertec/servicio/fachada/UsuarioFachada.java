package pe.edu.cibertec.servicio.fachada;

import java.util.List;
 
import pe.edu.cibertec.dominio.Usuario;

public interface UsuarioFachada {
	
	void crear(Usuario usuario);
	void actualizar(Usuario usuario);
	void eliminar(Integer id);
	List<Usuario> obtenerTodos();
	Usuario obtenerPorId(Integer id);
}
