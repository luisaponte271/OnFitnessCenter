package pe.edu.cibertec.repositorio.impl;

import java.util.Date;
import java.util.List;

import pe.edu.cibertec.dominio.Socio;

import pe.edu.cibertec.repositorio.RepositorioSocio;

public class RepositorioSocioMemoriaImpl implements RepositorioSocio {

	private RepositorioMemoria<Socio> datos;

	public RepositorioSocioMemoriaImpl() {
		datos = new RepositorioMemoria<Socio>();
 
		agregar(new Socio(1,"LUIS ALBERTO","APONTE","CANCHANYA"			,"991052654",		"1994-11-09 00:00:00.000", 	"luisaponte271@gmail.com"						 ,"Mz. M Lote 26 Asoc. Virgen del Carmen - Ate"  			  ,"",true));
		agregar(new Socio(2,"GELME IGNACIO","JARA","VENTURA"			,"945350517",		"1964-11-04 00:00:00.000", 	"ing.roycayetano@hotmail.com"					 ,"Jr. Los Petroquímicos Nº 111 Dpto. 101 - La Molina"        ,"",true));
		agregar(new Socio(3,"SUSY","JARA","VENTURA"						,"991052654",		"1961-08-27 00:00:00.000", 	"Ronald-tg@hotmail.com"							 ,"Calle Los Olivos Mz. E-1 Lt. 14 Asoc. Virgen del Carmen"   ,"",true));
		agregar(new Socio(4,"WILFREDO RAFAEL","JARA","VENTURA"			,"991853005",		"1968-06-09 00:00:00.000", 	"kendy_fya32@hotmail.com"						 ,"Calle Los Olivos Mz. E-1 Lt. 15 Asoc. Virgen del Carmen"   ,"",true));
		agregar(new Socio(5,"DAVID","PRINCIPE","VENTURA"				,"989409331",		"2001-09-27 00:00:00.000", 	"daespinozan.22@gmail.com"						 ,"Calle Los Olivos Mz. E-1 Lt. 13 Asoc.Virgen del Carmen"    ,"",true));
		agregar(new Socio(6,"WILLIAMS","PARIONA","GOMEZ"				,"989417275",		"2001-09-27 00:00:00.000", 	"ing.roycayetano@hotmail.com"					 ,"Calle 30 de Agosto Mz. A Lte. 07 Urb. Los Socialis"	      ,"",true));
		agregar(new Socio(7,"JHON KENNEDY","LEON","PALACIOS"			,"962701753",		"1985-01-11 00:00:00.000", 	"martinzuritab@gmail.com" 						 ,"Asoc. Virgen del Carmen Mz E Lt. 39"                       ,"",true));
		agregar(new Socio(8,"FERNANDO","DEPAZ","DEPAZ"					,"990917319",		"1983-02-23 00:00:00.000", 	"erick.veliz@jararesistencias.com"				 ,"Urb. Villa Victoria Mz. G  Lt. 9"                          ,"",true));
		agregar(new Socio(9,"GREGORIO WALTER","MACHA","ROJAS"			,"997138855",		"2001-09-27 00:00:00.000", 	"daespinozan.22@gmail.com"						 ,"Los Claveles de Javier Prado Mz. B Lt. 15 Urb. Ceres"      ,"",true));
		agregar(new Socio(10,"ANGELA PATRICIA","ROMERO","DAMIAN"		,"993344004",		"1988-01-06 00:00:00.000", 	"tommy20_th@hotmail.com"						 ,"Urb. Las Terrazas de Caraponguillo Mz. P Lt. 15"           ,"",true));
		agregar(new Socio(11,"NILO","RAYMUNDO","SUAREZ"					,"968521545",		"2001-09-27 00:00:00.000", 	"svv_1989_18@hotmail.com"						 ,"Jr. Junín 3149 Urb. Perú - SMP"                            ,"",true));
		agregar(new Socio(12,"ROSSE MARY","MATA","NARCISO"				,"945759426",		"1985-02-21 00:00:00.000", 	"tommy20_th@hotmail.com"						 ,"Asoc. de Viv. Los Girasoles Mz. E Lt. 17 Ate"              ,"",true));
		agregar(new Socio(13,"HENRY DIEGO","ADRIANZEN","OLAYA"			,"993344004",		"2001-09-27 00:00:00.000", 	"jguerreroschirinos@gmail.com"					 ,"Av. Las Violetas Nº 662 Mz. J Lt. 41 - Ermitaño"           ,"",true));
		agregar(new Socio(14,"MARITZA MERY","APONTE","RIVERA"			,"972921326",		"1974-08-30 00:00:00.000", 	"raulesuarez25@gmail.com"						 ,"Asoc. Virgen del Carmen Mz. M Lt. 23 - Ate"                ,"",true));
		agregar(new Socio(15,"LUIS ANGEL","SAMANIEGO","MAYTA"			,"966975497",		"1987-06-19 00:00:00.000", 	"abaldeonr@uni.pe"								 ,"Urb. Las Moras Río Chira 432"                              ,"",true));
		agregar(new Socio(16,"LORENA STEPHANY","PEZANTES","TAPIA"		,"966789379",		"1987-07-13 00:00:00.000", 	"almendra_ynfantes@hotmail.com"					 ,"Urb. Villa Victoria Mz. G Lt. 9"                           ,"",true));
	  
	}

	public void agregar(Socio Socio) { 
		datos.agregar(Socio);
	}

	public List<Socio> obtenerTodos() {
		return datos.obtenerTodos();
	}

	public Socio obtenerPorId(Integer id) {
		return datos.obtenerPorId(id);
	}

	@Override
	public void actualizar(Integer id,Socio Socio) {
		datos.actualizar(id,Socio); 
	}
	
	public void eliminar(Integer id) { 
		 datos.eliminar(id);
	}

	
}
