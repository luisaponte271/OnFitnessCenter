package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import pe.edu.cibertec.util.*;
import java.math.BigDecimal;
import pe.edu.cibertec.dominio.Productos;

import pe.edu.cibertec.repositorio.RepositorioProductos;

public class RepositorioProductosMemoriaImpl implements RepositorioProductos {

	private RepositorioMemoria<Productos> datos;
  
	public RepositorioProductosMemoriaImpl() {
		datos = new RepositorioMemoria<Productos>();
 
		agregar(new Productos(1,	"OATMEGA",	"14g Protein OMEGA-3s",	new BigDecimal("140.00"), new	 BigDecimal("180.00"),	"12-05-2019",true));
		agregar(new Productos(2,	"AGUA CIELO", "Botella de 500 ml",	new BigDecimal("6.00"), new	 BigDecimal("10.00"),	"08-05-2019",true));
		 
	}
 
	public void agregar(Productos Productos) { 
		datos.agregar(Productos);
	}

	public List<Productos> obtenerTodos() {
		return datos.obtenerTodos();
	}

	public Productos obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}

	@Override
	public void actualizar(Integer id,Productos Productos) {
		datos.actualizar(id,Productos);
		
	}
	
	public void eliminar(Integer id) { 
		 datos.eliminar(id);
	}
}
