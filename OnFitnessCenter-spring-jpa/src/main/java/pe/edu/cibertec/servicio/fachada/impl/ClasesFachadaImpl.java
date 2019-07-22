package pe.edu.cibertec.servicio.fachada.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.servicio.ServicioClases;
import pe.edu.cibertec.servicio.ServicioSocio;
import pe.edu.cibertec.servicio.fachada.ClasesFachada;
 
@Service
public class ClasesFachadaImpl implements ClasesFachada {
	
	@Autowired
	ServicioClases servicioClases;

	@Override
	public void crear(Clases clases) {
		// TODO Auto-generated method stub
		servicioClases.crear(clases);
	}

	@Override
	public void actualizar(Clases clases) {
		// TODO Auto-generated method stub
		servicioClases.actualizar(clases);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		servicioClases.eliminar(id);
	}

	@Override
	public List<Clases> obtenerTodos() {
		// TODO Auto-generated method stub
		return servicioClases.obtenerTodos();
	}

	@Override
	public Clases obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return servicioClases.obtenerPorId(id);
	}
	 
	 
}
