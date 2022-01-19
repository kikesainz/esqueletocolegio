package com.kike.colegio.controladores.matriculaciones;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.kike.colegio.servicios.impl.MatriculacionServiceImpl;
import com.kike.colegio.servicios.interfaces.IMatriculacionService;
import com.kike.colegio.utils.ComboUtils;

/**
 * Servlet implementation class InsertarAlumnosController
 */

@WebServlet("/matriculaciones/insertarmatriculacion")
public class InsertarMatriculacionesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertarMatriculacionesController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ComboUtils.recuperarComboAlumnos(request);
		ComboUtils.recuperarComboAsignaturas(request);

		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/WEB-INF/vistas/matriculaciones/insertarMatriculaciones.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(System.currentTimeMillis());
		String fechaActual = formatter.format(date);
		Integer resultado = null;
		
		String idAsignatura = request.getParameter("asignaturas");
		String idAlumno = request.getParameter("alumnos");
		String fecha = request.getParameter("fecha");
		String importe = request.getParameter("tasa");
		
		fecha = fecha.equals("")?fechaActual:fecha;
		
//		IMatriculacionService matrService = new MatriculacionServiceImpl();
//		resultado = matrService.insertarMatriculacion(idAsignatura, idAlumno, fecha, importe);
		
		ComboUtils.recuperarComboAlumnos(request);
		ComboUtils.recuperarComboAsignaturas(request);
		
		request.setAttribute("resultado", resultado);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/matriculaciones/insertarMatriculaciones.jsp");
		dispatcher.forward(request, response);
	}

}
