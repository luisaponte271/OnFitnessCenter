package pe.edu.cibertec.repositorio.impl;

 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.repositorio.RepositorioProductos;
import pe.edu.cibertec.repositorio.RepositorioSocio;

public class RepositorioSocioJpaImpl
	extends RepositorioBaseJpaImpl<Socio>
	implements RepositorioSocio {

	public RepositorioSocioJpaImpl(EntityManager em) {
		super(em);
	}

	 
 
	 
}
