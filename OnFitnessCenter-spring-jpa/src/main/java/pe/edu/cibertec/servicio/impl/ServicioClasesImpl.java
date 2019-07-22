package pe.edu.cibertec.servicio.impl;

import java.util.List; 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; 
import pe.edu.cibertec.dominio.Clases; 
import pe.edu.cibertec.repositorio.RepositorioClases; 
import pe.edu.cibertec.servicio.ServicioClases; 
    
@Service
public class ServicioClasesImpl implements ServicioClases { 
	
	private final RepositorioClases repositorioClases;

	public ServicioClasesImpl(RepositorioClases repositorioClases) {
		this.repositorioClases = repositorioClases;
	}
	@Transactional
	@Override
	public void crear(Clases clases) {
		// TODO Auto-generated method stub
		repositorioClases.agregar(clases);
	}
	@Transactional
	@Override
	public void actualizar(Clases clases) {
		// TODO Auto-generated method stub
		repositorioClases.actualizar(clases);
	}
	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorioClases.eliminar(id);
	}
	@Transactional
	@Override
	public List<Clases> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioClases.obtenerTodos();
	}
	@Transactional
	@Override
	public Clases obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorioClases.obtenerPorId(id);
	}  
}
