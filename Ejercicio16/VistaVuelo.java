import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VistaVuelo {
	private JFrame frame;
	private JLabel etiquetaNombre;
	private JLabel etiquetaOrigen;
	private JLabel etiquetaDestino;
	private JLabel etiquetaSalida;
	private JLabel etiquetaLlegada;
	private JLabel etiquetaDuracion;

	public VistaVuelo() {
		frame = new JFrame("Información de Vuelo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(new GridLayout(6, 2));

		etiquetaNombre = crearEtiqueta("Nombre de vuelo: ");
		etiquetaOrigen = crearEtiqueta("ORIGEN: ");
		etiquetaDestino = crearEtiqueta("Destino: ");
		etiquetaSalida = crearEtiqueta("Hora de salida estimada: ");
		etiquetaLlegada = crearEtiqueta("Hora de arribo estimada: ");
		etiquetaDuracion = crearEtiqueta("Duración del vuelo expresada en días: ");

		etiquetaNombre.setOpaque(true);
		etiquetaNombre.setBackground(Color.YELLOW);
		etiquetaOrigen.setOpaque(true);
		etiquetaOrigen.setBackground(Color.GREEN);
		etiquetaDestino.setOpaque(true);
		etiquetaDestino.setBackground(Color.GREEN);

		frame.add(etiquetaNombre);
		frame.add(etiquetaOrigen);
		frame.add(etiquetaDestino);
		frame.add(etiquetaSalida);
		frame.add(etiquetaLlegada);
		frame.add(etiquetaDuracion);

		frame.setVisible(true);
	}

	private JLabel crearEtiqueta(String texto) {
		JLabel etiqueta = new JLabel(texto);
		etiqueta.setHorizontalAlignment(JLabel.CENTER);
		return etiqueta;
	}

	public void actualizarInformacionVuelo(String nombre, String origen, String destino, LocalDateTime salida,
			LocalDateTime llegada) {
		etiquetaNombre.setText("Nombre de vuelo: " + nombre);
		etiquetaOrigen.setText("ORIGEN: " + origen);
		etiquetaDestino.setText("DESTINO: " + destino);
		etiquetaSalida.setText("Hora de salida estimada: " + formatearFechaHora(salida));
		etiquetaLlegada.setText("Hora de arribo estimada: " + formatearFechaHora(llegada));

		Duration duracion = Duration.between(salida, llegada);
		long dias = duracion.toDays();
		long horas = duracion.toHoursPart();
		long minutos = duracion.toMinutesPart();
		etiquetaDuracion.setText("Duración del vuelo: " + dias + " días, " + horas + " horas, " + minutos + " minutos");
	}

	private String formatearFechaHora(LocalDateTime fechaHora) {
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return fechaHora.format(formateador);
	}

}
