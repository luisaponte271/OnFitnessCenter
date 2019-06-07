package pe.edu.cibertec.repositorio.impl;

 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Tipomembresia;
import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.repositorio.RepositorioCompras;
import pe.edu.cibertec.repositorio.RepositorioMembresia;
import pe.edu.cibertec.repositorio.RepositorioProductos;
import pe.edu.cibertec.repositorio.RepositorioTipoMembresia;
import pe.edu.cibertec.repositorio.RepositorioVentas;

public class RepositorioTipoMembresiaJpaImpl
	extends RepositorioBaseJpaImpl<Tipomembresia>
	implements RepositorioTipoMembresia {

	public RepositorioTipoMembresiaJpaImpl(EntityManager em) {
		super(em);
	}

  
}
