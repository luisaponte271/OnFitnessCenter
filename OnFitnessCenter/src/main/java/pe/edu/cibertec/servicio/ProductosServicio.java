package pe.edu.cibertec.servicio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Productos;
 
import pe.edu.cibertec.repositorio.RepositorioProductos;

public class ProductosServicio {

	private final RepositorioProductos repositorioProductos;  

	public ProductosServicio(RepositorioProductos repositorioProductos) {
		this.repositorioProductos = repositorioProductos; 
	}
	 
	public List<Productos> obtenerProductos() {
		return repositorioProductos.obtenerTodos();
	} 
	public void agregar(Productos Productos) {
		repositorioProductos.agregar(Productos);
	}
 
	public Productos obtenerProductosPorId(Integer id) {
        return repositorioProductos.obtenerPorId(id);
    }
	public void actualizar(Integer id,Productos Productos) {
		repositorioProductos.actualizar(id,Productos);
	}
  
	public RepositorioProductos getRepositorioProductos() {
		return repositorioProductos;
	}
}
