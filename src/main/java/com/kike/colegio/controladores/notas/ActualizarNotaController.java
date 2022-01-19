package com.kike.colegio.controladores.notas;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kike.colegio.servicios.impl.NotasServiceImpl;
import com.kike.colegio.servicios.interfaces.INotasService;
import com.kike.colegio.utils.ComboUtils;

/**
 * Servlet implementation class ActualizarNotaController
 */
@WebServlet("/notas/actualizarnotas")
public class ActualizarNotaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarNotaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ComboUtils.recuperarComboAlumnos(request);
		ComboUtils.recuperarComboAsignaturas(request);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(System.currentTimeMillis());
		
		String fechaActual = formatter.format(date);
		String idAlumno = request.getParameter("idAlumno");
		String idAsignatura = request.getParameter("idAsignatura");
		String nota = request.getParameter("nota");
		String fecha = request.getParameter("fecha");
		String idNota = request.getParameter("idNota");
		
		fecha = fecha.equals("")?fechaActual:fecha;
		
		INotasService notas = new NotasServiceImpl();
		Integer resultado = notas.actualizarNota(idNota, idAlumno, idAsignatura, nota, fecha);
		
		request.setAttribute("resultado", resultado);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/notas/actualizarNotas.jsp");
		dispatcher.forward(request, response);
	}

}
