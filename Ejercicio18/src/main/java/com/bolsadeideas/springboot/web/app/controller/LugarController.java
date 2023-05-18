package com.bolsadeideas.springboot.web.app.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.web.app.model.Lugar;

@Controller
public class LugarController {
	@GetMapping("/granada")
	public String mostrarGranada(Model model) {
		Lugar granada = new Lugar();
		granada.setNombre("Granada");
		granada.setCantidadHabitantes(232208);
		granada.setClima(
				"La ciudad de Granada se encuentra en una latitud de más de 700 metros enclavada entre las sierras de Sierra Nevada. Por su ubicación, el clima de Granada es un clima mixto de tipo mediterráneo y continental, con influencias atlánticas. Este tipo de clima se traduce en veranos calurosos y muy secos, primaveras y otoños templados con poca lluvia, e inviernos fríos con lluvias nunca demasiado abundantes.\n");
		granada.setLugaresConocer(Arrays.asList("La Alhambra de Granada", "Palacio de Carlos V", "Mirador de San Nicolás", "Catedral de Granada", "Paseo de los Tristes", "Parque de las Ciencias"));
		granada.setImagenes(Arrays.asList("1.jpg", "2.jpg", "3.jpg", "4.jpg"));

		model.addAttribute("granada", granada);
		return "granada";
	}
}