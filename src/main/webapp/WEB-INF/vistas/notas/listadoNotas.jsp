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
<title>Listado de notas</title>
</head>

<body>
	<%@include file="/menu.html"%>
	<header>
		<h2>Listado Notas</h2>
	</header>
	
	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/colegio/notas/listadonotas"
				method="post">
				<label for="idAlumno">ID Alumno</label> 
				<input type="text" id="idAlumno" name="idAlumno"> <br>
				
				<label for="nombreAlumno">Nombre Alumno</label> 
				<input type="text" id="nombreAlumno" name="nombreAlumno"> <br> 
				
				<label for="nombreAsignatura">Asignatura</label> 
				<input type="text" id="nombreAsignatura" name="nombreAsignatura"> <br>
				
				<label for="nota">Nota</label>
				<input type="text" id="nota" name="nota" > <br>
				
				<label for="fecha">Fecha</label>
				<input type="date" id="fecha" name="fecha"> <br>
								
				<input type="submit" value="Enviar">
			</form>
		</div>
	</div>

	<c:if test="${empty lista}">
		<h2>No hay resultados que mostrar con esos filtros</h2>
	</c:if>
	<c:if test="${not empty lista}">
		<table>
			<tr>
				<th>ID Alumno</th>
				<th>Nombre Alumno</th>
				<th>Nombre Asignatura</th>
				<th>Nota</th>
				<th>Fecha</th>
			</tr>

			<c:forEach items="${lista}" var="nota">
				<tr>
					<td>${nota.idAlumno}</td>
					<td>${nota.nombreAlumno}</td>
					<td>${nota.nombreAsignatura}</td>
					<td>${nota.nota}</td>
					<td>${nota.fecha}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>