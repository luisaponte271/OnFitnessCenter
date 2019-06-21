package pe.edu.cibertec.dominio;

import java.math.BigDecimal;
 
 
public class Compras extends Entidad{
	   
	private Integer cantidad; 
	private BigDecimal total;
	private String fechacreacion;  
	private Productos producto;
	private boolean flag;
	
	
	public Compras() {
		// TODO Auto-generated constructor stub
		producto = new Productos();
	}
	   
	public Compras(Integer id,Productos producto, Integer cantidad, BigDecimal total,
			String fechacreacion, boolean flag) {
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
		this.total = total;
		this.fechacreacion = fechacreacion;
		this.flag = flag;
	}
	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
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
 
}
