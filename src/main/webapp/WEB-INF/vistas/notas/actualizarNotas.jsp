<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="/colegio/css/index.css">
<link rel="stylesheet" type="text/css" href="/colegio/css/formularios.css">
<link rel="stylesheet" type="text/css" href="/colegio/css/tablas.css">
<meta charset="ISO-8859-1">
<title>Actualizar notas</title>
</head>
<body>
	<%@include file="/menu.html"%>

	<div class="container">
		<h2>Actualizar Notas</h2>
		
		<div class="form">
			<form action="http://localhost:8080/colegio/notas/formularioactualizarnotas" method="post">
				<label for="nombreAlumno">Nombre Alumno</label> 
				<input type="text" id="nombreAlumno" name="nombreAlumno"> <br> 
				
				<label for="nombreAsignatura">Asignatura</label> 
				<input type="text" id="nombreAsignatura" name="nombreAsignatura"> <br>
				
				<label for="fecha">Fecha</label>
				<input type="date" id="fecha" name="fecha" > <br>
								
				<input type="submit" value="Enviar">
			</form>
		</div>
		
		<br>
		<c:forEach items="${lista}" var="nota">
			<form action="http://localhost:8080/colegio/notas/actualizarnotas" method="post" class="form">
				<input type="text" id="idNota" name="idNota" value="${nota.idNota}" hidden="true">
				
				<label for="alumnos">Alumno</label> 
				<select name="idAlumno" id="idAlumno">
					<c:forEach items="${comboAlumnos}" var="alumno">
						<option value="${alumno.id}">${alumno.id}-${alumno.descripcion}</option>
					</c:forEach>
					<option value="${nota.idAlumno}" selected>${nota.idAlumno}-${nota.nombreAlumno}</option>
				</select>
				
				<label for="idAsignatura">Asignaturas</label> 
				<select name="idAsignatura" id="idAsignatura">
					<c:forEach items="${comboAsignaturas}" var="asignatura">
						<option value="${asignatura.id}">${asignatura.descripcion}</option>
					</c:forEach>
					<option value="${nota.idAsignatura}" selected>${nota.idAsignatura}-${nota.nombreAsignatura}</option>
				</select> <br>
					
				<label for="nota">Nota</label>
				<input type="text" id="nota" name="nota" value="${nota.nota}">
				
				<label for="fecha">Fecha</label>
				<input type="date" id="fecha" name="fecha" value="${nota.fecha}"> <br>
							
				<input type="submit" value="Modificar">
			</form>
			
			<br>
		</c:forEach>
		
		<c:if test="${resultado == 1}">
			<b style="text-align:center">Nota actualizada correctamente</b>
		</c:if>
	</div>
</body>
</html>