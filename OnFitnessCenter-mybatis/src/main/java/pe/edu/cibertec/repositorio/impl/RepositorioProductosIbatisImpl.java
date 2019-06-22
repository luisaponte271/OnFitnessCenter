package pe.edu.cibertec.repositorio.impl;
 
import java.util.List; 
import org.apache.ibatis.session.SqlSession; 
import pe.edu.cibertec.dominio.Productos; 
import pe.edu.cibertec.repositorio.RepositorioProductos;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

public class RepositorioProductosIbatisImpl implements RepositorioProductos {

	private final ProductoMapper productoMapper;

	public RepositorioProductosIbatisImpl(SqlSession sqlSession) {
		productoMapper = sqlSession.getMapper(ProductoMapper.class);
	}

	@Override
	public void agregar(Productos entidad) {
		// TODO Auto-generated method stub
		productoMapper.insertProducto(entidad);
	}

	@Override
	public List<Productos> obtenerTodos() {
		// TODO Auto-generated method stub
		return productoMapper.selectTodosProductos();
	}

	@Override
	public Productos obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return productoMapper.selectProductosPorId(id);
	}

	@Override
	public void actualizar(Productos entidad) {
		// TODO Auto-generated method stub
		productoMapper.updateProducto(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		productoMapper.deleteProducto(id);
	}
	
	

	 
}
