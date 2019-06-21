package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import pe.edu.cibertec.util.*;
import java.math.BigDecimal;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Tipomembresia;
import pe.edu.cibertec.repositorio.RepositorioProductos;
import pe.edu.cibertec.repositorio.RepositorioTipoMembresia;

public class RepositorioTipoMembresiaMemoriaImpl implements RepositorioTipoMembresia {

	private RepositorioMemoria<Tipomembresia> datos;
 

	public RepositorioTipoMembresiaMemoriaImpl() {
		datos = new RepositorioMemoria<Tipomembresia>();
 
		agregar(new Tipomembresia(1, "mensual"));
		agregar(new Tipomembresia(2,  "anual"));
		agregar(new Tipomembresia(3,  "semanal"));
		agregar(new Tipomembresia(4,  "inscripcion"));
  
	}
 
	public void agregar(Tipomembresia tipomembresia) { 
		datos.agregar(tipomembresia);
	}

	public List<Tipomembresia> obtenerTodos() {
		return datos.obtenerTodos();
	}

	public Tipomembresia obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}

	@Override
	public void actualizar(Integer id,Tipomembresia tipomembresia) {
		datos.actualizar(id,tipomembresia);
		
	}
}
