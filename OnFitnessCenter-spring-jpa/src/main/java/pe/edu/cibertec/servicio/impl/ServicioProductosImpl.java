package pe.edu.cibertec.servicio.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.repositorio.RepositorioProductos; 
import pe.edu.cibertec.servicio.ServicioProductos;
import org.springframework.transaction.annotation.Transactional;
  
@Service
public class ServicioProductosImpl implements ServicioProductos {
	
	private final RepositorioProductos repositorioProductos;

	public ServicioProductosImpl(RepositorioProductos repositorioProductos) {
		this.repositorioProductos = repositorioProductos;
	}
	
	@Transactional
	@Override
	public void crear(Productos producto) {
		// TODO Auto-generated method stub
		repositorioProductos.agregar(producto);
	}
	@Transactional
	@Override
	public void actualizar(Productos producto) {
		// TODO Auto-generated method stub
		repositorioProductos.actualizar(producto);
	}
	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorioProductos.eliminar(id);
	}
	@Transactional
	@Override
	public List<Productos> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioProductos.obtenerTodos();
	}
	@Transactional
	@Override
	public Productos obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorioProductos.obtenerPorId(id);
	}
 

}
