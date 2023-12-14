package com.bootcamp.databases.service;

import java.util.List;

import com.bootcamp.databases.model.ConsultaExamen;

public interface ConsultaExamenService {
	
	public void registrar(ConsultaExamen ce) throws Exception;
	
	public void modificar(ConsultaExamen ce) throws Exception;
	
	public ConsultaExamen buscar(String id) throws Exception;
	
	public List<ConsultaExamen> listarTodos() throws Exception;
}
