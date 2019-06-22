package pe.edu.cibertec.repositorio.mapper;

import java.util.List;  
import pe.edu.cibertec.dominio.Socio; 

public interface SocioMapper {

	Socio selectSociosPorId(int id);
	void insertSocio(Socio socio);
	void deleteSocio(int id);
	void updateSocio(Socio socio);
	List<Socio> selectTodosSocios();

 
}
