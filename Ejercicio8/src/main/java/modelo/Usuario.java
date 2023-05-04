package modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Usuario extends Persona {
	private String nombreUsuario;
	private String email;
	private int edad;

	public Usuario(String nombre, String apellido, Calendar fechaNacimiento, String nombreUsuario, String email) {
		super(nombre, apellido, fechaNacimiento);
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.edad = calcularEdad();
	}

	// Setters y Getters
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int calcularEdad() {
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.setTimeInMillis(this.getFechaNacimiento().getTime().getTime());
		Calendar hoy = Calendar.getInstance();
		int edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		if (hoy.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH)) {
			edad--;
		} else if (hoy.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH)
				&& hoy.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH)) {
			edad--;
		}
		return edad;
	}

	@Override
	public String toString() {
	    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	    String fechaNacimientoString = df.format(fechaNacimiento.getTime());
	    return "Usuario{" +
	            "nombre='" + nombre + '\'' +
	            ", apellido='" + apellido + '\'' +
	            ", fechaNacimiento=" + fechaNacimientoString +
	            ", nombreUsuario='" + nombreUsuario + '\'' +
	            ", email='" + email + '\'' +
	            ", edad=" + edad +
	            '}';
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}