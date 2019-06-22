package pe.edu.cibertec.jsf.beans;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import org.apache.ibatis.session.SqlSession;

import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasIbatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosIbatisImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioVentasIbatisImpl;
import pe.edu.cibertec.util.Util;

@ManagedBean
@ViewScoped
public class VentasCrearBean {
	private Ventas ventas;
	private List<Productos> listaProductos;
	private Util util;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public VentasCrearBean() {
		System.out.println("Iniciando configuración de Cargar");
		if (ventas == null || listaProductos == null) {
			ventas = new Ventas();
			listaProductos = new ArrayList<Productos>();
		}
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de VentasBean");

		SqlSession sqlsession = configuracionAppBean.getSqlSessionFactory();
		RepositorioProductosIbatisImpl repoProductos = new RepositorioProductosIbatisImpl(sqlsession);

		listaProductos = repoProductos.obtenerTodos();

	}

	public String crearVenta() throws ParseException {
		ventas.setFechacreacion((new Date().toString()));
		ventas.setFechacreacion(Util._convertirxfecha(ventas.getFechacreacion()));
		ventas.setFlag(true);

		SqlSession sqlsession = configuracionAppBean.getSqlSessionFactory();
		RepositorioProductosIbatisImpl repoProductos = new RepositorioProductosIbatisImpl(sqlsession);
		RepositorioVentasIbatisImpl repoVentas = new RepositorioVentasIbatisImpl(sqlsession);

		ventas.setProducto(repoProductos.obtenerPorId(ventas.getProducto().getId()));
		ventas.setTotal(Util.Calculate(ventas.getProducto().getPrecio(), ventas.getCantidad()));

		repoVentas.agregar(ventas);
		sqlsession.commit();
		 
		return "/ventas/listar.xhtml?faces-redirect=true";
	}

	public Ventas getVentas() {
		return ventas;
	}

	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}

	public List<Productos> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Productos> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

}
