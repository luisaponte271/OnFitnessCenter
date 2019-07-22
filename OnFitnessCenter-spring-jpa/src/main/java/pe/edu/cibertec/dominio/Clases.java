package pe.edu.cibertec.dominio;

import javax.persistence.Entity;

@Entity
public class Clases extends Entidad {
	
	private String nombre;
	private String descripcion;
	private String horario_inicio;
	private String horario_fin;
	private Integer cupo;
	private String lunes;
	private String martes;
	private String miercoles;
	private String jueves;
	private String viernes;
	private String sabado;
	private String domingo;
//	private String activo;
	private boolean flag;
	
	public Clases(){ 
	}
	 
	public Clases(Integer id,String nombre, String descripcion, String horario_inicio, String horario_fin, Integer cupo,
			String lunes, String martes, String miercoles, String jueves, String viernes, String sabado,
			String domingo,boolean flag) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.horario_inicio = horario_inicio;
		this.horario_fin = horario_fin;
		this.cupo = cupo;
		this.lunes = lunes;
		this.martes = martes;
		this.miercoles = miercoles;
		this.jueves = jueves;
		this.viernes = viernes;
		this.sabado = sabado;
		this.domingo = domingo;
//		this.activo = activo;
		this.flag = flag;
	}
	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getHorario_inicio() {
		return horario_inicio;
	}

	public void setHorario_inicio(String horario_inicio) {
		this.horario_inicio = horario_inicio;
	}

	public String getHorario_fin() {
		return horario_fin;
	}

	public void setHorario_fin(String horario_fin) {
		this.horario_fin = horario_fin;
	}

	public Integer getCupo() {
		return cupo;
	}

	public void setCupo(Integer cupo) {
		this.cupo = cupo;
	}

	public String getLunes() {
		return lunes;
	}

	public void setLunes(String lunes) {
		this.lunes = lunes;
	}

	public String getMartes() {
		return martes;
	}

	public void setMartes(String martes) {
		this.martes = martes;
	}

	public String getMiercoles() {
		return miercoles;
	}

	public void setMiercoles(String miercoles) {
		this.miercoles = miercoles;
	}

	public String getJueves() {
		return jueves;
	}

	public void setJueves(String jueves) {
		this.jueves = jueves;
	}

	public String getViernes() {
		return viernes;
	}

	public void setViernes(String viernes) {
		this.viernes = viernes;
	}

	public String getSabado() {
		return sabado;
	}

	public void setSabado(String sabado) {
		this.sabado = sabado;
	}

	public String getDomingo() {
		return domingo;
	}

	public void setDomingo(String domingo) {
		this.domingo = domingo;
	}

//	public String getActivo() {
//		return activo;
//	}
//
//	public void setActivo(String activo) {
//		this.activo = activo;
//	}
 
}
  