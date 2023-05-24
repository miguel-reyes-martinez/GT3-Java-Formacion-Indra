import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

interface PrestamoI {
	int calcularDiasAtraso();

	String obtenerEstadoPrestamo();

	double calcularDineroAdeudado();

	boolean esClienteMoroso();
}

public class Prestamo extends Persona implements PrestamoI {
	private String tituloLibro;
	private String autorLibro;
	private LocalDate fechaSolicitud;
	private LocalDate fechaEntregaEstipulada;
	private String estado;

	public Prestamo(String dni, String tituloLibro, String autorLibro, LocalDate fechaSolicitud,
			LocalDate fechaEntregaEstipulada, String estado) {
		super(dni);
		this.tituloLibro = tituloLibro;
		this.autorLibro = autorLibro;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaEntregaEstipulada = fechaEntregaEstipulada;
		this.estado = estado;
	}

	public int calcularDiasAtraso() {
		LocalDate fechaHoy = LocalDate.now();
		return (int) ChronoUnit.DAYS.between(fechaEntregaEstipulada, fechaHoy);
	}

	public String obtenerEstadoPrestamo() {
		int diasAtraso = calcularDiasAtraso();
		if (diasAtraso > 0) {
			return "VENCIDO";
		} else {
			return "EN REGLA";
		}
	}

	public double calcularDineroAdeudado() {
		int diasAtraso = calcularDiasAtraso();
		if (diasAtraso > 0) {
			return diasAtraso;
		} else {
			return 0.0;
		}
	}

	public boolean esClienteMoroso() {
		return calcularDiasAtraso() > 0;
	}

	@Override
	public String toString() {
		return "\nNombre del libro: " + tituloLibro + "\nAutor: " + autorLibro + "\nFecha de Solicitud: " + fechaSolicitud
				+ "\nFecha de Entrega Estipulada: " + fechaEntregaEstipulada + "\nEstado del préstamo: "
				+ obtenerEstadoPrestamo() + "\nDNI del cliente: " + dni + "\nDías de atraso: " + calcularDiasAtraso()
				+ "\nDinero adeudado: " + calcularDineroAdeudado() + "\n¿Cliente moroso?: "
				+ (esClienteMoroso() ? "SI" : "NO") + "\n";
	}
}