package pe.edu.cibertec.web.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/*@Configuration
@EnableWebSecurity */
public class ConfiguracionSeguridadWeb {
/*	extends WebSecurityConfigurerAdapter {

	@Override
    protected void configure(HttpSecurity http) throws Exception {
		//Opción solo para ambiente de pruebas/aprendizaje
		//PROHIBIDO USAR ESTO EN PRODUCCIÓN
//        http.csrf().disable();
        /*
         * Si se habilita el uso de CSRF (muy buena práctica), TODOS
         * SUS FORMULARIOS deberán tener el siguiente token generado
         * por Spring security
         <form id="un_formulario_de_mi_aplicacion">
         	<!-- contenido... -->
	        <input type="hidden"
	    		name="${_csrf.parameterName}"
	    		value="${_csrf.token}"/>
    	 </form>
         

        //configuración de cierre de sesión
        http.logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .invalidateHttpSession(true)
            .logoutSuccessUrl("/login.xhtml");

        //configuración de seguridad por roles y accesos
        http.authorizeRequests()
        	//Permitir acceso a páginas públicas y de errores
            .antMatchers(
        		"/login.xhtml", "/login",
            	"/hola.xhtml", "/saludo.xhtml",
            	"/scopes.xhtml", "/tienda.xhtml",
                "/500.xhtml", "/denegado.xhtml")
            .permitAll()
            //Solo se pueden crear productos si el rol del usuario es
            //ADMIN
            .antMatchers("/productos/crear.xhtml")
            .hasRole("ADMIN")
            //Solo se puede ver el detalle de un producto si el rol
            //del usuario es ADMIN o USUARIO
            .antMatchers("/productos/detalle.xhtml")
            .hasAnyRole("ADMIN", "USUARIO")
            //En caso que no se haya logueado, mandar a formulario
            //de Login
            .and()
            .formLogin()
            .loginPage("/login.xhtml")
            .loginProcessingUrl("/acceso")
            .usernameParameter("usuario")
            .passwordParameter("contrasena")
            .defaultSuccessUrl("/tienda.xhtml")
            .and().exceptionHandling().accessDeniedPage("/denegado.xhtml");
    }

    @Bean
    public UserDetailsService userDetailsService() {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("administrador").password("admin").roles("ADMIN").build());
        manager.createUser(users.username("luiggi").password("123456").roles("USUARIO").build());
        manager.createUser(users.username("rigoberto").password("abcdef").roles("USUARIO").build());
        return manager;
    } */
}
