package com.bootcamp.databases.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.databases.model.DetalleConsulta;
import com.bootcamp.databases.repository.DetalleRepository;
import com.bootcamp.databases.service.DetalleService;

@Service
public class DetalleServiceImpl implements DetalleService{

	@Autowired
	private DetalleRepository repo;
	
	@Override
	public void registrar(DetalleConsulta dc) throws Exception {
		repo.save(dc);
	}

	@Override
	public void modificar(DetalleConsulta dc) throws Exception {
		repo.save(dc);
	}

	@Override
	public DetalleConsulta buscar(String id) throws Exception {
		Optional<DetalleConsulta> op = repo.findById(id);
		return op.isPresent() ? op.get() : new DetalleConsulta();
	}

	@Override
	public List<DetalleConsulta> listarTodos() throws Exception {
		return repo.findAll();
	}

}
