package pe.edu.cibertec.jsf.beans;

 
import java.util.ArrayList;
import java.util.List; 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.bean.ViewScoped;  
import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Membresia;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioMembresiaIbatisImpl;  
  
@ManagedBean
@ViewScoped
public class MembresiaBean {
 
	private List<Membresia> listaMembresias;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public MembresiaBean() {
		System.out.println("Iniciando  MembresiaBean"); 
		listaMembresias = new ArrayList<Membresia>();
	}
	 
	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de MembresiaBean");
		SqlSession sqlsession  = configuracionAppBean.getSqlSessionFactory();   
		RepositorioMembresiaIbatisImpl repoMembresia = new RepositorioMembresiaIbatisImpl(sqlsession); 
		listaMembresias = repoMembresia.obtenerTodos();  
	} 
  
	public List<Membresia> getListaMembresias() {
		return listaMembresias;
	}

	public void setListaMembresias(List<Membresia> listaMembresias) {
		this.listaMembresias = listaMembresias;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
