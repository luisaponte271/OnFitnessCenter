package pe.edu.cibertec.servicio.impl;

import java.util.List; 
import org.springframework.stereotype.Service; 
import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.repositorio.RepositorioCompras;
import pe.edu.cibertec.repositorio.RepositorioVentas;
import pe.edu.cibertec.servicio.ServicioCompras;
import pe.edu.cibertec.servicio.ServicioVentas;

import org.springframework.transaction.annotation.Transactional; 

@Service
public class ServicioVentasImpl implements ServicioVentas { 
	private final RepositorioVentas repositorioVentas;

	public ServicioVentasImpl(RepositorioVentas repositorioVentas) {
		this.repositorioVentas = repositorioVentas;
	}

	@Override
	public void crear(Ventas ventas) {
		// TODO Auto-generated method stub
		repositorioVentas.agregar(ventas);
	}

	@Override
	public void actualizar(Ventas ventas) {
		// TODO Auto-generated method stub
		repositorioVentas.actualizar(ventas);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorioVentas.eliminar(id);
	}

	@Override
	public List<Ventas> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioVentas.obtenerTodos();
	}

	@Override
	public Ventas obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorioVentas.obtenerPorId(id);
	}
	 
 
}
