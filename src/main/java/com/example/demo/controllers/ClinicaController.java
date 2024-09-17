package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Clinica;
import com.example.demo.entities.DiaSemanaEnum;
import com.example.demo.entities.Medico;
import com.example.demo.entities.Paciente;
import com.example.demo.services.ClinicaService;
import com.example.demo.services.MedicoService;
import com.example.demo.services.PacienteService;

@RestController
public class ClinicaController {
	
	@Autowired
	private ClinicaService clinicaService;
	
	@Autowired
	private MedicoService medicoService;
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Funciona el controlador";
	}
	
	/**
	 * Endpoints para clinicas
	 */
	@GetMapping("/clinica")
	public List<Clinica> todasLasClinicas() {
		return clinicaService.obtenerClinicas();
	}
	
	@PostMapping("/clinica")
	Clinica nuevaClinica(@RequestBody Clinica nuevaClinica) {
		return clinicaService.guardar(nuevaClinica);
	}
	
	@PutMapping("/clinica/{clinicaId}")
	Clinica actualizarClinica(@RequestBody Clinica clinicaActualizable, @PathVariable Long clinicaId) {
		
		return clinicaService.buscarPorId(clinicaId)
			      .map(clinica -> {
			    	clinica.setNombre(clinicaActualizable.getNombre());
			    	clinica.setDireccion(clinicaActualizable.getDireccion());
			    	clinica.setTelefono(clinicaActualizable.getTelefono());
			        return clinicaService.guardar(clinica);
			      })
			      .orElseGet(() -> {
			        return clinicaService.guardar(clinicaActualizable);
			      });
	}
	
	@DeleteMapping("/clinica/{clinicaId}")
	void quitarClinica(@PathVariable Long clinicaId) {
		clinicaService.quitar(clinicaId);
	}
	
	@GetMapping("/medico")
	public List<Medico> todasLosMedicos() {
		return medicoService.obtenerMedicos();
	}
	
	@GetMapping("/paciente")
	public List<Paciente> todasLosPacientes() {
		return pacienteService.obtenePacientes();
	}
	
	
	@PostMapping("/add/paciente")
    public Paciente cargarPaciente(@RequestBody Paciente paciente) {
        return null;
    }
	
	@PostMapping("/add/medico")
    public Medico cargarMedico(@RequestBody Medico medico) {
        return null;
    }
	
	@PostMapping("/add/clinica")
    public Clinica cargarClinica(@RequestBody Clinica clinica) {
        return null;
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
	
	@GetMapping("/get/cantidadPacientesPorCategoria")
	public List<Integer> cantidadPacientesPorCategoria() {
		return new ArrayList<Integer>();
	}
	
	@GetMapping("/get/pacientesConEmailMalFormateado")
	public List<Paciente> pacientesConEmailMalFormateado() {
		return new ArrayList<Paciente>();
	}
	
	@GetMapping("/get/pacientesEntreFechas")
	public List<Paciente> pacientesEntreFechas(@PathVariable("fechaDesde") Date fechaDesde, @PathVariable("fechaHasta") Date fechaHasta) {
		return new ArrayList<Paciente>();
	}
	
	@GetMapping("/get/medicosQueTrabajanDiasNoLaborables")
	public List<Medico> medicosQueTrabajanDiasNoLaborables() {
		return new ArrayList<Medico>();
	}
	
	@GetMapping("/get/medicosPorClinica/{clinicaId}")
	public List<Medico> medicosQueTrabajanDiasNoLaborables(@PathVariable("clinicaId") int clinicaId) {
		return new ArrayList<Medico>();
	}
	
}
