package pe.edu.cibertec.jsf.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import pe.edu.cibertec.dominio.Clases;
import pe.edu.cibertec.dominio.Tipomembresia; 
import pe.edu.cibertec.repositorio.RepositorioClases;
import pe.edu.cibertec.repositorio.RepositorioTipoMembresia;
import pe.edu.cibertec.repositorio.impl.RepositorioClasesMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioComprasMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioMembresiaMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioProductosMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioSocioMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioTipoMembresiaMemoriaImpl;
import pe.edu.cibertec.repositorio.impl.RepositorioVentasMemoriaImpl;
import pe.edu.cibertec.servicio.ClasesServicio;
import pe.edu.cibertec.servicio.ComprasServicio;
import pe.edu.cibertec.servicio.MembresiaServicio;
import pe.edu.cibertec.servicio.ProductosServicio;
import pe.edu.cibertec.servicio.SocioServicio;
import pe.edu.cibertec.servicio.TipoMembresiaServicio;
import pe.edu.cibertec.servicio.VentasServicio;

@ManagedBean(eager = true)
@ApplicationScoped
public class ConfiguracionAppBean {

	private SocioServicio socioServicio;
	private ProductosServicio productoServicio;
	private ClasesServicio clasesServicio;
	private ComprasServicio comprasServicio;
	private VentasServicio ventaServicio;  
	private TipoMembresiaServicio tipomembresiaServicio;
	private MembresiaServicio membresiaServicio;
	
	public ConfiguracionAppBean() {
	}

	@PostConstruct
	public void init() { 
		socioServicio = new SocioServicio(new RepositorioSocioMemoriaImpl());  
		productoServicio = new ProductosServicio(new RepositorioProductosMemoriaImpl());
		clasesServicio = new ClasesServicio(new RepositorioClasesMemoriaImpl());
		comprasServicio = new ComprasServicio(new RepositorioComprasMemoriaImpl());
		ventaServicio = new VentasServicio(new RepositorioVentasMemoriaImpl());
		tipomembresiaServicio = new TipoMembresiaServicio(new RepositorioTipoMembresiaMemoriaImpl());
		membresiaServicio = new MembresiaServicio(new RepositorioMembresiaMemoriaImpl());
	}
	
	public SocioServicio getSocioServicio() {
		return socioServicio;
	}

	public void setSocioServicio(SocioServicio socioServicio) {
		this.socioServicio = socioServicio;
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

	public TipoMembresiaServicio getTipomembresiaServicio() {
		return tipomembresiaServicio;
	}

	public void setTipomembresiaServicio(TipoMembresiaServicio tipomembresiaServicio) {
		this.tipomembresiaServicio = tipomembresiaServicio;
	}

	public MembresiaServicio getMembresiaServicio() {
		return membresiaServicio;
	}

	public void setMembresiaServicio(MembresiaServicio membresiaServicio) {
		this.membresiaServicio = membresiaServicio;
	}
 

}
