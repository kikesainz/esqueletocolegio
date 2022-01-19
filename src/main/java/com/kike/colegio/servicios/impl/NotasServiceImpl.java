package com.kike.colegio.servicios.impl;

import java.util.List;

//import com.kike.colegio.dao.impl.NotasDAOImpl;
import com.kike.colegio.dtos.NotaDTO;
import com.kike.colegio.servicios.interfaces.INotasService;

public class NotasServiceImpl implements INotasService {

	@Override
	public List<NotaDTO> obtenerDatosNotasPorIdAlumnoNombreAlumnoNombreAsignaturaNotaYFecha(String idAlumno, String nombreAlumno, String nombreAsignatura, String nota,
			String fecha) {
//		return new NotasDAOImpl().obtenerDatosNotasPorIdAlumnoNombreAlumnoNombreAsignaturaNotaYFecha(idAlumno, nombreAlumno, nombreAsignatura, nota, fecha);
		return null;
	}

	@Override
	public List<NotaDTO> obtenerDatosNotasPorIdAlumnoNombreAlumnoNombreAsignaturaYNota(String idAlumno, String nombreAlumno, String nombreAsignatura,
			String nota) {
//		return new NotasDAOImpl().obtenerDatosNotasPorIdAlumnoNombreAlumnoNombreAsignaturaYNota(idAlumno, nombreAlumno, nombreAsignatura, nota);
		return null;
	}

	@Override
	public Integer insertarNota(String idAlumno, String idAsignaturas, String nota, String fecha) {
//		return new NotasDAOImpl().insertarNota(idAlumno, idAsignaturas, nota, fecha);
		return null;
	}

	@Override
	public List<NotaDTO> obtenerDatosNotasPorNombreAlumnoYNombreAsignatura(String nombreAlumno,
			String nombreAsignatura) {
//		return new NotasDAOImpl().obtenerDatosNotasPorNombreAlumnoYNombreAsignatura(nombreAlumno, nombreAsignatura);
		return null;
	}

	@Override
	public List<NotaDTO> obtenerDatosNotasPorNombreAlumnoNombreAsignaturaYFecha(String nombreAlumno,
			String nombreAsignatura, String fecha) {
//		return new NotasDAOImpl().obtenerDatosNotasPorNombreAlumnoNombreAsignaturaYFecha(nombreAlumno, nombreAsignatura, fecha);
		return null;
	}

	@Override
	public Integer actualizarNota(String idNota, String idAlumno, String idAsignatura, String nota, String fecha) {
//		return new NotasDAOImpl().actualizarNota(idNota, idAlumno, idAsignatura, nota, fecha);
		return null;
	}

	@Override
	public Integer borrarNota(String idNota) {
//		return new NotasDAOImpl().borrarNota(idNota);
		return null;
	}
}
