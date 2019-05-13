package pe.edu.cibertec.repositorio.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

 

import pe.edu.cibertec.dominio.Entidad;

public class RepositorioMemoria<T extends Entidad> {

	private AtomicInteger semilla;

	private ConcurrentMap<Integer, T> datos;

	public RepositorioMemoria() {
		datos = new ConcurrentHashMap<>();
		semilla = new AtomicInteger(0);
	}

	public void agregar(T elemento) {
	    Integer id = semilla.incrementAndGet();
		datos.put(id, elemento);
		elemento.setId(id);
	}

	public List<T> obtenerTodos() {
		return new ArrayList<>(datos.values()); 
	}

	public List<T> obtenerTodosPorId(Integer id) {
		datos.get(id);
		return new ArrayList<>(datos.values());
	}
	
	public T obtenerPorId(Integer id) {
		return datos.get(id);
	}
	
	public void actualizar(Integer id, T elemento){   
		datos.put(id,elemento); 
		
	}
}
