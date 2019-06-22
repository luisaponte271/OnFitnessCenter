package pe.edu.cibertec.jsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List; 
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ComponentSystemEvent;

import org.apache.ibatis.session.SqlSession; 
import pe.edu.cibertec.dominio.Socio;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean; 
import pe.edu.cibertec.repositorio.impl.RepositorioSocioIbatisImpl;
 

@ManagedBean
@ViewScoped
public class SocioBean {
 
	private List<Socio> listaSocios;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public SocioBean() {
		System.out.println("Iniciando  SocioBean"); 
	}
	 
	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de SocioBean");
		SqlSession sqlsession  = configuracionAppBean.getSqlSessionFactory();   
		RepositorioSocioIbatisImpl repoSocio = new RepositorioSocioIbatisImpl(sqlsession); 
		listaSocios = repoSocio.obtenerTodos();  
	} 

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
