package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import Modelos.ProductosModel;
import Vistas.ProductosView;

public class ProductosController {
	private ProductosView productosView;
	private ProductosModel productosModel;

	public ProductosController(ProductosView productosView, ProductosModel productosModel) {
		this.productosView = productosView;
		this.productosModel = productosModel;

		productosView.setCargos(productosModel.getCargos());
		productosView.setTotalGastado(productosModel.getTotalGastado());
		productosView.setFechaVencimiento(productosModel.getFechaVencimiento());
		productosView.getSalirButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public void generarCargosAleatorios() {
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			double cargo = random.nextDouble() * 100;
			productosModel.addCargo("Cargo: " + String.format("%.2f", cargo) + "€");
			productosModel.setTotalGastado(productosModel.getTotalGastado() + cargo);
		}
		productosView.setCargos(productosModel.getCargos());
		productosView.setTotalGastado(productosModel.getTotalGastado());
	}
}
