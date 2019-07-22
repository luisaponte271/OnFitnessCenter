package pe.edu.cibertec.repositorio.configuracion;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariDataSource;

@PropertySource("classpath:config-mysql.properties")
@Configuration
public class ConfiguracionBD {

	@Value("${database.jdbc.driverClass}")
    private String driverClassName;
	@Value("${database.jdbc.url}")
    private String url;
	@Value("${database.jdbc.usuario}")
    private String usuario;
	@Value("${database.jdbc.contrasena}")
    private String contrasena;
	@Value("${database.jdbc.tamanioMaximoConexiones}")
    private int tamanioMaximoConexiones;

    @Bean
    public DataSource dataSource() {
        HikariDataSource ds = new HikariDataSource();

        ds.setDriverClassName(driverClassName);
        ds.setJdbcUrl(url);
        ds.setUsername(usuario);
        ds.setPassword(contrasena);
        ds.setMaximumPoolSize(tamanioMaximoConexiones);

        return ds;
    }
}
