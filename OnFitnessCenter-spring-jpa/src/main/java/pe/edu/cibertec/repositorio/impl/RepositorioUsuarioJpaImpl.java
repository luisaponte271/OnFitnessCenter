package pe.edu.cibertec.repositorio.impl;

import org.springframework.stereotype.Repository; 
import pe.edu.cibertec.dominio.Usuario; 
import pe.edu.cibertec.repositorio.RepositorioUsuario;

@Repository
public class RepositorioUsuarioJpaImpl extends RepositorioBaseJpaImpl<Usuario> implements RepositorioUsuario {

}
