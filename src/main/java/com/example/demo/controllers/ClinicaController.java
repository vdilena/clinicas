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

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/clinica")
public class ClinicaController {
	
	@Autowired
	private ClinicaService service;
	
	@ApiOperation(value = "Endpoint de prueba para saber que funciona las API", response = String.class, tags = "Endpoint prueba API")
	@GetMapping("/hello")
	public String hello() {
		return "Funciona el controlador";
	}
	
	@ApiOperation(value = "Endpoint para poder agregar un paciente a la lista de pacientes", response = Paciente.class, tags = "Agregar paciente")
	@PostMapping("/add/paciente")
    public Paciente cargarPaciente(@RequestBody Paciente paciente) {
        return null;
    }
	
	@ApiOperation(value = "Endpoint para poder agregar un medico a la lista de medicos", response = Paciente.class, tags = "Agregar medico")
	@PostMapping("/add/medico")
    public Medico cargarMedico(@RequestBody Medico medico) {
        return null;
    }
	
	@ApiOperation(value = "Endpoint para poder agregar una clinica a la lista de clinicas", response = Paciente.class, tags = "Agregar clinica")
	@PostMapping("/add/clinica")
    public Clinica cargarClinica(@RequestBody Clinica clinica) {
        return null;
    }

	@ApiOperation(value = "Endpoint para poder una lista de pacientes filtrando por medico y por fecha de turno con el medico", response = Paciente.class, tags = "Pacientes por medico y fecha")
	@GetMapping("/get/pacientesPorMedicoYFecha/{medicoId}/{fecha}")
	public List<Paciente> pacientesPorMedicoYFecha(@PathVariable("medicoId") int medicoId, @PathVariable("fecha") Date fecha) {
		return new ArrayList<Paciente>();
	}
	
	@ApiOperation(value = "Endpoint para poder obtener una lista de pacientes que tuvo un medico", response = Paciente.class, tags = "Historial de pacientes de un medico")
	@GetMapping("/get/historialPacientesMedico/{medicoId}")
	public List<Paciente> historialPacientesMedico(@PathVariable("medicoId") int medicoId) {
		return new ArrayList<Paciente>();
	}
	
	@ApiOperation(value = "Endpoint para poder obtener una lista de medicos con los que se atendio un paciente", response = Paciente.class, tags = "Historial de medicos de un paciente")
	@GetMapping("/get/historialAtencionesPaciente/{pacienteId}")
	public List<Medico> historialAtencionesPaciente(@PathVariable("pacienteId") int pacienteId) {
		return new ArrayList<Medico>();
	}
	
	@ApiOperation(value = "Endpoint para poder obtener los medicos que trabajan en un dia de la semana", response = Paciente.class, tags = "Medicos que trabajan un dia especifico de la semana")
	@GetMapping("/get/medicosQueTrabajanDia/{diaSemana}")
	public List<Medico> medicosQueTrabajanDia(@PathVariable("diaSemana") DiaSemanaEnum diaSemana) {
		return new ArrayList<Medico>();
	}
	
	@ApiOperation(value = "Endpoint para poder obtener la cantidad de pacientes que tiene una clinica para una fecha en particular", response = Paciente.class, tags = "Cantidad de pacientes de una clinica por fecha")
	@GetMapping("/get/cantidadPacientesClinicaFecha/{fecha}")
	public int cantidadPacientesClinicaFecha(@PathVariable("fecha") Date fecha) {
		return 0;
	}

	@ApiOperation(value = "Endpoint para poder obtener el promedio de pacientes atendidos por todos los medicos", response = Paciente.class, tags = "Promedio de pacientes de los medico")
	@GetMapping("/get/promedioPacientesAtendidosPorMedico/{medicoId}")
	public double promedioPacientesAtendidosPorMedico(@PathVariable("medicoId") int medicoId) {
		return 0;
	}
	
	@ApiOperation(value = "Endpoint para poder obtener una lista con la cantidad de pacientes por cada una de las 4 categorias", response = List.class, tags = "Cantidad de pacientes por cada una de las categorias")
	@GetMapping("/get/cantidadPacientesPorCategoria")
	public List<Integer> cantidadPacientesPorCategoria() {
		return new ArrayList<Integer>();
	}
	
	@ApiOperation(value = "Endpoint para poder obtener una lista de pacientes que tienen mal formateado el email", response = Paciente.class, tags = "Pacientes con email mal formateado")
	@GetMapping("/get/pacientesConEmailMalFormateado")
	public List<Paciente> pacientesConEmailMalFormateado() {
		return new ArrayList<Paciente>();
	}
	
	@ApiOperation(value = "Endpoint para poder obtener una lista de pacientes en un rango de fechas", response = Paciente.class, tags = "Pacientes por rango de fechas")
	@GetMapping("/get/pacientesEntreFechas")
	public List<Paciente> pacientesEntreFechas(@PathVariable("fechaDesde") Date fechaDesde, @PathVariable("fechaHasta") Date fechaHasta) {
		return new ArrayList<Paciente>();
	}
	
	@ApiOperation(value = "Endpoint para poder obtener los medicos que trabajan los fines de semana y o feriados", response = Paciente.class, tags = "Medicos que trabajan dias no laborables")
	@GetMapping("/get/medicosQueTrabajanDiasNoLaborables")
	public List<Medico> medicosQueTrabajanDiasNoLaborables() {
		return new ArrayList<Medico>();
	}
	
	@ApiOperation(value = "Endpoint para poder obtener los medicos que trabajan en una clinica en particular", response = Paciente.class, tags = "Medicos que trabajan en una clinica")
	@GetMapping("/get/medicosPorClinica/{clinicaId}")
	public List<Medico> medicosQueTrabajanDiasNoLaborables(@PathVariable("clinicaId") int clinicaId) {
		return new ArrayList<Medico>();
	}
	
}
