package pe.edu.cibertec.repositorio.mapper;

import java.util.List;

import pe.edu.cibertec.dominio.Membresia; 

public interface MembresiaMapper {

	Membresia selectMembresiaPorId(int id);
	void insertMembresia(Membresia membresia);
	void deleteMembresia(int id);
	void updateMembresia(Membresia membresia);
	List<Membresia> selectTodasMembresias();
 
}
