package pe.edu.cibertec.repositorio.impl;

 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.repositorio.RepositorioClases;
import pe.edu.cibertec.repositorio.RepositorioProductos;
import pe.edu.cibertec.repositorio.RepositorioSocio;

public class RepositorioClasesJpaImpl
	extends RepositorioBaseJpaImpl<Clases>
	implements RepositorioClases {

	public RepositorioClasesJpaImpl(EntityManager em) {
		super(em);
	}
 
}
