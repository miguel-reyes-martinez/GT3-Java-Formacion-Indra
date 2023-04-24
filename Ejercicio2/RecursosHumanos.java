import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class RecursosHumanos {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		List<Empleado> empleados = new ArrayList<>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaHoy = new Date();

		// Ingreso de información de empleados por consola
		for (int i = 1; i <= 3; i++) {
			System.out.println("Ingrese información para el empleado " + i + ":");
			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();
			System.out.print("Apellido: ");
			String apellido = scanner.nextLine();
			System.out.print("Ciudad: ");
			String ciudad = scanner.nextLine();
			System.out.print("Edad: ");
			int edad = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer del scanner

			System.out.print("Posición: ");
			String posicion = scanner.nextLine();
			System.out.print("Salario: ");
			double salario = scanner.nextDouble();
			scanner.nextLine(); // Limpiar el buffer del scanner

			System.out.print("Fecha de ingreso (AÑO-MES-DIA): ");
			String fechaIngresoStr = scanner.nextLine();
			Date fechaIngreso = null;
			try {
				fechaIngreso = dateFormat.parse(fechaIngresoStr);
			} catch (java.text.ParseException e) {
				System.out.println("Formato de fecha inválido. Se usará la fecha de hoy.");
				fechaIngreso = fechaHoy;
			}

			Empleado empleado = new Empleado(nombre, apellido, ciudad, edad, posicion, salario, fechaIngreso);
			empleados.add(empleado);
		}
		scanner.close();

		// Cálculo del salario neto
		for (Empleado empleado : empleados) {

			empleado.calcularSalarioNeto();

		}

		// Generación del archivo de salida
		String nombreArchivo = "informacion_empleados_" + dateFormat.format(fechaHoy) + ".txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
		for (Empleado empleado : empleados) {
			writer.write("Nombre: " + empleado.getNombre() + "\n");
			writer.write("Apellido: " + empleado.getApellido() + "\n");
			writer.write("Ciudad: " + empleado.getCiudad() + "\n");
			writer.write("Edad: " + empleado.getEdad() + "\n");
			writer.write("Posición: " + empleado.getPosicion() + "\n");
			writer.write("Salario: " + empleado.getSalario() + "\n");
			writer.write("Salario NETO: " + empleado.getSalario_neto() + "\n");
			writer.write("Fecha de ingreso: " + dateFormat.format(empleado.getFechaIngreso()) + "\n");
			writer.write("\n");
		}
		writer.close();

		System.out.println("Archivo de salida generado: " + nombreArchivo);

	}
}
