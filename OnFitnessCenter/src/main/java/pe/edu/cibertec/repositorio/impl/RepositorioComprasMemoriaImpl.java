package pe.edu.cibertec.repositorio.impl;

import java.util.List; 
import java.math.BigDecimal;
import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.repositorio.RepositorioCompras;

public class RepositorioComprasMemoriaImpl implements RepositorioCompras {

	private RepositorioMemoria<Compras> datos;
 

	public RepositorioComprasMemoriaImpl() {
		datos = new RepositorioMemoria<Compras>();
		
		agregar(new Compras(1, new Productos(1,	"OATMEGA",	"14g Protein OMEGA-3s",	new BigDecimal("140.00"), new BigDecimal("180.00"),	"12-05-2019",true),3, new  BigDecimal("540.00"), "12-05-2019", "ACTIVO"));
  
	}
 
	public void agregar(Compras Compras) { 
		datos.agregar(Compras);
	}

	public List<Compras> obtenerTodos() {
		return datos.obtenerTodos();
	}

	public Compras obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}

	@Override
	public void actualizar(Integer id,Compras Compras) {
		datos.actualizar(id,Compras);
		
	}
}
