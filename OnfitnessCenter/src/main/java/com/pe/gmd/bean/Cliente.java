package com.pe.gmd.bean;

 

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class Cliente {

	private int id;
	private String nombres;
	private String apellidos;
	private int tipoDocumento;
	private String direccion;
	private int telefono;
	private String correo;
	
	public Cliente(int id, String nombres, String apellidos, int tipoDocumento, String direccion, int telefono,
			String correo) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipoDocumento = tipoDocumento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
	}  
 
	
 
	
	
}
