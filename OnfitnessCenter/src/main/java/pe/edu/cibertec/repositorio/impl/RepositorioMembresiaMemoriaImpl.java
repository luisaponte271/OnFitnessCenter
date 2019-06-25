package pe.edu.cibertec.repositorio.impl;

import java.util.Date;
import java.util.List;

import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.repositorio.RepositorioMembresia;
 

public class RepositorioMembresiaMemoriaImpl implements RepositorioMembresia {

	private RepositorioMemoria<Membresia> datos;

	public RepositorioMembresiaMemoriaImpl() {
 	datos = new RepositorioMemoria<Membresia>();
 
	}

	public void agregar(Membresia Membresia) {
		// TODO Auto-generated method stub 
		datos.agregar(Membresia);
	}
	 
	public List<Membresia> obtenerTodos() {
		return datos.obtenerTodos();
	}

	public List<Membresia> obtenerPorId(Integer id) {
		return datos.obtenerTodosPorId(id);
	}

	public void actualizar(Integer id, Membresia membresia) {
		datos.actualizar(id,membresia); 
	} 
	
	public void eliminar(Integer id) { 
		 datos.eliminar(id);
	}
 
}
