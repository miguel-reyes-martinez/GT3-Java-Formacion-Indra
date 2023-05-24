import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	public static void main(String[] args) throws IOException {
		List<Prestamo> prestamos = new ArrayList<Prestamo>();

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("biblioteca.txt"));
			String line;
			String nombre = null;
			String autorLibro = null;
			LocalDate fechaSolicitud = null;
			LocalDate fechaEntregaEstipulada = null;
			String estado = null;
			String dni = null;

			while ((line = reader.readLine()) != null) {
				if (line.equals("Nombre")) {
					nombre = reader.readLine();
				} else if (line.equals("Autor")) {
					autorLibro = reader.readLine();
				} else if (line.equals("Fecha de Solicitud")) {
					fechaSolicitud = LocalDate.parse(reader.readLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				} else if (line.equals("Fecha de Entrega Estipulada")) {
					fechaEntregaEstipulada = LocalDate.parse(reader.readLine(),
							DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				} else if (line.equals("Estado:")) {
					estado = reader.readLine();
				} else if (line.equals("DNI")) {
					dni = reader.readLine();
					prestamos
							.add(new Prestamo(dni, nombre, autorLibro, fechaSolicitud, fechaEntregaEstipulada, estado));
				}
			}
		} catch (IOException e) {
			System.out.println("Error al leer el archivo de entrada: " + e.getMessage());
			return;
		} finally {
			reader.close();
		}

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("inventario_y_vencimientos_"
					+ LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ".txt", true));
			for (Prestamo cliente : prestamos) {
				writer.write(cliente.toString());
			}
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo de salida: " + e.getMessage());
		} finally {
			writer.close();
		}
	}
}
