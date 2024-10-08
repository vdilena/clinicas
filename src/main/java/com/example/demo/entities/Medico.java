package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Medico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long medicoId;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="clinicaId", nullable=false)
	@JsonIgnore
	private Clinica clinicaDondeTrabaja;
	private DiaSemanaEnum diaSemanaDisponible;
	private boolean trabajaFinesSemanasYFeriados;
	
	public long getMedicoId() {
		return medicoId;
	}
	public void setMedicoId(long medicoId) {
		this.medicoId = medicoId;
	}
	@OneToMany
	private List<Paciente> pacientes;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Clinica getClinicaDondeTrabaja() {
		return clinicaDondeTrabaja;
	}
	public void setClinicaDondeTrabaja(Clinica clinicaDondeTrabaja) {
		this.clinicaDondeTrabaja = clinicaDondeTrabaja;
	}
	public DiaSemanaEnum getDiaSemanaDisponible() {
		return diaSemanaDisponible;
	}
	public void setDiaSemanaDisponible(DiaSemanaEnum diaSemanaDisponible) {
		this.diaSemanaDisponible = diaSemanaDisponible;
	}
	public boolean isTrabajaFinesSemanasYFeriados() {
		return trabajaFinesSemanasYFeriados;
	}
	public void setTrabajaFinesSemanasYFeriados(boolean trabajaFinesSemanasYFeriados) {
		this.trabajaFinesSemanasYFeriados = trabajaFinesSemanasYFeriados;
	}
	public List<Paciente> getPacientes() {
		return pacientes;
	}
	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

}
