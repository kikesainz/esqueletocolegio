package com.kike.colegio.dao.interfaces;

import java.util.List;

import com.kike.colegio.dtos.AlumnoDTO;

public interface IAlumnosDAO {
	public List<AlumnoDTO> obtenerTodosAlumnos();

	public List<AlumnoDTO> obtenerAlumnosporIdNombreApellidoFamiliaActivo(String id, String nombre, String apellido,
			String familia, String activo);

	public Integer insertarAlumno(String id, String nombre, String apellido, String idMunicipio, String familiaNumersoa,
			String activo);
	
	public Integer actualizarAlumno(String id, String nombre, String apellido, String idMunicipio,
			String familiaNumerosa, String activo);
	
	public Integer borrarAlumno(String id);
}