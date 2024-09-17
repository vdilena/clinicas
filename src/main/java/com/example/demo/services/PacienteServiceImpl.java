package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Paciente;
import com.example.demo.repositories.PacienteRepository;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;

	@Override
	public List<Paciente> obtenePacientes() {
		return pacienteRepository.findAll();
	}


}
