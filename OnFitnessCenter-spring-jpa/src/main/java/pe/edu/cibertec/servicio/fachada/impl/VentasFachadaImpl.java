package pe.edu.cibertec.servicio.fachada.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.servicio.ServicioVentas;
import pe.edu.cibertec.servicio.fachada.VentasFachada;

@Service
public class VentasFachadaImpl implements VentasFachada {

	@Autowired
	ServicioVentas servicioVentas;

	@Override
	public void crear(Ventas ventas) {
		// TODO Auto-generated method stub
		servicioVentas.crear(ventas);
	}

	@Override
	public void actualizar(Ventas ventas) {
		// TODO Auto-generated method stub
		servicioVentas.actualizar(ventas);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		servicioVentas.eliminar(id);
	}

	@Override
	public List<Ventas> obtenerTodos() {
		// TODO Auto-generated method stub
		return servicioVentas.obtenerTodos();
	}

	@Override
	public Ventas obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return servicioVentas.obtenerPorId(id);
	}

}
