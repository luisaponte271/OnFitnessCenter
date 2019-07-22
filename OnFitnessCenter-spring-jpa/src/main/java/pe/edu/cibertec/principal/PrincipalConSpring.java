package pe.edu.cibertec.principal;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pe.edu.cibertec.servicio.ServicioSocio;
import pe.edu.cibertec.servicio.fachada.SocioFachada;

@Configuration
@ComponentScan("pe.edu.cibertec")
public class PrincipalConSpring {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(
				PrincipalConSpring.class)) {
			ServicioSocio servicioProducto =
					ctx.getBean(ServicioSocio.class);

////			Producto producto = new Producto(
////					null, "nombre inesperado", BigDecimal.ZERO,
////					new Categoria(1, null));
////			servicioProducto.crear(producto);
//
//			AdministradorProducto administradorProducto =
//					ctx.getBean(AdministradorProducto.class);
//			administradorProducto.crear(
//					new Producto(
//					null, "oso teddy", BigDecimal.ZERO,
//					new Categoria(null, "Libros")));

			servicioProducto.obtenerTodos()
			.forEach(p -> System.out.println(p.getNombre()));
		}
	}
}
