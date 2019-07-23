package pe.edu.cibertec.dominio;

import java.util.Set;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Usuario extends Entidad {
	
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "name")
	private String name;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "active")
	private int active;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Rol> roles;

	public Usuario() {
	    }

	public Usuario(Usuario users) {
			this.id = users.getId();
	        this.active = users.getActive();
	        this.username = users.getUsername();
	        this.email = users.getEmail();
	        this.roles = users.getRoles();
	        this.name = users.getName();
	        this.lastName =users.getLastName();
	        this.id = users.getId();
	        this.password = users.getPassword();
	    }

 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
