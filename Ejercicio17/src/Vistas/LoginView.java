package Vistas;

import java.awt.Color;
import Util.*;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame {
	private JTextField usernameTextField;
	private JPasswordField passwordField;
	private JButton accederButton;

	public LoginView() {
		setTitle("Ventana de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 250);
		setLocationRelativeTo(null);

		IconUtil.setWindowIcon(this);

		usernameTextField = new JTextField();
		passwordField = new JPasswordField();
		accederButton = new JButton("Acceder");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2, 10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(Color.lightGray);

		JLabel usernameLabel = new JLabel("Nombre de usuario:");
		usernameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		panel.add(usernameLabel);

		panel.add(usernameTextField);

		JLabel passwordLabel = new JLabel("Contraseña:");
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		panel.add(passwordLabel);

		panel.add(passwordField);

		panel.add(new JLabel());

		accederButton.setBackground(Color.BLUE);
		accederButton.setForeground(Color.WHITE);
		accederButton.setFont(new Font("Arial", Font.BOLD, 14));
		panel.add(accederButton);

		setContentPane(panel);
		pack();

	}

	public String getUsername() {
		return usernameTextField.getText();
	}

	public String getPassword() {
		return new String(passwordField.getPassword());
	}

	public JButton getAccederButton() {
		return accederButton;
	}
}