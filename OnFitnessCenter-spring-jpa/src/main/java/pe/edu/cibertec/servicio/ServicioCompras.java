package pe.edu.cibertec.servicio;

import java.util.List; 
import pe.edu.cibertec.dominio.Compras; 

public interface ServicioCompras {

	void crear(Compras compras);
	void actualizar(Compras compras);
	void eliminar(Integer id);
	List<Compras> obtenerTodos();
	Compras obtenerPorId(Integer id);
}
