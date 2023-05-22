import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class AppEmpleados {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Empleado empleado1 = crearEmpleado(scanner);
		Empleado empleado2 = crearEmpleado(scanner);
		Empleado empleado3 = crearEmpleado(scanner);

		scanner.close();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String empleado1Json = gson.toJson(empleado1);
		String empleado2Json = gson.toJson(empleado2);
		String empleado3Json = gson.toJson(empleado3);

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("empleados.txt");
			fileWriter.write(empleado1Json + "\n");
			fileWriter.write(empleado2Json + "\n");
			fileWriter.write(empleado3Json + "\n");
			fileWriter.close();
			System.out.println("Se ha generado el archivo empleados.json correctamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Empleado crearEmpleado(Scanner scanner) {

		System.out.println("Ingrese el nombre del empleado:");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese el apellido del empleado:");
		String apellido = scanner.nextLine();

		System.out.println("Ingrese la fecha de ingreso del empleado (en formato yyyy-mm-dd):");
		LocalDate fechaIngreso = LocalDate.parse(scanner.nextLine());

		System.out.println("Ingrese el sexo del empleado (M/F):");
		char sexo = scanner.nextLine().charAt(0);

		System.out.println("Ingrese la ciudad del empleado:");
		String ciudad = scanner.nextLine();

		System.out.println("Ingrese la posición del empleado (INGENIERO/ANALISTA/GERENTE):");
		Posicion posicion = Posicion.valueOf(scanner.nextLine().toUpperCase());

		System.out.println("Ingrese el salario base del empleado:");
		double salarioBase = Double.parseDouble(scanner.nextLine());

		return new Empleado(nombre, apellido, fechaIngreso, sexo, ciudad, posicion, salarioBase);
	}
}
