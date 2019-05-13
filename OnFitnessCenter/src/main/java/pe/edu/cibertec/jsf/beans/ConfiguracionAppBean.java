package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.jsf.beans.membresia.SocioCrearMembresiaBean;
import pe.edu.cibertec.repositorio.RepositorioClases;
import pe.edu.cibertec.repositorio.impl.RepositorioClasesMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioMembresiaMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioVentasMemoriaImpl;
import pe.edu.cibertec.servicio.ClasesServicio;
import pe.edu.cibertec.servicio.ComprasServicio;
import pe.edu.cibertec.servicio.ProductosServicio;
import pe.edu.cibertec.servicio.SocioServicio;
import pe.edu.cibertec.servicio.VentasServicio;

@ManagedBean(eager = true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private SocioServicio socioServicio;
	private ProductosServicio productoServicio;
	private ClasesServicio clasesServicio;
	private ComprasServicio comprasServicio;
	private VentasServicio ventaServicio;
	private Integer id_socio;
	 
	public ConfiguracionAppBean() {
	}

	@PostConstruct
	public void init() { 
		socioServicio = new SocioServicio(new RepositorioSocioMemoriaImpl(), new RepositorioMembresiaMemoriaImpl());  
		productoServicio = new ProductosServicio(new RepositorioProductosMemoriaImpl());
		clasesServicio = new ClasesServicio(new RepositorioClasesMemoriaImpl());
		comprasServicio = new ComprasServicio(new RepositorioComprasMemoriaImpl());
		ventaServicio = new VentasServicio(new RepositorioVentasMemoriaImpl());
	}
	
	public SocioServicio getSocioServicio() {
		return socioServicio;
	}

	public void setSocioServicio(SocioServicio socioServicio) {
		this.socioServicio = socioServicio;
	}

	public Integer getId_socio() {
		return id_socio;
	}

	public void setId_socio(Integer id_socio) {
		this.id_socio = id_socio;
	}

	public ProductosServicio getProductoServicio() {
		return productoServicio;
	}

	public void setProductoServicio(ProductosServicio productoServicio) {
		this.productoServicio = productoServicio;
	}

	public ClasesServicio getClasesServicio() {
		return clasesServicio;
	}

	public void setClasesServicio(ClasesServicio clasesServicio) {
		this.clasesServicio = clasesServicio;
	}

	public ComprasServicio getComprasServicio() {
		return comprasServicio;
	}

	public void setComprasServicio(ComprasServicio comprasServicio) {
		this.comprasServicio = comprasServicio;
	}

	public VentasServicio getVentaServicio() {
		return ventaServicio;
	}

	public void setVentaServicio(VentasServicio ventaServicio) {
		this.ventaServicio = ventaServicio;
	}
 

}
