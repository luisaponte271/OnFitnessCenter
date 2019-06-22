package pe.edu.cibertec.jsf.beans;

import java.io.IOException;
import java.io.InputStream; 
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean; 
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {
   
	private SqlSessionFactory sqlSessionFactory;

	public ConfiguracionAppBean() {
		System.out.println("Creando instancia de ConfiguracionAppBean");  
	}

	@PostConstruct
	public void init()  {
		System.out.println("Inicio de configuración de ConfiguracionAppBean"); 
		String resource = "prueba/mybatis-config.xml";
		try(InputStream inputStream = Resources.getResourceAsStream(resource)){  
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); 
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public SqlSession getSqlSessionFactory() {
		return sqlSessionFactory.openSession();
	}
 
	@PreDestroy
	public void finish() { 
	}
 
}
