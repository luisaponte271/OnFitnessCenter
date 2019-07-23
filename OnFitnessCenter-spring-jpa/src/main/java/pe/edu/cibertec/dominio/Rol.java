package pe.edu.cibertec.dominio;
import javax.persistence.*;

@Entity 
public class Rol extends Entidad {
 
    @Column(name = "role")
    private String role;

    public Rol() {
    }
  
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
