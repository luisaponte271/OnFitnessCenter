package pe.edu.cibertec.servicio.fachada.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.servicio.ServicioSocio;
import pe.edu.cibertec.servicio.ServicioUsuario;
import pe.edu.cibertec.servicio.fachada.SocioFachada;
import pe.edu.cibertec.servicio.fachada.UsuarioFachada;
@Service
public class UsuarioFachadaImpl implements UsuarioFachada {
	
	@Autowired
	ServicioUsuario servicioUsuario;

	@Override
	public void crear(Usuario usuario) {
		// TODO Auto-generated method stub
		servicioUsuario.crear(usuario);
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		servicioUsuario.actualizar(usuario);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		servicioUsuario.eliminar(id);
	}

	@Override
	public List<Usuario> obtenerTodos() {
		// TODO Auto-generated method stub
		return servicioUsuario.obtenerTodos();
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return servicioUsuario.obtenerPorId(id);
	}
	  
} 
