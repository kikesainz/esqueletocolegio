package com.kike.colegio.servicios.interfaces;

import java.util.List;

import com.kike.colegio.dtos.MatriculacionDTO;

public interface IMatriculacionService {

	public List<MatriculacionDTO> obtenerMatriculacionesPoridAsigaturaNombreAsignaturaIdAlumnoNombreAlumnoFechaYActivo(
			String idAsignatura, String nombreAsignatura, String idAlumno, String nombreAlumno, String fecha,
			String activo);
	
	public List<MatriculacionDTO> obtenerMatriculacionesPoridAsigaturaNombreAsignaturaIdAlumnoNombreAlumnoYActivo(
			String idAsignatura, String nombreAsignatura, String idAlumno, String nombreAlumno, String activo);
	
	public Integer insertarMatriculacion(String idAsignatura, String idAlumno, String fecha, String importe);
	
	public Integer borrarMatriculacion(String idMatriculacion);
	
	public Integer obtenerNumeroMatriculacionesAlumno(String idAlumno);
	
	public Integer obtenerFamiliaNumerosaAlumno(String idAlumno);
	
	public Double obtenerTasaAsignatura(String idAsignatura);
	
	public Double calcularTasa(String idAlumno,String idAsignatura);
}
