package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Clinica;
import com.example.demo.entities.DiaSemanaEnum;
import com.example.demo.entities.Medico;
import com.example.demo.entities.Paciente;
import com.example.demo.services.ClinicaService;

@RestController
@RequestMapping("/clinica")
public class Controller {
	
	@Autowired
	private ClinicaService service;
	
	@GetMapping("/hello")
	public String hello() {
		return "Funciona el controlador";
	}
	
	@PostMapping("/add/paciente")
    public Paciente cargarPaciente(@RequestBody Paciente paciente) {
        return service.guardarPaciente(paciente);
    }
	
	@PostMapping("/add/medico")
    public Medico cargarMedico(@RequestBody Medico medico) {
        return service.guardarMedico(medico);
    }
	
	@PostMapping("/add/clinica")
    public Clinica cargarClinica(@RequestBody Clinica clinica) {
        return service.guardarClinica(clinica);
    }

	@GetMapping("/get/pacientesPorMedicoYFecha/{medicoId}/{fecha}")
	public List<Paciente> pacientesPorMedicoYFecha(@PathVariable("medicoId") int medicoId, @PathVariable("fecha") Date fecha) {
		return new ArrayList<Paciente>();
	}
	
	@GetMapping("/get/historialPacientesMedico/{medicoId}")
	public List<Paciente> historialPacientesMedico(@PathVariable("medicoId") int medicoId) {
		return new ArrayList<Paciente>();
	}
	
	@GetMapping("/get/historialAtencionesPaciente/{pacienteId}")
	public List<Medico> historialAtencionesPaciente(@PathVariable("pacienteId") int pacienteId) {
		return new ArrayList<Medico>();
	}
	
	@GetMapping("/get/medicosQueTrabajanDia/{diaSemana}")
	public List<Medico> medicosQueTrabajanDia(@PathVariable("diaSemana") DiaSemanaEnum diaSemana) {
		return new ArrayList<Medico>();
	}
	
	@GetMapping("/get/cantidadPacientesClinicaFecha/{fecha}")
	public int cantidadPacientesClinicaFecha(@PathVariable("fecha") Date fecha) {
		return 0;
	}

	@GetMapping("/get/promedioPacientesAtendidosPorMedico/{medicoId}")
	public double promedioPacientesAtendidosPorMedico(@PathVariable("medicoId") int medicoId) {
		return 0;
	}
}
