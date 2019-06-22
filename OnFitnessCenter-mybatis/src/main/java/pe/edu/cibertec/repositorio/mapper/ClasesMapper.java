package pe.edu.cibertec.repositorio.mapper;

import java.util.List; 
import pe.edu.cibertec.dominio.Clases; 

public interface ClasesMapper {

	Clases selectClasesPorId(int id);
	void insertClases(Clases clases);
	void deleteClases(int id);
	void updateClases(Clases clases);
	List<Clases> selectTodasClases();

 
}
