package com.bolsadeideas.springboot.web.app.model;

import java.util.List;

public class Lugar {
	private String nombre;
	private int cantidadHabitantes;
	private String clima;
	private List<String> lugaresConocer;
	private List<String> imagenes;

	public Lugar() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadHabitantes() {
		return cantidadHabitantes;
	}

	public void setCantidadHabitantes(int cantidadHabitantes) {
		this.cantidadHabitantes = cantidadHabitantes;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public List<String> getLugaresConocer() {
		return lugaresConocer;
	}

	public void setLugaresConocer(List<String> lugaresConocer) {
		this.lugaresConocer = lugaresConocer;
	}

	public List<String> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<String> imagenes) {
		this.imagenes = imagenes;
	}

}
