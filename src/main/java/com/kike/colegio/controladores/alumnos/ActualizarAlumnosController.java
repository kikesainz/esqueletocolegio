package com.kike.colegio.controladores.alumnos;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kike.colegio.servicios.impl.AlumnosServiceImpl;
import com.kike.colegio.servicios.interfaces.IAlumnosService;

/**
 * Servlet implementation class ActualizarAlumnosController
 */
@WebServlet("/alumnos/actualizaralumno")
public class ActualizarAlumnosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarAlumnosController() {
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
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String familiaNumerosa = request.getParameter("famNumerosa");
		String activo = request.getParameter("activo");
		String idMunicipio = request.getParameter("municipios");
		
		familiaNumerosa = familiaNumerosa != null?"1":"0";
		activo = activo != null?"1":"0";
		
		IAlumnosService a = new AlumnosServiceImpl();
		Integer resultado = a.actualizarAlumno(id, nombre, apellido, idMunicipio, familiaNumerosa, activo);
		
		request.setAttribute("resultado", resultado);
		
		RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/vistas/alumnos/actualizarAlumnos.jsp");
		d.forward(request, response);
	}

}
