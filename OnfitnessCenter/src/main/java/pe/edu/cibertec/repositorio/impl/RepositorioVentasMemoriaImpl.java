package pe.edu.cibertec.repositorio.impl;

import java.util.List; 
import java.math.BigDecimal;
import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.repositorio.RepositorioVentas;

public class RepositorioVentasMemoriaImpl implements RepositorioVentas {

	private RepositorioMemoria<Ventas> datos;
 

	public RepositorioVentasMemoriaImpl() {
		datos = new RepositorioMemoria<Ventas>();
		
//		agregar(new Ventas(1, new Productos(1,	"OATMEGA",	"14g Protein OMEGA-3s",	new BigDecimal("140.00"), new BigDecimal("180.00"),	"12-05-2019",true),3, new  BigDecimal("540.00"), "12-05-2019", "ACTIVO"));
 
	}
 
	public void agregar(Ventas Ventas) { 
		datos.agregar(Ventas);
	}

	public List<Ventas> obtenerTodos() {
		return datos.obtenerTodos();
	}

	public Ventas obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}

	@Override
	public void actualizar(Integer id,Ventas Ventas) {
		datos.actualizar(id,Ventas);
		
	}
}
