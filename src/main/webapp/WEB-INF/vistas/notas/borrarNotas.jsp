<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/colegio/css/index.css">
<link rel="stylesheet" type="text/css"
	href="/colegio/css/formularios.css">
<link rel="stylesheet" type="text/css" href="/colegio/css/tablas.css">
<meta charset="ISO-8859-1">
<title>Borrar Notas</title>
</head>
<body>
	<%@include file="/menu.html"%>
	<header>
		<h2>Borrar Notas</h2>
	</header>

	<div class="container">
		
		<div class="form">
			<form action="http://localhost:8080/colegio/notas/formularioborrarnotas" method="post">
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
			<form action="http://localhost:8080/colegio/notas/borrarnotas" method="post" class="form">
				<input type="text" id="idNota" name="idNota" value="${nota.idNota}" hidden="true">
				
				<label for="idAlumno">Alumno</label> 
				<input type="text" id="idAlumno" name="idAlumno" value="${nota.idAlumno}-${nota.nombreAlumno}" readonly="readonly">
				
				<label for="idAsignatura">Asignaturas</label> 
				<input type="text" id="idAsignatura" name="idAsignatura" value="${nota.idAsignatura}-${nota.nombreAsignatura}" readonly="readonly"> <br>
					
				<label for="nota">Nota</label>
				<input type="text" id="nota" name="nota" value="${nota.nota}" readonly="readonly">
				
				<label for="fecha">Fecha</label>
				<input type="date" id="fecha" name="fecha" value="${nota.fecha}" readonly="readonly"> <br>
							
				<input type="submit" value="Borrar">
			</form>
			
			<br>
		</c:forEach>
		
		<c:if test="${resultado == 1}">
			<b style="text-align:center">Nota borrada correctamente</b>
		</c:if>
	</div>
</body>
</html>