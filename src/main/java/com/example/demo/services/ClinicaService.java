package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Clinica;

public interface ClinicaService {
	
	List<Clinica> obtenerClinicas();

	Clinica guardar(Clinica nuevaClinica);
	
	Optional<Clinica> buscarPorId(Long clinicaId);

	void quitar(Long clinicaId);

}
