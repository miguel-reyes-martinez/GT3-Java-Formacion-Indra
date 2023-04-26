import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class EjercicioSet {

    public static void main(String[] args) {
        String rutaArchivo = "archivo.txt"; // Ruta del archivo de texto a leer
        Set<String> conjunto = new HashSet<>(); // Set para almacenar los valores no repetidos

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                conjunto.add(linea); // Agregar cada línea al conjunto, eliminando espacios en blanco al principio y al final
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Imprimir el conjunto por pantalla
        System.out.println("Valores no repetidos en el archivo:");
        for (String valor : conjunto) {
            System.out.println(valor);
        }
    }
}