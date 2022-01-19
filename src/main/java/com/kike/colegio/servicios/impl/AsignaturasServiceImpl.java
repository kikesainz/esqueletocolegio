package com.kike.colegio.servicios.impl;

import java.util.List;


import com.kike.colegio.dtos.AsignaturaDTO;
import com.kike.colegio.servicios.interfaces.IAsignaturaService;

public class AsignaturasServiceImpl implements IAsignaturaService{

	@Override
	public List<AsignaturaDTO> obtenerAsignaturasPorIdNombreCursoTasaActivo(String id, String nombre, String curso,
			String tasa, String activo) {
//		return new AsignaturasDAOImpl().obtenerAsignaturasPorIdNombreCursoTasaActivo(id, nombre, curso, tasa, activo);
		return null;
	}

	@Override
	public Integer insertarAsignatura(String id, String nombre, String curso, String tasa, String activo) {
//		return new AsignaturasDAOImpl().insertarAsignatura(id, nombre, curso, tasa, activo);
		return null;
	}

	@Override
	public Integer actualizarAsignatura(String id, String nombre, String curso, String tasa, String activo) {
//		return new AsignaturasDAOImpl().actualizarAsignatura(id, nombre, curso, tasa, activo);
		return null;
	}

	@Override
	public Integer borrarAsignatura(String id) {
//		return new AsignaturasDAOImpl().borrarAsignatura(id);
		return null;
	}
}
