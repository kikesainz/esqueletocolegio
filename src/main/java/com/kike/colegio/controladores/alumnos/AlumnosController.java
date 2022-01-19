package com.kike.colegio.controladores.alumnos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;


import com.kike.colegio.dao.interfaces.IAlumnosDAO;
import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.servicios.impl.AlumnosServiceImpl;
import com.kike.colegio.utils.DbUtils;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/todosalumnos")
public class AlumnosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(AlumnosController.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AlumnosController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<AlumnoDTO> listaAlumnos = new AlumnosServiceImpl().obtenerAlumnos();
		
		request.setAttribute("listaAlumnos", listaAlumnos);
		javax.servlet.RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/listadoAlumnos.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
