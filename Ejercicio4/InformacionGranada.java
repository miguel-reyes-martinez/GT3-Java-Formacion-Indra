import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.net.URL;

public class InformacionGranada {
	private JFrame frame;
	private JPanel panel;
	private JLabel imagenJLabel;
	private JLabel bienvenidaJLabel;
	private JLabel habitantesJLabel;
	private JLabel climaJLabel;
	private JLabel economiaJLabel;
	private JButton mostrarOcultarButton;

	public InformacionGranada() {
		frame = new JFrame("Información de Granada");
		frame.setSize(1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(new BorderLayout());

		imagenJLabel = new JLabel();
		imagenJLabel.setHorizontalAlignment(SwingConstants.CENTER);

		try {
			ImageIcon image = new ImageIcon(new URL(
					"https://multimedia.andalucia.org/media/0B97BD505CE24B07830CE6C43B03E173/img/929BE4B0C9AE4901918F8D5B309BC441/15-18_Alhabram_des_del_mirador_de_San_Nicolas_Granada.jpg"));
			Image scaledImage = image.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
			ImageIcon imageIcon = new ImageIcon(scaledImage);
			imagenJLabel.setIcon(imageIcon);
			imagenJLabel.setVisible(false);
		} catch (IOException e) {
			e.printStackTrace();
		}

		panel.add(imagenJLabel, BorderLayout.WEST);

		JPanel infoPanel = new JPanel(new GridLayout(4, 2));

		bienvenidaJLabel = new JLabel("¡Bienvenido a Granada!");
		bienvenidaJLabel.setFont(new Font("Helvetica", Font.PLAIN, 24));
		bienvenidaJLabel.setForeground(Color.DARK_GRAY);
		infoPanel.add(bienvenidaJLabel);

		habitantesJLabel = new JLabel("Población: 232.208 habitantes");
		habitantesJLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
		habitantesJLabel.setForeground(Color.DARK_GRAY);
		infoPanel.add(habitantesJLabel);

		climaJLabel = new JLabel("Clima habitual: Mediterráneo");
		climaJLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
		climaJLabel.setForeground(Color.DARK_GRAY);
		infoPanel.add(climaJLabel);

		economiaJLabel = new JLabel("Actividad económica: Turismo y agricultura");
		economiaJLabel.setFont(new Font("Helvetica", Font.PLAIN, 20));
		economiaJLabel.setForeground(Color.DARK_GRAY);
		infoPanel.add(economiaJLabel);

		panel.add(infoPanel, BorderLayout.EAST);

		mostrarOcultarButton = new JButton("Mostrar información");
		mostrarOcultarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarOcultarInformacion();
			}
		});
		panel.add(mostrarOcultarButton, BorderLayout.SOUTH);

		// Ocultar la información cuando se inicia la app
		bienvenidaJLabel.setVisible(false);
		habitantesJLabel.setVisible(false);
		climaJLabel.setVisible(false);
		economiaJLabel.setVisible(false);

		frame.add(panel);
		frame.setVisible(true);
	}
	
	// Mostrar u ocultar información al pulsar el botón
	private void mostrarOcultarInformacion() {
		
		if (imagenJLabel.isVisible() == false) {	// Mostrar información
			imagenJLabel.setVisible(true);
			bienvenidaJLabel.setVisible(true);
			habitantesJLabel.setVisible(true);
			climaJLabel.setVisible(true);
			economiaJLabel.setVisible(true);
			mostrarOcultarButton.setText("Ocultar información");
		} else { 	// Ocultar información
			
			imagenJLabel.setVisible(false);
			bienvenidaJLabel.setVisible(false);
			habitantesJLabel.setVisible(false);
			climaJLabel.setVisible(false);
			economiaJLabel.setVisible(false);
			mostrarOcultarButton.setText("Mostrar información");
		}
	}

	public static void main(String[] args) {
		InformacionGranada app = new InformacionGranada();
	}
}
