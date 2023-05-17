package Modelos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ProductosModel {

	private List<String> cargos;
	private double totalGastado;
	private Date fechaVencimiento;

	public ProductosModel() {
		cargos = new ArrayList<>();
		totalGastado = 0.0;

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 3);
		fechaVencimiento = calendar.getTime();
	}

	public List<String> getCargos() {
		return cargos;
	}

	public void addCargo(String cargo) {
		cargos.add(cargo);
	}

	public double getTotalGastado() {
		return totalGastado;
	}

	public void setTotalGastado(double totalGastado) {
		this.totalGastado = totalGastado;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
}
