package com.pe.gmd.servicio;


import java.util.Arrays;
import java.util.List;

import com.pe.gmd.bean.Cliente;

 

public class ClientesServicio {

	public List<Cliente> obtenerClientes() {
		return Arrays.asList(
				new Cliente(1,"Juanito Perez","Jr.Gracilazo de la Vega Nro. 791 / Lima  / Ate","DIRECTO"),
				new Cliente(2,"3M PERU S. A. ","AV. ENRIQUE CANAVAL Y MOREYRA N� 641  - SAN ISIDRO","TERCERO"),
				new Cliente(3,"4M SALES EIRL","CALLE RIO AMAZONAS  MZ. D LTE  30 URB. VALLE DE LA MOLINA - LA MOLINA","TERCERO"))
				;
	}
}
