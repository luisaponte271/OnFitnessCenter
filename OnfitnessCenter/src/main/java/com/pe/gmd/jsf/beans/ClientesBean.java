package com.pe.gmd.jsf.beans;

  
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import com.pe.gmd.bean.Cliente;
import com.pe.gmd.servicio.ClientesServicio;
 
import lombok.Getter;
import lombok.Setter;
 
@ManagedBean
@ViewScoped
@Getter
@Setter
public class ClientesBean {
	 
	private List<Cliente> listsClientes;

	public ClientesBean() { 
	}
	
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		ClientesServicio clienteServicio = new ClientesServicio();
		listsClientes = clienteServicio.obtenerClientes(); 
	} 
}
