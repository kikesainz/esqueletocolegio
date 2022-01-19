package com.kike.colegio.controladores.notas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kike.colegio.dtos.NotaDTO;
import com.kike.colegio.servicios.impl.NotasServiceImpl;
import com.kike.colegio.servicios.interfaces.INotasService;

/**
 * Servlet implementation class ListadoAsignaturasController
 */
@WebServlet("/notas/listadonotas")
public class ListadoNotasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoNotasController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/notas/listadoNotas.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idAlumno = request.getParameter("idAlumno");
		String nombreAlumno = request.getParameter("nombreAlumno");
		String nombreAsignatura = request.getParameter("nombreAsignatura");
		String nota = request.getParameter("nota");
		String fecha = request.getParameter("fecha");
		
		INotasService notasService = new NotasServiceImpl();
		List<NotaDTO> listaNotas = new ArrayList<NotaDTO>();
		
		if(fecha.equals("")) {
			listaNotas = notasService.obtenerDatosNotasPorIdAlumnoNombreAlumnoNombreAsignaturaYNota(idAlumno, nombreAlumno, nombreAsignatura, nota);
		} else {
			listaNotas = notasService.obtenerDatosNotasPorIdAlumnoNombreAlumnoNombreAsignaturaNotaYFecha(idAlumno, nombreAlumno, nombreAsignatura, nota, fecha);
		}
		
		request.setAttribute("lista", listaNotas);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/notas/listadoNotas.jsp");
		dispatcher.forward(request, response);
	}
}
