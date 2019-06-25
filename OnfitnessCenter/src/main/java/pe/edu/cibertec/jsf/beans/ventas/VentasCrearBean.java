package pe.edu.cibertec.jsf.beans.ventas;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped; 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean; 
import pe.edu.cibertec.servicio.ProductosServicio;
import pe.edu.cibertec.servicio.VentasServicio;
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
		ProductosServicio productoServicio = configuracionAppBean.getProductoServicio(); 
		listaProductos = productoServicio.obtenerProductos();

	}

	public String crearVenta() throws ParseException {
		ventas.setFechacreacion((new Date().toString()));
		ventas.setFechacreacion(Util._convertirxfecha(ventas.getFechacreacion()));
		ventas.setFlag(true);

		ProductosServicio productoServicios = configuracionAppBean.getProductoServicio();
		VentasServicio ventaServicios = configuracionAppBean.getVentaServicio();
		  
		ventas.setProducto(productoServicios.obtenerProductosPorId(ventas.getProducto().getId()));
		ventas.setTotal(Util.Calculate(ventas.getProducto().getPrecio(), ventas.getCantidad()));

		ventaServicios.agregar(ventas); 
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
