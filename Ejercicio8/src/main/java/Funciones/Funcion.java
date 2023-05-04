package Funciones;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import modelo.Usuario;

@Component
public class Funcion 
{
	
	public Usuario crearUsuario() {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Ingrese su nombre: ");
	    String nombre = sc.nextLine();
	    System.out.print("Ingrese su apellido: ");
	    String apellido = sc.nextLine();
	    System.out.print("Ingrese su nombre de usuario: ");
	    String nombreUsuario = sc.nextLine();
	    System.out.print("Ingrese su email: ");
	    String email = sc.nextLine();
	    System.out.print("Ingrese su fecha de nacimiento (dd/mm/yyyy): ");
	    String fechaNacimientoString = sc.nextLine();
	    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	    Calendar fechaNacimiento = Calendar.getInstance();
	    try {
	        fechaNacimiento.setTime(df.parse(fechaNacimientoString));
	    } catch (ParseException e) {
	        System.out.println("Formato de fecha incorrecto, vuelva a intentar");
	        
	        return null;
	    }
		
		return new Usuario(nombre, apellido, fechaNacimiento, nombreUsuario, email);
	}
	
	public void registrarUsuarios(ArrayList<Usuario> usuarios) {
		try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt"));
            for (Usuario usuario : usuarios) {
                writer.write(usuario.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}