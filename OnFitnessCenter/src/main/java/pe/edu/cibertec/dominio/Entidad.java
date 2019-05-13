package pe.edu.cibertec.dominio;

public abstract class Entidad {

	protected Integer id;
	protected boolean flag;
 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
 
	
}
