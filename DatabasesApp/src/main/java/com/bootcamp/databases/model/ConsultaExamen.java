package com.bootcamp.databases.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Document(collection = "consultaExamen")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConsultaExamen {
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private int idExamen;
	@Id
	@EqualsAndHashCode.Include //indicamos que vamos a comparar por este campo
	private String id;
	
	@Field
	private int idExamen;
	
	//@Column(name = "idConsulta", nullable = false, length = 200)
	@Field
	private int idConsulta;
	
}
