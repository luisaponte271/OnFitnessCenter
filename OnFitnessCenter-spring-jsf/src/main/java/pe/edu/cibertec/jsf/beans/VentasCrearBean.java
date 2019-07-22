package pe.edu.cibertec.jsf.beans;

import java.text.ParseException; 
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 
import pe.edu.cibertec.dominio.Productos;
import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.servicio.fachada.ProductoFachada;
import pe.edu.cibertec.servicio.fachada.VentasFachada;
import pe.edu.cibertec.util.Util;

@Component
@Scope("view")  
public class VentasCrearBean {

	private ProductoFachada productoFachada;
	private VentasFachada ventasFachada;
	private Ventas ventas;
	private List<Productos> listaProductos;

	public VentasCrearBean(ProductoFachada productoFachada, VentasFachada ventasFachada) {
		System.out.println("Iniciando configuración de Cargar");
		this.productoFachada = productoFachada;
		this.ventasFachada = ventasFachada;
		ventas = new Ventas();
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando configuración de VentasBean");
		listaProductos = productoFachada.obtenerTodos();

	}

	public String crearVenta() throws ParseException {
		ventas.setFechacreacion((new Date().toString()));
		ventas.setFechacreacion(Util._convertirxfecha(ventas.getFechacreacion()));
		ventas.setFlag(true);
 
		ventas.setProducto(productoFachada.obtenerPorId(ventas.getProducto().getId()));
		ventas.setTotal(Util.Calculate(ventas.getProducto().getPrecio(), ventas.getCantidad()));

		ventasFachada.crear(ventas); 
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
 
}
