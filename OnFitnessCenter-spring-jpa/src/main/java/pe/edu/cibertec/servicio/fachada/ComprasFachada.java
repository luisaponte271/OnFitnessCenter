package pe.edu.cibertec.servicio.fachada;

import java.util.List; 
import pe.edu.cibertec.dominio.Compras; 

public interface ComprasFachada {
	
	void crear(Compras compras);
	void actualizar(Compras compras);
	void eliminar(Integer id);
	List<Compras> obtenerTodos();
	Compras obtenerPorId(Integer id);
}
