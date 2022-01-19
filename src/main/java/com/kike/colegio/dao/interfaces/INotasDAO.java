package com.kike.colegio.dao.interfaces;

import java.util.List;

import com.kike.colegio.dtos.NotaDTO;

public interface INotasDAO {

	public List<NotaDTO> obtenerDatosNotasPorIdAlumnoNombreAlumnoNombreAsignaturaNotaYFecha(String idAlumno, String nombreAlumno, String nombreAsignatura, String nota,
			String fecha);

	public List<NotaDTO> obtenerDatosNotasPorIdAlumnoNombreAlumnoNombreAsignaturaYNota(String idAlumno, String nombreAlumno, String nombreAsignatura,
			String nota);

	public List<NotaDTO> obtenerDatosNotasPorNombreAlumnoYNombreAsignatura(String nombreAlumno,
			String nombreAsignatura);

	public List<NotaDTO> obtenerDatosNotasPorNombreAlumnoNombreAsignaturaYFecha(String nombreAlumno,
			String nombreAsignatura, String fecha);

	public Integer insertarNota(String idAlumno, String idAsignaturas, String nota, String fecha);

	public Integer actualizarNota(String idNota, String idAlumno, String idAsignatura, String nota, String fecha);
	
	public Integer borrarNota(String idNota);
}
