package com.example.edsoncabrejos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edsoncabrejos.dto.HospedajeDTO;
import com.example.edsoncabrejos.model.Hospedaje;
import com.example.edsoncabrejos.repository.HospedajeRespository;


@Service
public class HospedajeServiceImp implements HospedajeService {
	@Autowired
	private HospedajeRespository repository;
	
	@Override
	public void guardar(HospedajeDTO hospedaje) {
		Hospedaje hos = new Hospedaje();
		hos.setNombre(hospedaje.getNom());
		hos.setIdHospedeje(hospedaje.getCod());
		
		repository.save(hos);
	}

	@Override
	public List<HospedajeDTO> listar() {
		List<HospedajeDTO> listadto = new ArrayList<>();
		HospedajeDTO dto = null;
				
		for (Hospedaje hospedaje : repository.findAll()) {
			dto = new HospedajeDTO();
			dto.setNom(hospedaje.getNombre());
			dto.setCod(hospedaje.getIdHospedeje());
			listadto.add(dto);
		}
		
	
		return listadto;
	}

	

	

}
