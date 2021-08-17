import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Jugador")
public class Jugador {

  @Id
  @Column(name = "idJugador")
  public String idJugador;

  @Column(name = "nombre")
  public String nombre;

  @Column(name = "apellido")
  public String apellido;

  @Column(name = "direccion")
  public String direccion;

  @Column(name = "fechaNacimiento")
  public LocalDateTime fechaNacimiento;

  //CONSTRUCTOR

  public Jugador(String idJugador, String nombre, String apellido, String direccion, LocalDateTime fechaNacimiento) {
    this.idJugador = idJugador;
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.fechaNacimiento = fechaNacimiento;
  }

  //GETTERS

  public String getIdJugador() {
    return idJugador;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getDireccion() {
    return direccion;
  }

  public LocalDateTime getFechaNacimiento() {
    return fechaNacimiento;
  }

  //SETTERS

  public void setIdJugador(String idJugador) {
    this.idJugador = idJugador;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
}
