package pe.edu.cibertec.repositorio.impl;

import org.springframework.stereotype.Repository;

import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.repositorio.RepositorioProductos;

@Repository
public class RepositorioProductosJpaImpl extends RepositorioBaseJpaImpl<Productos> implements RepositorioProductos {
	
}
