package pe.edu.cibertec.jsf.beans;

import java.util.ArrayList;
import java.util.List; 

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.RepositorioCompras;
import pe.edu.cibertec.repositorio.impl.RepositorioClasesIbatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasIbatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioIbatisImpl;
 
@ManagedBean
@ViewScoped
public class ComprasBean {

	private List<Compras> listaCompras;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public ComprasBean() {
			listaCompras = new ArrayList<Compras>();
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de ComprasBean");
		SqlSession sqlsession  = configuracionAppBean.getSqlSessionFactory();   
		RepositorioComprasIbatisImpl repoCompras = new RepositorioComprasIbatisImpl(sqlsession); 
		 
		listaCompras = repoCompras.obtenerTodos(); 	
		 
	}
	 
	public List<Compras> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compras> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}
}
