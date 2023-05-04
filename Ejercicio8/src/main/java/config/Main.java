package config;

import java.util.ArrayList;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Funciones.Funcion;
import modelo.Usuario;

public class Main {

	

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
		Funcion funcion = context.getBean(Funcion.class);
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		for (int i = 0; i < 3; i++) {
			usuarios.add(funcion.crearUsuario());
		}
		
		funcion.registrarUsuarios(usuarios);
		
		context.close();
	}
}
