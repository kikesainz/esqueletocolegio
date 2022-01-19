package com.kike.colegio.dao.interfaces;

import java.util.List;

import com.kike.colegio.dtos.ComboDTO;

public interface IComboDAO {
	List<ComboDTO> comboMunicipios();
	List<ComboDTO> comboAlumnos();
	List<ComboDTO> comboAsignaturas();
}
