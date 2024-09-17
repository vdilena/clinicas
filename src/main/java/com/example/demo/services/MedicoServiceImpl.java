package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Medico;
import com.example.demo.repositories.MedicoRepository;

@Service
public class MedicoServiceImpl implements MedicoService {
	
	@Autowired
	private MedicoRepository medicoRepository;

	@Override
	public List<Medico> obtenerMedicos() {
		return medicoRepository.findAll();
	}


}
