package pe.edu.cibertec.principal;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasIbatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosIbatisImpl;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

public class principal {
	private static List<Compras> listaCompras;
	
	public static void main(String[] args) throws IOException {
		
		String resource = "prueba/mybatis-config.xml";
		
		try(InputStream inputStream = Resources.getResourceAsStream(resource)){ 
			 SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory sqlSessionFactory = builder.build(inputStream); 
			 
			try (SqlSession session = sqlSessionFactory.openSession()) {
//				Map<String, Object> producto = session.selectOne(
//						"pe.edu.cibertec.repositorio.mapper.ProductoMapper.selectProductoPorIdMapa",
//						1);
			//	session.getMapper(ProductoMapper.class); 
				RepositorioProductosIbatisImpl repoProducto = new RepositorioProductosIbatisImpl(session); 
				 
				Productos productos = repoProducto.obtenerPorId(1);
				System.out.println(productos.getDescripcion());
				
 
			}
		}
	}
}