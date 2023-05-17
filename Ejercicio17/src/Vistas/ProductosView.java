package Vistas;

import Util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Util.IconUtil;

public class ProductosView extends JFrame {
	private JTextArea cargosTextArea;
	private JLabel totalGastadoLabel;
	private JLabel fechaVencimientoLabel;
	private JButton salirButton;

	public ProductosView() {
		setTitle("Ventana de Productos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		IconUtil.setWindowIcon(this);

		cargosTextArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(cargosTextArea);
		totalGastadoLabel = new JLabel("Total gastado: $0.00");
		fechaVencimientoLabel = new JLabel("Fecha de vencimiento: XX/XX/XXXX");
		salirButton = new JButton("Salir");

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(Color.lightGray);

		panel.add(scrollPane, BorderLayout.CENTER);

		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new GridLayout(2, 1, 5, 5));
		infoPanel.setBackground(Color.lightGray);
		infoPanel.add(totalGastadoLabel);
		infoPanel.add(fechaVencimientoLabel);

		panel.add(infoPanel, BorderLayout.SOUTH);

		salirButton.setBackground(Color.BLUE);
		salirButton.setForeground(Color.WHITE);
		panel.add(salirButton, BorderLayout.EAST);

		getContentPane().add(panel);

		pack();

		ImageIcon icon = new ImageIcon("../logo.png");
		setIconImage(icon.getImage());
	}

	public void setCargos(List<String> cargos) {
		StringBuilder sb = new StringBuilder();
		for (String cargo : cargos) {
			sb.append(cargo).append("\n");
		}
		cargosTextArea.setText(sb.toString());
	}

	public void setTotalGastado(double totalGastado) {
		totalGastadoLabel.setText("Total gastado: " + String.format("%.2f", totalGastado) + "€");
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String fechaFormateada = dateFormat.format(fechaVencimiento);
		fechaVencimientoLabel.setText("Fecha de vencimiento: " + fechaFormateada);
	}

	public JButton getSalirButton() {
		return salirButton;
	}
}
