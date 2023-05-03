package pildoras.aop;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;

	public Persona() {

	}

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public boolean equals(Object o) {
		// Verifica si el objeto es el mismo que el objeto que se está comparando
		if (this == o)
			return true;
		// Verifica si el objeto es nulo o si no es de la misma clase que el objeto que
		// se está comparando
		if (o == null || getClass() != o.getClass())
			return false;

		// Convierte el objeto a una instancia de la clase Persona para poder compararlo
		Persona persona = (Persona) o;

		// Compara los atributos de la instancia actual con los atributos de la
		// instancia comparada
		if (edad != persona.edad)
			return false;
		if (!nombre.equals(persona.nombre))
			return false;
		if (!apellido.equals(persona.apellido))
			return false;

		// Si todos los atributos son iguales, se considera que los objetos son iguales
		return true;
	}

	@Override
	public int hashCode() {
		int result = nombre.hashCode();
		result = 28 * result + apellido.hashCode();
		result = 28 * result + edad;
		return result;
	}

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
