package pe.edu.cibertec.repositorio;

import java.util.List;

import pe.edu.cibertec.dominio.Membresia;
 
 

public interface RepositorioMembresia {

	void agregar(Membresia membresia);

	List<Membresia> obtenerTodos();

	List<Membresia> obtenerPorId(Integer id);

	void actualizar(Integer id,Membresia socio);
}
