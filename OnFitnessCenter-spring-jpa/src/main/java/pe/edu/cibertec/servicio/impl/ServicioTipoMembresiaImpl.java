package pe.edu.cibertec.servicio.impl;

import java.util.List; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Tipomembresia;
import pe.edu.cibertec.repositorio.RepositorioMembresia;
import pe.edu.cibertec.repositorio.RepositorioTipoMembresia;
import pe.edu.cibertec.servicio.ServicioMembresia;
import pe.edu.cibertec.servicio.ServicioTipoMembresia; 

@Service
public class ServicioTipoMembresiaImpl implements ServicioTipoMembresia { 
	private final RepositorioTipoMembresia repositorioTipoMembresia;

	public ServicioTipoMembresiaImpl(RepositorioTipoMembresia repositorioTipoMembresia) {
		this.repositorioTipoMembresia = repositorioTipoMembresia;
	}
	@Transactional
	@Override
	public void crear(Tipomembresia tipomembresia) {
		// TODO Auto-generated method stub
		repositorioTipoMembresia.agregar(tipomembresia);
	}
	@Transactional
	@Override
	public void actualizar(Tipomembresia tipomembresia) {
		// TODO Auto-generated method stub
		repositorioTipoMembresia.actualizar(tipomembresia);
	}
	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorioTipoMembresia.eliminar(id);
	}
	@Transactional
	@Override
	public List<Tipomembresia> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioTipoMembresia.obtenerTodos();
	}
	@Transactional
	@Override
	public Tipomembresia obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorioTipoMembresia.obtenerPorId(id);
	}
 
}
