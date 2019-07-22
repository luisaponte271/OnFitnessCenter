package pe.edu.cibertec.servicio.fachada.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import pe.edu.cibertec.dominio.Membresia; 
import pe.edu.cibertec.servicio.ServicioMembresia; 
import pe.edu.cibertec.servicio.fachada.MembresiaFachada; 

@Service
public class MembresiaFachadaImpl implements MembresiaFachada {

	@Autowired
	ServicioMembresia servicioMembresia;

	@Override
	public void crear(Membresia membresia) {
		// TODO Auto-generated method stub
		servicioMembresia.crear(membresia);
	}

	@Override
	public void actualizar(Membresia membresia) {
		// TODO Auto-generated method stub
		servicioMembresia.actualizar(membresia);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		servicioMembresia.eliminar(id);
	}

	@Override
	public List<Membresia> obtenerTodos() {
		// TODO Auto-generated method stub
		return servicioMembresia.obtenerTodos();
	}

	@Override
	public Membresia obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return servicioMembresia.obtenerPorId(id);
	}
 

}
