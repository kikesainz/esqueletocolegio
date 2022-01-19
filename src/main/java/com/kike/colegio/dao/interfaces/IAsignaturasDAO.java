package com.kike.colegio.dao.interfaces;

import java.util.List;

import com.kike.colegio.dtos.AsignaturaDTO;

public interface IAsignaturasDAO {
	public List<AsignaturaDTO> obtenerAsignaturasPorIdNombreCursoTasaActivo(String id, String nombre, String curso,
			String tasa, String activo);

	public Integer insertarAsignatura(String id, String nombre, String curso, String tasa, String activo);
	
	public Integer actualizarAsignatura(String id, String nombre, String curso, String tasa, String activo);
	
	public Integer borrarAsignatura(String id);
}
