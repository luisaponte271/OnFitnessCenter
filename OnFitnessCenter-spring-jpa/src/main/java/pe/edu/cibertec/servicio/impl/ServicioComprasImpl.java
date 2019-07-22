package pe.edu.cibertec.servicio.impl;

import java.util.List; 
import org.springframework.stereotype.Service; 
import pe.edu.cibertec.dominio.Compras; 
import pe.edu.cibertec.repositorio.RepositorioCompras; 
import pe.edu.cibertec.servicio.ServicioCompras; 
 
import org.springframework.transaction.annotation.Transactional; 

@Service
public class ServicioComprasImpl implements ServicioCompras { 
	private final RepositorioCompras repositorioCompras;

	public ServicioComprasImpl(RepositorioCompras repositorioCompras) {
		this.repositorioCompras = repositorioCompras;
	}
	@Transactional
	@Override
	public void crear(Compras compras) {
		// TODO Auto-generated method stub
		repositorioCompras.agregar(compras);
	}
	@Transactional
	@Override
	public void actualizar(Compras compras) {
		// TODO Auto-generated method stub
		repositorioCompras.actualizar(compras);
	}
	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorioCompras.eliminar(id);
	}
	@Transactional
	@Override
	public List<Compras> obtenerTodos() {
		// TODO Auto-generated method stub
		return  repositorioCompras.obtenerTodos();
	}
	@Transactional
	@Override
	public Compras obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorioCompras.obtenerPorId(id);
	}
 
}
