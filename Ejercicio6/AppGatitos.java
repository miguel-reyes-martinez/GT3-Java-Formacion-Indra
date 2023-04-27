package com.example.demo;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.URL;
import java.net.HttpURLConnection;

public class AppGatitos implements ActionListener {
	private static final String API_URL = "https://api.thecatapi.com/v1/images/search";

	private JLabel imagenJLabel;

	public static void main(String[] args) {
		AppGatitos app = new AppGatitos();
		app.iniciar();
	}

	public void actionPerformed(ActionEvent e) {
		try {

			String imagenURL = getImagenURL();
			ImageIcon icono = new ImageIcon(new URL(imagenURL));

			Image iconoArreglado = icono.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH);
			icono = new ImageIcon(iconoArreglado);

			imagenJLabel.setIcon(icono);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void iniciar() {
        // Ventana
        JFrame ventana = new JFrame("Gatitos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 600);

        // Imagen
        JPanel imagenPanel = new JPanel();
        imagenPanel.setLayout(new BorderLayout());
        ventana.getContentPane().add(imagenPanel, BorderLayout.CENTER);

        imagenJLabel = new JLabel();
        imagenPanel.add(imagenJLabel, BorderLayout.CENTER);

        // Boton
        JButton actualizarButton = new JButton("Actualizar");
        actualizarButton.addActionListener(this);
        ventana.getContentPane().add(actualizarButton, BorderLayout.SOUTH);

        // Mostrar la ventana
        ventana.setVisible(true);
    }

	private String getImagenURL() throws IOException {

		URL url = new URL(API_URL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Accept", "application/json");
		con.connect();

		BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

		StringBuilder respuesta = new StringBuilder();
		String output;
		while ((output = br.readLine()) != null) {
			respuesta.append(output);
		}

		// Analizar la respuesta JSON
		JSONArray jsonArray = new JSONArray(respuesta.toString());
		JSONObject jsonObject = jsonArray.getJSONObject(0);
		String imagenURL = jsonObject.getString("url");

		return imagenURL;
	}
}