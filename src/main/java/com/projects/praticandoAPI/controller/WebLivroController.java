package com.projects.praticandoAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/webLivro")
public class WebLivroController {

	
	@GetMapping
	public String getFormulario() {
		return "webLivro/home";
	}
}
