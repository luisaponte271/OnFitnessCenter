package pe.edu.cibertec.dominio;

import java.math.BigDecimal;

import javax.persistence.Entity;

 

 
public class MuestraSocio extends Entidad {
	
	private Integer peso;
	private String fecha_muestra;
	private BigDecimal estatura;
	private Integer masa;
	private Integer grasacorporal;
	private String obs;
}
