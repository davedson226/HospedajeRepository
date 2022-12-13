package com.example.edsoncabrejos.service;

import java.util.List;

import com.example.edsoncabrejos.dto.HospedajeDTO;


public interface HospedajeService {
	void guardar(HospedajeDTO hospedaje);
    List<HospedajeDTO> listar();
    
}
