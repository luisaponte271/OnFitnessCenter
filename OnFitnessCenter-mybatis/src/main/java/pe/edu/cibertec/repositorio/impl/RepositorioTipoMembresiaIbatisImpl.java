package pe.edu.cibertec.repositorio.impl;

 
import java.util.List; 
import org.apache.ibatis.session.SqlSession;

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
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;
import pe.edu.cibertec.repositorio.mapper.TipoMembresiaMapper;

public class RepositorioTipoMembresiaIbatisImpl 
	implements RepositorioTipoMembresia {
	private final TipoMembresiaMapper tipoMembresiaMapper;

	public RepositorioTipoMembresiaIbatisImpl(SqlSession sqlSession) {
		tipoMembresiaMapper = sqlSession.getMapper(TipoMembresiaMapper.class);
	}

	@Override
	public void agregar(Tipomembresia entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tipomembresia> obtenerTodos() {
		// TODO Auto-generated method stub
		return tipoMembresiaMapper.selectTodosTipomembresia();
	}

	@Override
	public Tipomembresia obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Tipomembresia entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

  
}
