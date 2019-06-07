package pe.edu.cibertec.repositorio.impl;

 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import pe.edu.cibertec.dominio.Productos;
  
import pe.edu.cibertec.repositorio.RepositorioProductos;

public class RepositorioProductosJpaImpl
	extends RepositorioBaseJpaImpl<Productos>
	implements RepositorioProductos {

	public RepositorioProductosJpaImpl(EntityManager em) {
		super(em);
	}

	 
}
