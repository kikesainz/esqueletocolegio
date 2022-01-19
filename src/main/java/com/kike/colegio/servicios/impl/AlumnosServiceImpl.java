package com.kike.colegio.servicios.impl;

import java.util.List;

//import com.kike.colegio.dao.impl.AlumnosDAOImpl;
import com.kike.colegio.dao.interfaces.IAlumnosDAO;
import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.servicios.interfaces.IAlumnosService;

public class AlumnosServiceImpl implements IAlumnosService{
	
	@Override
	public List<AlumnoDTO> obtenerAlumnos() {
//		return new AlumnosDAOImpl().obtenerTodosAlumnos();
		return null;
	}

	@Override
	public List<AlumnoDTO> obtenerAlumnosporIdNombreApellidoFamiliaActivo(String id, String nombre, String apellido, String familia, String activo) {
//		return new AlumnosDAOImpl().obtenerAlumnosporIdNombreApellidoFamiliaActivo(id, nombre, apellido, familia, activo);
		return null;
	}

	@Override
	public Integer insertarAlumno(String id, String nombre, String apellido, String idMunicipio, String familiaNumerosa, String activo) {
//		return new AlumnosDAOImpl().insertarAlumno(id, nombre, apellido, idMunicipio, familiaNumerosa, activo);
		return null;
	}

	@Override
	public Integer actualizarAlumno(String id, String nombre, String apellido, String idMunicipio,
			String familiaNumerosa, String activo) {
//		return new AlumnosDAOImpl().actualizarAlumno(id, nombre, apellido, idMunicipio, familiaNumerosa, activo);
		return null;
	}

	@Override
	public Integer borrarAlumno(String id) {
//		return new AlumnosDAOImpl().borrarAlumno(id);
		return null;
	}	
}
