package com.bolsadeideas.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.web.app.model.Receta;

@Controller
public class AppController {

	@GetMapping("/")
	public String mostrarInicio() {
		return "index";
	}

	@GetMapping("/recetas")
	public String mostrarRecetas(Model model) {
		model.addAttribute("recetas", obtenerRecetas());

		return "recetas";
	}

	@GetMapping("/sobre-nosotros")
	public String mostrarSobreNosotros() {
		return "sobre-nosotros";
	}

	@GetMapping("/contactenos")
	public String mostrarContactenos() {
		return "contacto";
	}

	private List<Receta> obtenerRecetas() {
		List<Receta> recetas = new ArrayList<>();

		Receta receta1 = new Receta();
		receta1.setNombre("Tarta de chocolate");
		receta1.setDescripcion("Una deliciosa tarta de chocolate");
		receta1.setImagenUrl("https://badun.nestle.es/imgserver/v1/80/1290x742/6641251d07e6-tarta-de-chocolate.jpg");
		recetas.add(receta1);

		Receta receta2 = new Receta();
		receta2.setNombre("Ensalada César");
		receta2.setDescripcion("Una refrescante ensalada César");
		receta2.setImagenUrl("https://www.recetassinlactosa.com/wp-content/uploads/2022/02/Ensalada-Cesar.jpg");
		recetas.add(receta2);

		return recetas;
	}
}
