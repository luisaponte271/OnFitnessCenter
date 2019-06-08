package pe.edu.cibertec.dominio;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 
@Entity
public class Ventas extends Entidad {
	 
	private Integer cantidad;
	private BigDecimal total;
	private String fechacreacion;
	@ManyToOne(optional=false,fetch=FetchType.EAGER)
	@JoinColumn(name="id_producto")
	private Productos producto;
	private boolean flag;
	
	public Ventas(){ 
		producto = new Productos();
	}
  
	public Ventas(Integer id, Productos producto, Integer cantidad, BigDecimal total, String fechacreacion, boolean flag) {
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


	public Productos getProducto() {
		return producto;
	}


	public void setProducto(Productos producto) {
		this.producto = producto;
	}
	
}