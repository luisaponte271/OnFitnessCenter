package pe.edu.cibertec.jsf.beans;

 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import pe.edu.cibertec.jsf.beans.ConfiguracionAppBean;
 
  
@ManagedBean
@RequestScoped
public class MenuBean { 
	
	@ManagedProperty(value="#{configuracionAppBean}")
	private ConfiguracionAppBean configuracionAppBean;
	
	public MenuBean(){ 
		
	}
	 
	public String Socio() { 
		return "/socio/listar";
	}
	public String Producto() { 
		return "/productos/listar";
	}
	public String Clases() { 
		return "/clases/listar";
	}
	public String Compras() { 
		return "/compras/listar";
	}
	public String Ventas() { 
		return "/ventas/listar";
	}
	
	 
	public ConfiguracionAppBean getConfiguracionAppBean() {
		return configuracionAppBean;
	}


	public void setConfiguracionAppBean(ConfiguracionAppBean configuracionAppBean) {
		this.configuracionAppBean = configuracionAppBean;
	} 
	 
	
 
  
}
