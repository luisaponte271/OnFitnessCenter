package pe.edu.cibertec.web.seguridad;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.servicio.fachada.UsuarioFachada;

@Configuration
@EnableWebSecurity 
public class ConfiguracionSeguridadWeb 
	extends WebSecurityConfigurerAdapter {

	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		//Opción solo para ambiente de pruebas/aprendizaje
		//PROHIBIDO USAR ESTO EN PRODUCCIÓN
//        http.csrf().disable();
  
//         * Si se habilita el uso de CSRF (muy buena práctica), TODOS
//         * SUS FORMULARIOS deberán tener el siguiente token generado
//         * por Spring security
//         <form id="un_formulario_de_mi_aplicacion">
//         	<!-- contenido... -->
//	        <input type="hidden"
//	    		name="${_csrf.parameterName}"
//	    		value="${_csrf.token}"/>
//    	 </form>


        //configuración de cierre de sesión
        http.logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .invalidateHttpSession(true)
            .logoutSuccessUrl("/login.xhtml");

        //configuración de seguridad por roles y accesos
        http.authorizeRequests()
        	//Permitir acceso a páginas públicas y de errores
            .antMatchers(
            		"/clases/agregar.xhml",  	"/clases/crear.xhtml",
            		"/clases/eliminar.xhtml",	"/clases/listar.xhtml",
            		"/clases/update.xhtml",
            		"/compras/crear.xhtml",		"/compras/eliminar.xhtml",
            		"/compras/listar.xhtml",	"/compras/listar.xhtml",
            		"/compras/update.xhtml",
            		"/membresia/crear.xhtml",	"/membresia/listar.xhtml",
            		"/membresia/pagar.xhtml",
            		"/productos/crear.xhtml",	"/productos/eliminar.xhtml",
            		"/productos/listar.xhtml",	"/productos/update.xhtml",
            		"/socio/crear.xhtml",		"/socio/eliminar.xhtml",
            		"/socio/listar.xhtml",		"/socio/update.xhtml",
            		"/ventas/crear.xhtml",		"/ventas/eliminar.xhtml",
            		"/ventas/listar.xhtml",		"/ventas/listar.xhtml",
            		"/ventas/update.xhtml",
            		"/login.xhtml", 			"/denegado.xhtml")
            .permitAll() 
            .antMatchers("/socio/listar.xhtml")
            .hasAnyRole("ADMIN", "USUARIO") 
            .and()
            .formLogin()
            .loginPage("/login.xhtml")
            .loginProcessingUrl("/acceso")
            .usernameParameter("usuario")
            .passwordParameter("contrasena")
            .defaultSuccessUrl("/socio/listar.xhtml")
            .and().exceptionHandling().accessDeniedPage("/denegado.xhtml");
    }

    @Bean
    public UserDetailsService userDetailsService() {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("NP154905").password("091194se").roles("ADMIN").build());
        manager.createUser(users.username("NP375143").password("contrasenia").roles("USUARIO").build());
        manager.createUser(users.username("NP375128").password("prueba").roles("USUARIO").build());
        return manager;
    } 
}
