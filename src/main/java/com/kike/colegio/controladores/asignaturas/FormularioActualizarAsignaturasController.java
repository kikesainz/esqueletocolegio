package com.kike.colegio.controladores.asignaturas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kike.colegio.dtos.AsignaturaDTO;
import com.kike.colegio.servicios.impl.AsignaturasServiceImpl;
import com.kike.colegio.servicios.interfaces.IAsignaturaService;

/**
 * Servlet implementation class FormularioActualizarAsignaturasController
 */
@WebServlet("/asignaturas/formularioactualizarasignaturas")
public class FormularioActualizarAsignaturasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioActualizarAsignaturasController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/asignaturas/actualizarAsignaturas.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String curso = request.getParameter("curso");
		String tasa = request.getParameter("tasa");
		String activa = request.getParameter("activa");
		
		activa = activa != null? "1" : "0";
		
		IAsignaturaService asignatura = new AsignaturasServiceImpl();
		List<AsignaturaDTO> listaAsignaturas = new ArrayList<AsignaturaDTO>();
		
		listaAsignaturas = asignatura.obtenerAsignaturasPorIdNombreCursoTasaActivo(id, nombre, curso, tasa, activa);
		
		request.setAttribute("lista", listaAsignaturas);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/asignaturas/actualizarAsignaturas.jsp");
		dispatcher.forward(request, response);
	}

}
