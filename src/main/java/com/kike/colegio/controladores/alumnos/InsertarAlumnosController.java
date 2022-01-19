package com.kike.colegio.controladores.alumnos;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kike.colegio.dao.impl.CombosDAOimpl;
import com.kike.colegio.dao.interfaces.IComboDAO;
import com.kike.colegio.dtos.ComboDTO;
import com.kike.colegio.servicios.impl.AlumnosServiceImpl;
import com.kike.colegio.servicios.interfaces.IAlumnosService;
import com.kike.colegio.utils.ComboUtils;

/**
 * Servlet implementation class InsertarAlumnosController
 */
@WebServlet("/alumnos/insertaralumno")
public class InsertarAlumnosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarAlumnosController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1- Recuperar de la BBDD todos los municipios y meterlos en una lista
		
		ComboUtils.recuperarComboMunicipios(request);
		
		RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/vistas/alumnos/insertarAlumnos.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recupero los datos del formulario
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String idMunicipio = request.getParameter("municipios");
		String familiaNumerosa = request.getParameter("famNumerosa");
		String activo = request.getParameter("activo");
		
		familiaNumerosa = familiaNumerosa != null?"1":"0";
		activo = activo != null?"1":"0";
		
		IAlumnosService a = new AlumnosServiceImpl();
		Integer resultado = a.insertarAlumno(id, nombre, apellido, idMunicipio, familiaNumerosa, activo);
		
		request.setAttribute("resultado", resultado);
		
		ComboUtils.recuperarComboMunicipios(request);
		
		RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/vistas/alumnos/insertarAlumnos.jsp");
		d.forward(request, response);
	}

}
