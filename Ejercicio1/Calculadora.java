import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero1, numero2, resultado;
		String operacion;

		System.out.println("Bienvenido a la calculadora!");
		System.out.print("Ingresa el primer número: ");
		numero1 = scanner.nextDouble();

		System.out.print("Ingresa el segundo número: ");
		numero2 = scanner.nextDouble();

		System.out.print("Ingresa la operación (+, -, *, /): ");
		operacion = scanner.next();

		try {
			switch (operacion) {
			case "+":
				resultado = numero1 + numero2;
				System.out.println("El resultado de la suma es: " + resultado);
				break;
			case "-":
				resultado = numero1 - numero2;
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case "*":
				resultado = numero1 * numero2;
				System.out.println("El resultado de la multiplicación es: " + resultado);
				break;
			case "/":
				if (numero2 == 0) {
					throw new ArithmeticException("No es posible dividir por 0.");
				} else {
					resultado = numero1 / numero2;
					System.out.println("El resultado de la división es: " + resultado);
				}
				break;
			default:
				System.out.println("Operación no válida.");
			}
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}

		scanner.close();
	}
}