package com.bootcamp.databases.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.databases.model.Consulta;
import com.bootcamp.databases.repository.ConsultaRepository;
import com.bootcamp.databases.service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService{

	@Autowired
	private ConsultaRepository repo;
	
	@Override
	public void registrar(Consulta c) throws Exception {
		repo.save(c);
	}

	@Override
	public void modificar(Consulta c) throws Exception {
		repo.save(c);
	}

	@Override
	public Consulta buscar(int id) throws Exception {
		Optional<Consulta> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Consulta();
	}

	@Override
	public List<Consulta> listarTodos() throws Exception {
		return repo.findAll();
	}

}
