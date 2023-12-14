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

@Document(collection = "detalleConsulta")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetalleConsulta {
	
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private int idDetalle;
	
	@Id
	@EqualsAndHashCode.Include //indicamos que vamos a comparar por este campo
	private String id;
	
	//@Column(name = "diagnostico", nullable = false, length = 200)
	@Field
	private String diagnostico;
	//@Column(name = "tratamiento", nullable = false, length = 250)
	@Field
	private String tratamiento;
	//@Column(name = "consulta", nullable = false)
	@Field
	private int idConsulta;

}
