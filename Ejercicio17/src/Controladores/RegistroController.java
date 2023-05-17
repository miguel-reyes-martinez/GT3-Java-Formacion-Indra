package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vistas.RegistroView;

public class RegistroController {
	private RegistroView registroView;
	private PrincipalController principalController;

	public RegistroController(RegistroView registroView, PrincipalController principalController) {
		this.registroView = registroView;
		this.principalController = principalController;

		this.registroView.getRegistrarseButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Te has registrado con éxito");

				principalController.mostrarVentanaProductos(false);
				registroView.setVisible(false);
			}
		});
	}
}
