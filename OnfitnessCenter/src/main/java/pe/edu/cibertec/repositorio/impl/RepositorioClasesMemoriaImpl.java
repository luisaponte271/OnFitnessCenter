package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import pe.edu.cibertec.util.*; 
import pe.edu.cibertec.dominio.Clases;

import pe.edu.cibertec.repositorio.RepositorioClases;

public class RepositorioClasesMemoriaImpl implements RepositorioClases {

	private RepositorioMemoria<Clases> datos;
 

	public RepositorioClasesMemoriaImpl() {
		datos = new RepositorioMemoria<Clases>();
		agregar(new Clases(1,"sppinig","bicicleta","07:00:00 a.m.","08:00:00 p.m.",30,"SI","NO","NO","NO","SI","NO","NO",true));
		agregar(new Clases(2,"Yoga Fit","Yoga","07:00:00 a.m.","09:00:00 p.m.",10,"NO","NO","NO","NO","SI","NO","SI",true));
		 
	}
 
	public void agregar(Clases Clases) { 
		datos.agregar(Clases);
	}

	public List<Clases> obtenerTodos() {
		return datos.obtenerTodos();
	}

	public Clases obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}

	@Override
	public void actualizar(Integer id,Clases Clases) {
		datos.actualizar(id,Clases); 
	}
	public void eliminar(Integer id) { 
		 datos.eliminar(id);
	}
}
