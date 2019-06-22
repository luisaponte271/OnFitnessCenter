package pe.edu.cibertec.repositorio.mapper;

import java.util.List; 
import pe.edu.cibertec.dominio.Ventas; 

public interface VentasMapper {

	Ventas selectVentasPorId(int id);
	void insertVentas(Ventas ventas);
	void deleteVentas(int id);
	void updateVentas(Ventas ventas); 
	List<Ventas> selectTodasVentas();

 
}
