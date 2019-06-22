package pe.edu.cibertec.principal;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
 
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

public class Principal {

	public static void main(String[] args) {
//		String resource = "prueba/mybatis-config.xml";
		String resource = "OnFitnessCenter-mybatis/src/main/resources/prueba/mybatis-config.xml";
//		try (InputStream inputStream = Resources
//				.getResourceAsStream(resource)) {
//			SqlSessionFactory sqlSessionFactory =
//					new SqlSessionFactoryBuilder().build(inputStream);
//
//			try (SqlSession session = sqlSessionFactory.openSession()) {
//				Map<String, Object> producto = session.selectOne(
//						"pe.edu.cibertec.repositorio.mapper.ProductoMapper.selectProductoPorIdMapa",
//						1);
//				System.out.println(producto.get("nombre"));
//
//				Productox producto2 = session.selectOne(
//						"pe.edu.cibertec.repositorio.mapper.ProductoMapper.selectProductoPorId",
//						3);
//				System.out.println(producto2.getNombre());
//				System.out.println("----------------------------");
//
//				List<Producto> listaProducto = session
//						.selectList(
//								"pe.edu.cibertec.repositorio.mapper.ProductoMapper.selectTodosProductos");
//				listaProducto.forEach(p -> System.out.println(p.getNombre()));
//
//				System.out.println("----------------------------");
//				ProductoMapper pm = session.getMapper(ProductoMapper.class);
//				Producto producto3 = pm.selectProductoPorId(5);
//				System.out.println(producto3.getNombre());
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
		}
	}
//}
