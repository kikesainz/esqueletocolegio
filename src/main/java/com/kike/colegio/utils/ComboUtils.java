package com.kike.colegio.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;

import com.kike.colegio.dao.impl.CombosDAOimpl;
import com.kike.colegio.dao.interfaces.IComboDAO;
import com.kike.colegio.dtos.ComboDTO;

public class ComboUtils {
	
	public static void recuperarComboMunicipios(HttpServletRequest request) {
		IComboDAO comboMunicipio = new CombosDAOimpl();
		List<ComboDTO> listaMunicipios = comboMunicipio.comboMunicipios();
		request.setAttribute("comboMunicipios", listaMunicipios);
	}
	
	public static void recuperarComboAlumnos(HttpServletRequest request) {
		IComboDAO comboAlumno = new CombosDAOimpl();
		List<ComboDTO> listaAlumnos = comboAlumno.comboAlumnos();
		request.setAttribute("comboAlumnos", listaAlumnos);
	}
	
	public static void recuperarComboAsignaturas(HttpServletRequest request) {
		IComboDAO comboAsignatura = new CombosDAOimpl();
		List<ComboDTO> listaAsignaturas = new CombosDAOimpl().comboAsignaturas();
		request.setAttribute("comboAsignaturas", listaAsignaturas);
	}
}
