package pe.edu.cibertec.servicio.fachada.impl;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import pe.edu.cibertec.dominio.Compras; 
import pe.edu.cibertec.servicio.ServicioCompras; 
import pe.edu.cibertec.servicio.fachada.ComprasFachada; 

@Service
public class ComprasFachadaImpl implements ComprasFachada {
	
	@Autowired
	ServicioCompras servicioCompras;

	@Override
	public void crear(Compras compras) {
		// TODO Auto-generated method stub
		servicioCompras.crear(compras);
	}

	@Override
	public void actualizar(Compras compras) {
		// TODO Auto-generated method stub
		servicioCompras.actualizar(compras);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		servicioCompras.eliminar(id);
	}

	@Override
	public List<Compras> obtenerTodos() {
		// TODO Auto-generated method stub
		return servicioCompras.obtenerTodos();
	}

	@Override
	public Compras obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return servicioCompras.obtenerPorId(id);
	}
	 
}
