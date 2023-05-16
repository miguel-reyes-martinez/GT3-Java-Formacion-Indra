import java.time.LocalDateTime;

public class ControladorVuelo {
	private VistaVuelo vista;
	private ModeloVuelo modelo;

	public ControladorVuelo(VistaVuelo vista, ModeloVuelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}

	public void actualizarInformacionVuelo() {
		String nombre = modelo.getNombre();
		String origen = modelo.getOrigen();
		String destino = modelo.getDestino();
		LocalDateTime salida = modelo.getSalida();
		LocalDateTime llegada = modelo.getLlegada();
		vista.actualizarInformacionVuelo(nombre, origen, destino, salida, llegada);
	}

	public static void main(String[] args) {
		ModeloVuelo modelo = new ModeloVuelo();
		modelo.generarVuelo();

		VistaVuelo vista = new VistaVuelo();
		ControladorVuelo controlador = new ControladorVuelo(vista, modelo);
		controlador.actualizarInformacionVuelo();
	}
}
