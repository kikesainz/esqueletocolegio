package com.kike.colegio.controladores.matriculaciones;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.kike.colegio.servicios.impl.MatriculacionServiceImpl;
import com.kike.colegio.servicios.interfaces.IMatriculacionService;

/**
 * Servlet implementation class CalculoTasasController
 */

@WebServlet("/matriculaciones/tasa")
public class CalculoTasasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculoTasasController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idAlumno = request.getParameter("alumnos");
		String idAsignatura = request.getParameter("asignaturas");
		
//		IMatriculacionService matriculacionService = new MatriculacionServiceImpl();
//		Double tasa = matriculacionService.calcularTasa(idAlumno, idAsignatura);
//
//		PrintWriter out = response.getWriter();
//		out.println(tasa);
	}

}
