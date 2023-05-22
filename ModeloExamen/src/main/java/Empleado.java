import java.time.LocalDate;
import java.time.Period;

public class Empleado implements EmpleadoI {
	private String nombre;
	private String apellido;
	private LocalDate fechaIngreso;
	private LocalDate fechaSalida;
	private char sexo;
	private String ciudad;
	private Posicion posicion;
	private double salarioBase;
	private double salarioFinal;
	private boolean rotacion;
	private int antiguedad;

	public Empleado(String nombre, String apellido, LocalDate fechaIngreso, char sexo, String ciudad, Posicion posicion,
			double salarioBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = LocalDate.now();
		this.sexo = sexo;
		this.ciudad = ciudad;
		this.posicion = posicion;
		this.salarioBase = salarioBase;
		this.salarioFinal = calcularSalario();
		this.rotacion = rotacionRecomendada();
		this.antiguedad = calcularAntiguedad();
	}

	public double calcularSalario() {
		return salarioBase * 0.83;
	}

	public boolean rotacionRecomendada() {
		if (posicion == Posicion.INGENIERO && calcularAntiguedad() >= 2) {
			return true;
		}
		return false;
	}

	public int calcularAntiguedad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaIngreso, fechaActual);
		return periodo.getYears();
	}
}
