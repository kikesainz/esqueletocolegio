package com.kike.colegio.servicios.interfaces;

import java.util.List;

import com.kike.colegio.dtos.AlumnoDTO;

public interface IAlumnosService {

	public List<AlumnoDTO> obtenerAlumnos();

	public List<AlumnoDTO> obtenerAlumnosporIdNombreApellidoFamiliaActivo(String id, String nombre, String apellido,
			String familia, String activo);

	public Integer insertarAlumno(String id, String nombre, String apellido, String idMunicipio, String familiaNumerosa,
			String activo);
	
	public Integer actualizarAlumno(String id, String nombre, String apellido, String idMunicipio,
			String familiaNumerosa, String activo);
	
	public Integer borrarAlumno(String id);
}
