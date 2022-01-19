package com.kike.colegio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kike.colegio.dao.interfaces.IComboDAO;
import com.kike.colegio.dtos.ComboDTO;
import com.kike.colegio.utils.DbUtils;

public class CombosDAOimpl implements IComboDAO {

	@Override
	public List<ComboDTO> comboMunicipios() {
		String sql = "SELECT * FROM municipios ORDER BY nombre";
		List<ComboDTO> listaMunicipios = new ArrayList<>();

		try (Connection connection = DbUtils.conexion(); PreparedStatement ps = connection.prepareStatement(sql);) {
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ComboDTO a = new ComboDTO(rs.getInt("id_municipio"), rs.getString("nombre"));
				listaMunicipios.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaMunicipios;
	}

	@Override
	public List<ComboDTO> comboAlumnos() {
		String query = "SELECT * FROM alumnos ORDER BY nombre";
		List<ComboDTO> listaAlumnos = new ArrayList<>();

		try (Connection connection = DbUtils.conexion(); PreparedStatement ps = connection.prepareStatement(query);) {
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ComboDTO a = new ComboDTO(rs.getInt("id"), rs.getString("nombre"));
				listaAlumnos.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaAlumnos;
	}

	@Override
	public List<ComboDTO> comboAsignaturas() {
		String query = "SELECT * FROM asignaturas ORDER BY nombre";
		List<ComboDTO> listaAsignaturas = new ArrayList<>();

		try (Connection connection = DbUtils.conexion(); PreparedStatement ps = connection.prepareStatement(query);) {
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ComboDTO a = new ComboDTO(rs.getInt("id"), rs.getString("nombre"));
				listaAsignaturas.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaAsignaturas;
	}

}
