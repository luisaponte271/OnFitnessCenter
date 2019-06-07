package pe.edu.cibertec.repositorio.impl;

 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.repositorio.RepositorioCompras;
import pe.edu.cibertec.repositorio.RepositorioProductos;

public class RepositorioComprasJpaImpl
	extends RepositorioBaseJpaImpl<Compras>
	implements RepositorioCompras {

	public RepositorioComprasJpaImpl(EntityManager em) {
		super(em);
	}


 
	 
}
