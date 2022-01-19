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

import com.kike.colegio.dtos.AlumnoDTO;
import com.kike.colegio.servicios.impl.AlumnosServiceImpl;
import com.kike.colegio.servicios.interfaces.IAlumnosService;
import com.kike.colegio.utils.ComboUtils;

/**
 * Servlet implementation class FormularioActualizarAlumnosController
 */
@WebServlet("/alumnos/formularioactualizaralumnos")
public class FormularioActualizarAlumnosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioActualizarAlumnosController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/vistas/alumnos/actualizarAlumnos.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ComboUtils.recuperarComboMunicipios(request);
		
		String id = request.getParameter("id");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String familiaNumerosa = request.getParameter("famNumerosa");
		String activo = request.getParameter("activo");
		
		familiaNumerosa = familiaNumerosa != null?"1":"0";
		activo = activo != null?"1":"0";
		
		List<AlumnoDTO> listaAlumnos = new ArrayList<>();
		
		IAlumnosService a = new AlumnosServiceImpl();
		listaAlumnos = a.obtenerAlumnosporIdNombreApellidoFamiliaActivo(id, nombre, apellido, familiaNumerosa, activo);
		
		request.setAttribute("lista", listaAlumnos);
		
		RequestDispatcher d = getServletContext().getRequestDispatcher("/WEB-INF/vistas/alumnos/actualizarAlumnos.jsp");
		d.forward(request, response);
	}

}
