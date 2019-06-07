package pe.edu.cibertec.jsf.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean(eager=true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private EntityManagerFactory emf;

	public ConfiguracionAppBean() {
		System.out.println("Creando instancia de ConfiguracionAppBean");
	}

	@PostConstruct
	public void init() {
		System.out.println("Inicio de configuración de ConfiguracionAppBean");
		//iniciar EntityManagerFactory
		emf = Persistence.createEntityManagerFactory("PUJpaDemo");
	}

	@PreDestroy
	public void finish() {
		emf.close();
	}

	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
