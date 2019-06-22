package pe.edu.cibertec.repositorio.mapper;

import java.util.List; 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.filtro.FiltroProducto;

public interface ProductoMapper {

	Productos selectProductosPorId(int id);
	void insertProducto(Productos producto);
	void deleteProducto(int id);
	void updateProducto(Productos productos);
	List<Productos> selectTodosProductos();

//	List<Productos> selectProductoPorFiltro(FiltroProducto filtroProducto);
//	List<Productos> selectProductoSP(FiltroProducto filtroProducto);
}
