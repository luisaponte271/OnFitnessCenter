package pe.edu.cibertec.servicio.impl;

import java.util.List;

 
import org.springframework.stereotype.Service;
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.repositorio.RepositorioSocio;
import pe.edu.cibertec.repositorio.RepositorioUsuario;
import pe.edu.cibertec.servicio.ServicioSocio;
import pe.edu.cibertec.servicio.ServicioUsuario;

import org.springframework.transaction.annotation.Transactional; 

@Service
public class ServicioUsuarioImpl implements ServicioUsuario { 
	private final RepositorioUsuario repositorioUsuario;

	public ServicioUsuarioImpl(RepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;
	}
	@Transactional
	@Override
	public void crear(Usuario usuario) {
		// TODO Auto-generated method stub
		repositorioUsuario.agregar(usuario);
	}
	@Transactional
	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		repositorioUsuario.actualizar(usuario);
	}
	@Transactional
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorioUsuario.eliminar(id);
	}
	@Transactional
	@Override
	public List<Usuario> obtenerTodos() {
		// TODO Auto-generated method stub
		return repositorioUsuario.obtenerTodos();
	}
	@Transactional
	@Override
	public Usuario obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return repositorioUsuario.obtenerPorId(id);
	}
 

}
