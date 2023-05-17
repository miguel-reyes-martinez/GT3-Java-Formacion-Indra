package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vistas.LoginView;

public class LoginController {
	private LoginView loginView;
	private PrincipalController principalController;

	public LoginController(LoginView loginView, PrincipalController principalController) {
		this.loginView = loginView;
		this.principalController = principalController;

		this.loginView.getAccederButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				principalController.mostrarVentanaProductos(true);
				loginView.setVisible(false);
			}
		});
	}
}
