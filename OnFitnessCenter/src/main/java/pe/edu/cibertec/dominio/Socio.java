package pe.edu.cibertec.dominio;

public class Socio extends Entidad{
		private String nombre;
		private String apellido_pat;
		private String apellido_mat;
		private String telefono;
		private String fecha_nac;
		private String direccion;
		private String email;
		private String obs;
		
		public Socio() { 
			
		}

		public Socio(Integer id,String nombre, String apellido_pat, String apellido_mat, String telefono, String fecha_nac,	String email, String direccion,
			  String obs, boolean flag) {
			this.id = id;
			this.nombre = nombre;
			this.apellido_pat = apellido_pat;
			this.apellido_mat = apellido_mat;
			this.telefono = telefono;
			this.fecha_nac = fecha_nac;
			this.direccion = direccion;
			this.email = email;
			this.obs = obs;
			this.flag = flag;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido_pat() {
			return apellido_pat;
		}

		public void setApellido_pat(String apellido_pat) {
			this.apellido_pat = apellido_pat;
		}

		public String getApellido_mat() {
			return apellido_mat;
		}

		public void setApellido_mat(String apellido_mat) {
			this.apellido_mat = apellido_mat;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getFecha_nac() {
			return fecha_nac;
		}

		public void setFecha_nac(String fecha_nac) {
			this.fecha_nac = fecha_nac;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getObs() {
			return obs;
		}

		public void setObs(String obs) {
			this.obs = obs;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		
		
		
}
