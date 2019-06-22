package pe.edu.cibertec.repositorio.impl;

 
import java.util.List; 
import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.repositorio.RepositorioCompras;
import pe.edu.cibertec.repositorio.RepositorioProductos;
import pe.edu.cibertec.repositorio.mapper.ComprasMapper;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

public class RepositorioComprasIbatisImpl 
	implements RepositorioCompras {
	
	private final ComprasMapper comprasMapper;
	
	public RepositorioComprasIbatisImpl(SqlSession sqlSession) {
		comprasMapper = sqlSession.getMapper(ComprasMapper.class);
	}

	@Override
	public void agregar(Compras entidad) {
		// TODO Auto-generated method stub
		comprasMapper.insertCompras(entidad);
	}

	@Override
	public List<Compras> obtenerTodos() {
		// TODO Auto-generated method stub
		return comprasMapper.selectTodasCompras();
	}

	@Override
	public Compras obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return comprasMapper.selectComprasPorId(id);
	}

	@Override
	public void actualizar(Compras entidad) {
		// TODO Auto-generated method stub
		comprasMapper.updateCompras(entidad);	
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		comprasMapper.deleteCompras(id);
	}


 
	 
}
