package com.example.edsoncabrejos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="hospedajes")
public class Hospedaje {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospedeje;
	private String nombre;

}
