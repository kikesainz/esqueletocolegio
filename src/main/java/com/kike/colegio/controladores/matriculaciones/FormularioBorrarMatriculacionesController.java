package com.kike.colegio.controladores.matriculaciones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kike.colegio.dtos.MatriculacionDTO;
//import com.kike.colegio.servicios.impl.MatriculacionServiceImpl;
import com.kike.colegio.servicios.interfaces.IMatriculacionService;

/**
 * Servlet implementation class FormularioBorrarMatriculacionesController
 */
@WebServlet("/matriculaciones/formularioborrarmatriculaciones")
public class FormularioBorrarMatriculacionesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioBorrarMatriculacionesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/matriculaciones/borrarMatriculaciones.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idAsignatura = request.getParameter("idAsignatura");
		String nombreAsignatura = request.getParameter("nombreAsignatura");
		String idAlumno = request.getParameter("idAlumno");
		String nombreAlumno = request.getParameter("nombreAlumno");
		String fecha = request.getParameter("fecha");
		String activo = request.getParameter("activo");

		activo = activo != null ? "1" : "0";

//		IMatriculacionService matriculacionService = new MatriculacionServiceImpl();
//		List<MatriculacionDTO> listaMatriculaciones = new ArrayList<MatriculacionDTO>();
//
//		if (fecha.equals("")) {
//			listaMatriculaciones = matriculacionService
//					.obtenerMatriculacionesPoridAsigaturaNombreAsignaturaIdAlumnoNombreAlumnoYActivo(idAsignatura,
//							nombreAsignatura, idAlumno, nombreAlumno, activo);
//		} else {
//			listaMatriculaciones = matriculacionService
//					.obtenerMatriculacionesPoridAsigaturaNombreAsignaturaIdAlumnoNombreAlumnoFechaYActivo(idAsignatura,
//							nombreAsignatura, idAlumno, nombreAlumno, fecha, activo);
//		}

//		request.setAttribute("lista", listaMatriculaciones);
		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/WEB-INF/vistas/matriculaciones/borrarMatriculaciones.jsp");
		dispatcher.forward(request, response);
	}

}
