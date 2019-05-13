package pe.edu.cibertec.dominio;

import java.math.BigDecimal;

public class Compras extends Entidad{
	  
	private Productos producto;
	private Integer cantidad; 
	private BigDecimal total;
	private String fechacreacion;
	private String estado;
	  
	public Compras(Integer id,Productos producto, Integer cantidad, BigDecimal total,
			String fechacreacion, String estado) {
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = total;
		this.fechacreacion = fechacreacion;
		this.estado = estado;
	}
	public Compras() {
		// TODO Auto-generated constructor stub
	}
	public Productos getProducto() {
		return producto;
	}
	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public String getFechacreacion() {
		return fechacreacion;
	}
	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
 
	
	
}
