package pe.edu.cibertec.jsf.beans.ventas;

import java.util.List; 

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty; 
import javax.faces.view.ViewScoped;

import pe.edu.cibertec.dominio.Ventas;
import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
import pe.edu.cibertec.servicio.VentasServicio;

@ManagedBean
@ViewScoped
public class VentaBean {

	private List<Ventas> listaVentas;

	@ManagedProperty(value = "#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;

	public VentaBean() {

	}

	@PostConstruct
	public void init() {
		VentasServicio VentasServicio = configuracionAppBean.getVentaServicio();
		listaVentas = VentasServicio.obtenerVentas();
	}

	public List<Ventas> getListaVentas() {
		return listaVentas;
	}

	public void setListaVentass(List<Ventas> listaVentas) {
		this.listaVentas = listaVentas;
	}

	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	}

	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}

}
