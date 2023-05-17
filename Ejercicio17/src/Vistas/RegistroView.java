package Vistas;

import java.awt.Color;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import Util.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistroView extends JFrame {
	private JTextField nombreTextField;
	private JTextField apellidoTextField;
	private JTextField ciudadTextField;
	private JTextField emailTextField;
	private JTextField salarioTextField;
	private JFormattedTextField fechaNacimientoTextField;
	private JButton registrarseButton;

	public RegistroView() {
		setTitle("Ventana de Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		IconUtil.setWindowIcon(this);

		nombreTextField = new JTextField();
		apellidoTextField = new JTextField();
		ciudadTextField = new JTextField();
		emailTextField = new JTextField();
		salarioTextField = new JTextField();
		fechaNacimientoTextField = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));
		registrarseButton = new JButton("Registrarse");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(7, 2, 10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(Color.lightGray);

		JLabel nombreLabel = new JLabel("Nombre:");
		panel.add(nombreLabel);
		panel.add(nombreTextField);

		JLabel apellidoLabel = new JLabel("Apellido:");
		panel.add(apellidoLabel);
		panel.add(apellidoTextField);

		JLabel ciudadLabel = new JLabel("Ciudad:");
		panel.add(ciudadLabel);
		panel.add(ciudadTextField);

		JLabel emailLabel = new JLabel("Email:");
		panel.add(emailLabel);
		panel.add(emailTextField);

		JLabel salarioLabel = new JLabel("Salario:");
		panel.add(salarioLabel);
		panel.add(salarioTextField);

		JLabel fechaNacimientoLabel = new JLabel("Fecha de nacimiento (dd/MM/yyyy):");
		panel.add(fechaNacimientoLabel);
		panel.add(fechaNacimientoTextField);

		panel.add(new JLabel());

		registrarseButton.setBackground(Color.BLUE);
		registrarseButton.setForeground(Color.WHITE);
		panel.add(registrarseButton);

		setContentPane(panel);
		pack();

		ImageIcon icon = new ImageIcon("../logo.png");
		setIconImage(icon.getImage());
	}

	public String getNombre() {
		return nombreTextField.getText();
	}

	public String getApellido() {
		return apellidoTextField.getText();
	}

	public String getCiudad() {
		return ciudadTextField.getText();
	}

	public String getEmail() {
		return emailTextField.getText();
	}

	public String getSalario() {
		return salarioTextField.getText();
	}

	public String getFechaNacimiento() {
		return fechaNacimientoTextField.getText();
	}

	public JButton getRegistrarseButton() {
		return registrarseButton;
	}
}