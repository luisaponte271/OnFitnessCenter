package pe.edu.cibertec.servicio.impl;

import java.util.List; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.Membresia; 
import pe.edu.cibertec.repositorio.RepositorioMembresia; 
import pe.edu.cibertec.servicio.ServicioMembresia; 

@Service
public class ServicioMembresiaImpl implements ServicioMembresia { 
	private final RepositorioMembresia repositorioMembresia;

	public ServicioMembresiaImpl(RepositorioMembresia repositorioMembresia) {
		this.repositorioMembresia = repositorioMembresia;
	}
	@Transactional
	@Override
	public void crear(Membresia membresia) {
		// TODO Auto-generated method stub
		repositorioMembresia.agregar(membresia);
	}
	@Transactional
	@Override
	public void actualizar(Membresia membresia) {
		// TODO Auto-generated method stub
		repositorioMembresia.actualizar(membresia);
	}
	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorioMembresia.eliminar(id);
	}
	@Transactional
	@Override
	public List<Membresia> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioMembresia.obtenerTodos();
	}
	@Transactional
	@Override
	public Membresia obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorioMembresia.obtenerPorId(id);
	} 
}
