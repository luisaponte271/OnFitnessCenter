package pe.edu.cibertec.servicio.fachada.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.dominio.Socio; 
import pe.edu.cibertec.servicio.ServicioSocio;
import pe.edu.cibertec.servicio.fachada.SocioFachada;
@Service
public class SocioFachadaImpl implements SocioFachada {
	
	@Autowired
	ServicioSocio servicioSocio;
	 
	@Override
	public void crear(Socio socio) {
		// TODO Auto-generated method stub
		servicioSocio.crear(socio);
	}

	@Override
	public void actualizar(Socio socio) {
		// TODO Auto-generated method stub
		servicioSocio.actualizar(socio);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		servicioSocio.eliminar(id);
	}

	@Override
	public List<Socio> obtenerTodos() {
		// TODO Auto-generated method stub
		return servicioSocio.obtenerTodos();
	}

	@Override
	public Socio obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return servicioSocio.obtenerPorId(id);
	}
	
}
