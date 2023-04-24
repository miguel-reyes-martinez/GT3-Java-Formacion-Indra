import java.util.Date;

//Interfaz para el cálculo del salario neto
interface CalculadoraRRHH {
	double calcularSalarioNeto();
}

// Clase Empleado que hereda de Persona
class Empleado extends Persona implements CalculadoraRRHH {
	private String posicion;
	private double salario;
	private double salario_neto;
	private Date fechaIngreso;

	// Constructor
	public Empleado(String nombre, String apellido, String ciudad, int edad, String posicion, double salario,
			Date fechaIngreso) {
		super(nombre, apellido, ciudad, edad);
		this.posicion = posicion;
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario_neto() {
		return salario_neto;
	}

	public void setSalario_neto(double salario_neto) {
		this.salario_neto = salario_neto;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double calcularSalarioNeto() {
		setSalario_neto(salario * 0.8);
		return salario_neto;
	}
}