import java.time.LocalDateTime;

public class ModeloVuelo {
	private String nombre;
	private String origen;
	private String destino;
	private LocalDateTime salida;
	private LocalDateTime llegada;

	public void generarVuelo() {
		nombre = "Caribean Destination";
		origen = "Barcelona";
		destino = "El Caribe";
		salida = LocalDateTime.of(2023, 5, 17, 9, 0, 0);
		llegada = LocalDateTime.of(2023, 5, 17, 16, 30, 0);
	}

	public String getNombre() {
		return nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public LocalDateTime getSalida() {
		return salida;
	}

	public LocalDateTime getLlegada() {
		return llegada;
	}

}
