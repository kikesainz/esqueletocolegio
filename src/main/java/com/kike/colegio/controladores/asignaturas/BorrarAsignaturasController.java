package com.kike.colegio.controladores.asignaturas;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kike.colegio.servicios.impl.AsignaturasServiceImpl;
import com.kike.colegio.servicios.interfaces.IAsignaturaService;

/**
 * Servlet implementation class BorrarAsignaturasController
 */
@WebServlet("/asignaturas/borrarasignaturas")
public class BorrarAsignaturasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrarAsignaturasController() {
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
		String id = request.getParameter("id");
		IAsignaturaService asignatura = new AsignaturasServiceImpl();
		
		Integer resultado = asignatura.borrarAsignatura(id);
		
		request.setAttribute("resultado", resultado);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/asignaturas/borrarAsignaturas.jsp");
		dispatcher.forward(request, response);
	}

}
