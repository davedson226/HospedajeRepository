package com.example.edsoncabrejos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edsoncabrejos.model.Hospedaje;

@Repository
public interface HospedajeRespository  extends JpaRepository<Hospedaje, Integer>{

}
