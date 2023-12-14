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

import com.bootcamp.databases.model.DetalleConsulta;
import com.bootcamp.databases.service.DetalleService;

@RestController
@RequestMapping("/detalleConsulta")
public class DetalleController {
	
	private static final Logger logger = Logger.getLogger(DetalleController.class);
	
	@Autowired
	private DetalleService service;
	
	@PostMapping("/nuevo")
	public ResponseEntity<DetalleConsulta> registrar(@RequestBody DetalleConsulta dc) {
		logger.info("Registrar nuevo detalle consulta");
		try {
			service.registrar(dc);
			return ResponseEntity.ok(dc);
		} catch (Exception e) {
			logger.error("No se pudo registrar el detalle consulta");
			logger.debug(e);
			return ResponseEntity.badRequest().body(dc);
		}
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<DetalleConsulta> actualizar(@RequestBody DetalleConsulta dc) throws Exception {
		service.registrar(dc);
		return ResponseEntity.ok(dc);
	}
	
	@GetMapping("/buscar")
	public ResponseEntity<DetalleConsulta> buscar(@RequestParam("id") String id) throws Exception {
		return ResponseEntity.ok(service.buscar(id));
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<DetalleConsulta>> listar() throws Exception {
		return ResponseEntity.ok(service.listarTodos());
	}

}
