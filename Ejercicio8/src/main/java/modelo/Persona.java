package modelo;
import java.util.Calendar;

public class Persona {
	  protected String nombre;
	  protected String apellido;
	  protected Calendar fechaNacimiento;

	  public Persona(String nombre, String apellido, Calendar fechaNacimiento) {
	    this.nombre = nombre;
	    this.apellido = apellido;
	    this.fechaNacimiento = fechaNacimiento;
	  }

	  // Setters y Getters
	  public String getNombre() {
	    return nombre;
	  }

	  public void setNombre(String nombre) {
	    this.nombre = nombre;
	  }

	  public String getApellido() {
	    return apellido;
	  }

	  public void setApellido(String apellido) {
	    this.apellido = apellido;
	  }

	  public Calendar getFechaNacimiento() {
	    return fechaNacimiento;
	  }

	  public void setFechaNacimiento(Calendar fechaNacimiento) {
	    this.fechaNacimiento = fechaNacimiento;
	  }
	}