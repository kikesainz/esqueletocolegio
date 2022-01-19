package com.kike.colegio.controladores.matriculaciones;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.kike.colegio.servicios.impl.MatriculacionServiceImpl;
import com.kike.colegio.servicios.interfaces.IMatriculacionService;

/**
 * Servlet implementation class BorrarMatriculacionesController
 */
@WebServlet("/matriculaciones/borrarmatriculaciones")
public class BorrarMatriculacionesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrarMatriculacionesController() {
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
		String idMatricula = request.getParameter("id");
//		IMatriculacionService matrService = new MatriculacionServiceImpl();
//		
//		Integer resultado = matrService.borrarMatriculacion(idMatricula);
		
//		request.setAttribute("resultado", resultado);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/vistas/matriculaciones/borrarMatriculaciones.jsp");
		dispatcher.forward(request, response);
	}

}
