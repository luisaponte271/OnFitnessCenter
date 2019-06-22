package pe.edu.cibertec.repositorio.mapper;

import java.util.List; 
import pe.edu.cibertec.dominio.Compras; 

public interface ComprasMapper {

	Compras selectComprasPorId(int id);
	void insertCompras(Compras compras);
	void deleteCompras(int id);
	void updateCompras(Compras compras); 
	List<Compras> selectTodasCompras();

 
}
