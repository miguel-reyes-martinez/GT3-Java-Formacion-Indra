package pildoras.aop;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Component // Le indica que es un Componente a Java
			// El cual es el que se va a usar
			// Como funcionalidad a implementar.
public class ClienteDAO {
	public void leer() {

		Set<Persona> personas = new HashSet<Persona>();

		try {
			FileReader fr = new FileReader("FICHERO_AOP.txt");
			BufferedReader br = new BufferedReader(fr);

			Persona personaActual = null;

			String linea;
			int contadorLineas = 0;

			while ((linea = br.readLine()) != null) {
				switch (contadorLineas % 3) {
				case 0:
					personaActual = new Persona();
					personaActual.setNombre(linea.split(":")[1].trim());
					break;
				case 1:
					personaActual.setApellido(linea.split(":")[1].trim());
					break;
				case 2:
					personaActual.setEdad(Integer.parseInt(linea.split(":")[1].trim()));
					personas.add(personaActual);
					break;
				}
				contadorLineas++;
			}
			br.close();
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		}

		System.out.println("Información de las personas:");
		for (Persona persona : personas) {
			System.out.println(persona.getNombre() + " " + persona.getApellido() + ", " + persona.getEdad() + " años");
		}
	}

}
