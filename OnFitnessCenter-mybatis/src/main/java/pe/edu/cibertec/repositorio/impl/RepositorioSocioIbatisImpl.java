package pe.edu.cibertec.repositorio.impl;

 
import java.util.List; 
import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.repositorio.RepositorioProductos;
import pe.edu.cibertec.repositorio.RepositorioSocio;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;
import pe.edu.cibertec.repositorio.mapper.SocioMapper;

public class RepositorioSocioIbatisImpl 
	implements RepositorioSocio {
	
	private final SocioMapper socioMapper;

	public RepositorioSocioIbatisImpl(SqlSession sqlSession) {
		socioMapper = sqlSession.getMapper(SocioMapper.class);
	}

	@Override
	public void agregar(Socio entidad) {
		// TODO Auto-generated method stub
		socioMapper.insertSocio(entidad);
	}

	@Override
	public List<Socio> obtenerTodos() {
		// TODO Auto-generated method stub
		return socioMapper.selectTodosSocios();
	}

	@Override
	public Socio obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return socioMapper.selectSociosPorId(id);
	}

	@Override
	public void actualizar(Socio entidad) {
		// TODO Auto-generated method stub
		socioMapper.updateSocio(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		socioMapper.deleteSocio(id);
	}

}
