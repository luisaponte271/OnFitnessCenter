package pe.edu.cibertec.repositorio.mapper;

import java.util.List;

import pe.edu.cibertec.dominio.Tipomembresia;

 

public interface TipoMembresiaMapper {

	Tipomembresia selectTipoMembresiaPorId(int id);
	void insertTipoMembresia(Tipomembresia tipomembresia);
	void deleteTipoMembresia(int id);
	void updateTipoMembresia(Tipomembresia tipomembresia);
	List<Tipomembresia> selectTodosTipomembresia();
 
}
