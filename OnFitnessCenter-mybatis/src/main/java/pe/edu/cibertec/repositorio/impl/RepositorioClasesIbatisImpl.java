package pe.edu.cibertec.repositorio.impl;

 
import java.util.List; 
import org.apache.ibatis.session.SqlSession; 
import pe.edu.cibertec.dominio.Clases; 
import pe.edu.cibertec.repositorio.RepositorioClases; 
import pe.edu.cibertec.repositorio.mapper.ClasesMapper; 

public class RepositorioClasesIbatisImpl 
	implements RepositorioClases {
	
	private final ClasesMapper clasesoMapper;

	public RepositorioClasesIbatisImpl(SqlSession sqlSession) {
		clasesoMapper = sqlSession.getMapper(ClasesMapper.class);
	}

	@Override
	public void agregar(Clases entidad) {
		// TODO Auto-generated method stub
		clasesoMapper.insertClases(entidad);
	}

	@Override
	public List<Clases> obtenerTodos() {
		// TODO Auto-generated method stub
		return clasesoMapper.selectTodasClases();
	}

	@Override
	public Clases obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return clasesoMapper.selectClasesPorId(id);
	}

	@Override
	public void actualizar(Clases entidad) {
		// TODO Auto-generated method stub
		clasesoMapper.updateClases(entidad);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		clasesoMapper.deleteClases(id);
	}
 
}
