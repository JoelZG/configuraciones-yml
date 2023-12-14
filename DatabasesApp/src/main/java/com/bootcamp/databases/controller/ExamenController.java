package com.bootcamp.databases.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.databases.model.Examen;
import com.bootcamp.databases.service.ExamenService;

@RestController
@RequestMapping("/examenes")
public class ExamenController {
	
	private static final Logger logger = Logger.getLogger(ExamenController.class);
	
	@Autowired
	private ExamenService service;
	
	@PostMapping("/nuevo")
	public ResponseEntity<Examen> registrar(@RequestBody Examen ex) {
		logger.info("Registrar nuevo examen");
		try {
			service.registrar(ex);
			return ResponseEntity.ok(ex);
		} catch (Exception e) {
			logger.error("No se pudo registrar el examen");
			logger.debug(e);
			return ResponseEntity.badRequest().body(ex);
		}
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Examen> actualizar(@RequestBody Examen ex) throws Exception {
		service.registrar(ex);
		return ResponseEntity.ok(ex);
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<Examen> buscar(@RequestParam("id") int id) throws Exception {
		return ResponseEntity.ok(service.buscar(id));
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<Examen>> listar() throws Exception {
		return ResponseEntity.ok(service.listarTodos());
	}

}
