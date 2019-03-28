package com.curso.mc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@GetMapping
	public String listar() {
		return "REST está funcioanndo";
	}

}
