package pe.edu.cibertec.jsf.beans.compra;

import java.util.List; 

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped;

import pe.edu.cibertec.dominio.Compras;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.ComprasServicio;

@ManagedBean
@ViewScoped
public class CompraBean {

	private List<Compras> listaCompras;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public CompraBean() {

	}

	@PostConstruct
	public void init() {
		ComprasServicio ComprasServicio = configuracionAppBean.getComprasServicio();
		listaCompras = ComprasServicio.obtenerCompras();
	}
 
	public List<Compras> getListaCompras() {
		return listaCompras;
	}

	public void setListaComprass(List<Compras> listaCompras) {
		this.listaCompras = listaCompras;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
