package pe.edu.cibertec.repositorio.impl;

 
import java.util.List; 
import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.repositorio.RepositorioCompras;
import pe.edu.cibertec.repositorio.RepositorioMembresia;
import pe.edu.cibertec.repositorio.RepositorioProductos;
import pe.edu.cibertec.repositorio.RepositorioVentas;
import pe.edu.cibertec.repositorio.mapper.MembresiaMapper;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

public class RepositorioMembresiaIbatisImpl 
	implements RepositorioMembresia {

	private final MembresiaMapper membresiaMappe;
	
	public RepositorioMembresiaIbatisImpl(SqlSession sqlSession) {
		membresiaMappe = sqlSession.getMapper(MembresiaMapper.class);
	}

	@Override
	public void agregar(Membresia entidad) {
		// TODO Auto-generated method stub
		membresiaMappe.insertMembresia(entidad);
	}

	@Override
	public List<Membresia> obtenerTodos() {
		// TODO Auto-generated method stub
		return membresiaMappe.selectTodasMembresias();
	}

	@Override
	public Membresia obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Membresia entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

  
}
