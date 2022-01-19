package com.kike.colegio.controladores.alumnos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.servicios.impl.AlumnosServiceImpl;
import com.kike.colegio.servicios.interfaces.IAlumnosService;

/**
 * Servlet implementation class ListadoAlumnosController
 */
@WebServlet("/alumnos/listadoalumnos")
public class ListadoAlumnosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Logger logger = LoggerFactory.getLogger(ListadoAlumnosController.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoAlumnosController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/vistas/alumnos/listadoAlumnos.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String familia = request.getParameter("famNumerosa");
		String activo = request.getParameter("activo");
		
		familia = familia != null?"1":"0";
		activo = activo != null?"1":"0";
		
		IAlumnosService a = new AlumnosServiceImpl();
		List<AlumnoDTO> listaAlumnos = new ArrayList<>();
		
		listaAlumnos = a.obtenerAlumnosporIdNombreApellidoFamiliaActivo(id, nombre, apellido, familia, activo);
		
		request.setAttribute("lista", listaAlumnos);
		RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/vistas/alumnos/listadoAlumnos.jsp");
		d.forward(request, response);
	}

}
