package pe.edu.cibertec.servicio.fachada.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Tipomembresia;
import pe.edu.cibertec.servicio.ServicioMembresia;
import pe.edu.cibertec.servicio.ServicioTipoMembresia;
import pe.edu.cibertec.servicio.fachada.MembresiaFachada;
import pe.edu.cibertec.servicio.fachada.TipoMembresiaFachada; 

@Service
public class TipoMembresiaFachadaImpl implements TipoMembresiaFachada {

	@Autowired
	ServicioTipoMembresia servicioTipoMembresia;

	@Override
	public void crear(Tipomembresia tipomembresia) {
		// TODO Auto-generated method stub
		servicioTipoMembresia.crear(tipomembresia);
	}

	@Override
	public void actualizar(Tipomembresia tipomembresia) {
		// TODO Auto-generated method stub
		servicioTipoMembresia.actualizar(tipomembresia);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		servicioTipoMembresia.eliminar(id);
	}

	@Override
	public List<Tipomembresia> obtenerTodos() {
		// TODO Auto-generated method stub
		return servicioTipoMembresia.obtenerTodos();
	}

	@Override
	public Tipomembresia obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return servicioTipoMembresia.obtenerPorId(id);
	}
 

}
