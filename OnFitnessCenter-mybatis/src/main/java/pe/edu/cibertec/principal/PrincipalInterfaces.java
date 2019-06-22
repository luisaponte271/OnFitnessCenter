package pe.edu.cibertec.principal;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
 
import pe.edu.cibertec.dominio.filtro.FiltroProducto;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

public class PrincipalInterfaces {

	public static void main(String[] args) {
//		String resource = "prueba/mybatis-config.xml";
//		try (InputStream inputStream = Resources
//				.getResourceAsStream(resource)) {
//			SqlSessionFactory sqlSessionFactory =
//					new SqlSessionFactoryBuilder().build(inputStream);
//
//			try (SqlSession session = sqlSessionFactory.openSession()) {
//				ProductoMapper pm = session.getMapper(ProductoMapper.class);
//				Producto producto3 = pm.selectProductoPorId(4);
//				System.out.println(producto3.getNombre());
//				System.out.println(producto3.getCategoria().getNombre());
//				if (producto3.getListaComentarios() != null) {
//					producto3.getListaComentarios().forEach(
//						comentario -> System.out.println(comentario.getComentario()));
//				}

//				List<Producto> listaProductos = pm.selectTodosProductos();
//				listaProductos.forEach(p ->
//				System.out.println(p.getCategoria().getNombre() + " - " + p.getNombre()));

//				Producto productoInsert = new Producto
//						(1000, "prueba desde consola",
//								new BigDecimal("100.20"),
//								new Categoria(1, ""));
//				pm.insertProducto(productoInsert);
//				session.commit();
//				System.out.println(productoInsert.getId());
				
//				pm.deleteProducto(10);
//				session.commit();

//				pm.updateProducto(new Producto(9, null, new BigDecimal("354.18"), null));
//				pm.updateProducto(new Producto(10, null, null, new Categoria(2, "")));
//				session.commit();

//				CategoriaMapper cm = session.getMapper(CategoriaMapper.class);
//				Categoria categoria = cm.obtenerPorId(2);
//				System.out.println(categoria.getNombre());

//				FiltroProducto filtroProducto = new FiltroProducto();
//				filtroProducto.setNombre("e");
//				filtroProducto.setPrecio(new BigDecimal("150.00"));
//				List<Producto> listaProducto = pm.selectProductoSP(filtroProducto);
//				listaProducto.forEach(p ->
//					System.out.println(
//						String.format("%s - %s %s",
//								p.getCategoria().getNombre(),
//								p.getNombre(),
//								p.getPrecio())));
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
