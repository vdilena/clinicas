package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Clinica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long clinicaId;
	private String nombre;
	private String direccion;
	private String telefono;
	
	@OneToMany(mappedBy="clinicaDondeTrabaja")
	private List<Medico> medicos = new ArrayList<>();
	
	public long getClinicaId() {
		return clinicaId;
	}
	public void setClinicaId(long clinicaId) {
		this.clinicaId = clinicaId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Medico> getMedicos() {
		return medicos;
	}
	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}
}
