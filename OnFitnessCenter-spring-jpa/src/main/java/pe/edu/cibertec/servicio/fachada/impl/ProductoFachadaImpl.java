package pe.edu.cibertec.servicio.fachada.impl;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import pe.edu.cibertec.dominio.Productos; 
import pe.edu.cibertec.servicio.ServicioProductos; 
import pe.edu.cibertec.servicio.fachada.ProductoFachada; 

@Service
public class ProductoFachadaImpl implements ProductoFachada {
	
	@Autowired
	ServicioProductos servicioProductos;

	@Override
	public void crear(Productos productos) {
		// TODO Auto-generated method stub
		servicioProductos.crear(productos);
	}

	@Override
	public void actualizar(Productos productos) {
		// TODO Auto-generated method stub
		servicioProductos.actualizar(productos);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		servicioProductos.eliminar(id);
	}

	@Override
	public List<Productos> obtenerTodos() {
		// TODO Auto-generated method stub
		return servicioProductos.obtenerTodos();
	}

	@Override
	public Productos obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return servicioProductos.obtenerPorId(id);
	} 
}
