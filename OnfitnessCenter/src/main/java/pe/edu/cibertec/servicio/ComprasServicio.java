package pe.edu.cibertec.servicio;

import java.util.List;

 
import pe.edu.cibertec.dominio.Compras;
 
import pe.edu.cibertec.repositorio.RepositorioCompras;

public class ComprasServicio {

	private final RepositorioCompras repositorioCompras;  

	public ComprasServicio(RepositorioCompras repositorioCompras) {
		this.repositorioCompras = repositorioCompras; 
	}
	 
	public List<Compras> obtenerCompras() {
		return repositorioCompras.obtenerTodos();
	} 
	public void agregar(Compras Compras) {
		repositorioCompras.agregar(Compras);
	}
 
	public Compras obtenerComprasPorId(Integer id) {
        return repositorioCompras.obtenerPorId(id);
    }
	public void actualizar(Integer id,Compras Compras) {
		repositorioCompras.actualizar(id,Compras);
	}
  
	public RepositorioCompras getRepositorioCompras() {
		return repositorioCompras;
	}
}
