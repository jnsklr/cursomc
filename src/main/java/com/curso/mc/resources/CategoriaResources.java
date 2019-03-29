package com.curso.mc.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.mc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

	@GetMapping
	public List<Categoria> listar() {

		Categoria c1 = new Categoria(1, "Info");

		Categoria c2 = new Categoria(2, "Home");

		List<Categoria> lista = new ArrayList<>();

		lista.addAll(Arrays.asList(c1, c2));

		return lista;
	}

}
