import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.BufferedWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            File archivo = new File("INFO_VUELOS.txt");
            String archivoSalida = "vuelos_salida.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida));
            
            String primeraLineaString = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s", "Nombre Empresa", 
            		"Nombre Vuelo", "Nº Pasajeros", "Tipo Pasaje", "Precio Vuelo", "Fecha Vuelo", 
            		"Dias de diferencia","Valor Final", "¿Es rentable?");
            bw.write(primeraLineaString);
            bw.newLine();
            System.out.println(primeraLineaString);
            
            Scanner lector = new Scanner(archivo);
            lector.nextLine();
            
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] datos = linea.split("\t");
                String nombre = datos[0];
                int cantPasajeros = Integer.parseInt(datos[1]);
                String tipoPasaje = datos[2];
                double valorUnitario = Double.parseDouble(datos[3]);
                LocalDate fechaVuelo = LocalDate.parse(datos[4], DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Vuelo vuelo = new Vuelo(nombre, cantPasajeros, tipoPasaje, valorUnitario, fechaVuelo);

                vuelo.calcularValorFinalPorVuelo();
                vuelo.diasDeDiferencia(LocalDate.now());
                vuelo.esRentable();

                bw.write(vuelo.toString());
                bw.newLine();
                
                System.out.println(vuelo);
            }

            lector.close();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no pudo ser encontrado.");
        }
    }
}