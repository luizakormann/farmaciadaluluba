package com.generation.farmaciadaluluba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmaciadaluluba.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "", allowedHeaders = "")


public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

}
