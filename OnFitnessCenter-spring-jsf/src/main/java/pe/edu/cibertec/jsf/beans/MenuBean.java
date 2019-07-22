package pe.edu.cibertec.jsf.beans;
 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
 
@Component
@Scope("request")  
public class MenuBean { 
	 
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
	public String Membresia() { 
		return "/membresia/listar";
	}
	 
  
}
