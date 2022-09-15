package com.example.demo.services;

import com.example.demo.entities.Clinica;
import com.example.demo.entities.Medico;
import com.example.demo.entities.Paciente;

public interface ClinicaService {

	Paciente guardarPaciente(Paciente paciente);

	Medico guardarMedico(Medico medico);

	Clinica guardarClinica(Clinica clinica);

}
