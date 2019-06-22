package pe.edu.cibertec.repositorio.impl;

 
import java.util.List; 
import org.apache.ibatis.session.SqlSession; 
import pe.edu.cibertec.dominio.Ventas; 
import pe.edu.cibertec.repositorio.RepositorioVentas; 
import pe.edu.cibertec.repositorio.mapper.VentasMapper;

public class RepositorioVentasIbatisImpl 
	implements RepositorioVentas {

	private final VentasMapper ventasMapper;

	public RepositorioVentasIbatisImpl(SqlSession sqlSession) {
		ventasMapper = sqlSession.getMapper(VentasMapper.class);
	}

	@Override
	public void agregar(Ventas entidad) {
		// TODO Auto-generated method stub
		ventasMapper.insertVentas(entidad);
	}

	@Override
	public List<Ventas> obtenerTodos() {
		// TODO Auto-generated method stub
		return ventasMapper.selectTodasVentas();
	}

	@Override
	public Ventas obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return ventasMapper.selectVentasPorId(id);
	}

	@Override
	public void actualizar(Ventas entidad) {
		// TODO Auto-generated method stub
		ventasMapper.updateVentas(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		ventasMapper.deleteVentas(id);
	}

  
}
