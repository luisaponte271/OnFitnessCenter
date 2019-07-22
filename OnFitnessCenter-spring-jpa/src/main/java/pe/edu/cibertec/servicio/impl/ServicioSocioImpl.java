package pe.edu.cibertec.servicio.impl;

import java.util.List;

 
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.repositorio.RepositorioSocio;
import pe.edu.cibertec.servicio.ServicioSocio;
 
import org.springframework.transaction.annotation.Transactional; 

@Service
public class ServicioSocioImpl implements ServicioSocio { 
	private final RepositorioSocio repositorioSocio;

	public ServicioSocioImpl(RepositorioSocio repositorioSocio) {
		this.repositorioSocio = repositorioSocio;
	}

	@Transactional
	@Override
	public void crear(Socio socio) {
		// TODO Auto-generated method stub
		repositorioSocio.agregar(socio);
	}
	
	@Transactional 
	@Override
	public void actualizar(Socio socio) {
		// TODO Auto-generated method stub
		repositorioSocio.actualizar(socio);
	}
	
	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorioSocio.eliminar(id);
	}

	@Transactional
	@Override
	public List<Socio> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioSocio.obtenerTodos();
	}
	
	@Transactional
	@Override
	public Socio obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorioSocio.obtenerPorId(id);
	}

}
