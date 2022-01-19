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
 * Servlet implementation class InsertarNotaController
 */
@WebServlet("/notas/insertarnotas")
public class InsertarNotaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarNotaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ComboUtils.recuperarComboAlumnos(request);
		ComboUtils.recuperarComboAsignaturas(request);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/notas/insertarNotas.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(System.currentTimeMillis());
		String fechaActual = formatter.format(date);
		
		String idAlumno = request.getParameter("idAlumno");
		String idAsignatura = request.getParameter("idAsignatura");
		String nota = request.getParameter("nota");
		String fecha = request.getParameter("fecha");
		
		fecha = fecha.equals("")?fechaActual:fecha;
		
		INotasService notas = new NotasServiceImpl();
		Integer resultado = notas.insertarNota(idAlumno, idAsignatura, nota, fecha);
		
		ComboUtils.recuperarComboAlumnos(request);
		ComboUtils.recuperarComboAsignaturas(request);
		
		request.setAttribute("resultado", resultado);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/notas/insertarNotas.jsp");
		dispatcher.forward(request, response);
	}

}
