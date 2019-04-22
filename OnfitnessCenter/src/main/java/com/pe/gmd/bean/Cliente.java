package com.pe.gmd.bean;

 

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class Cliente {

	private int id;
	private String nombre;
	private String direccion;
	private String tiponombre;
	
	public Cliente(int id, String nombre, String direccion, String tiponombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tiponombre = tiponombre;
	}
	
	
}
