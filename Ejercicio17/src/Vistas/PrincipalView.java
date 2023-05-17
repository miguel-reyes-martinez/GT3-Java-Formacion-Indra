package Vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Util.IconUtil;

public class PrincipalView extends JFrame {
	private JButton loginButton;
	private JButton registroButton;

	public PrincipalView() {
		setTitle("HomeBanking Santander");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);

		IconUtil.setWindowIcon(this);

		JLabel label = new JLabel("Bienvenid@ a nuestra aplicación de Homebanking");
		JLabel label2 = new JLabel("Si ya eres usuario, por favor loguéate, sino, regístrate");
		loginButton = new JButton("Iniciar sesión");
		registroButton = new JButton("Registro");

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1, 10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(Color.lightGray);

		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 18));
		label.setForeground(Color.BLUE);

		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Arial", Font.PLAIN, 14));

		loginButton.setBackground(Color.GREEN);
		loginButton.setForeground(Color.WHITE);
		loginButton.setFont(new Font("Arial", Font.BOLD, 14));

		registroButton.setBackground(Color.ORANGE);
		registroButton.setForeground(Color.WHITE);
		registroButton.setFont(new Font("Arial", Font.BOLD, 14));

		panel.add(label);
		panel.add(label2);
		panel.add(loginButton);
		panel.add(registroButton);

		setContentPane(panel);

	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public JButton getRegistroButton() {
		return registroButton;
	}
}