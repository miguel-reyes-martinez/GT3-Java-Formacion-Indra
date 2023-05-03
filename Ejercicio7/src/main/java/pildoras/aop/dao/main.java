package pildoras.aop.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pildoras.aop.ClienteDAO;
import pildoras.aop.Configuracion;

public class main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);

		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);

		elCliente.leer();
		contexto.close();
	}
}
