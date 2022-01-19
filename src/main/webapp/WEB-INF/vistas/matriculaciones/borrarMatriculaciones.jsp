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
<title>Borrar matriculaciones</title>
</head>
<body>
	<%@include file="/menu.html"%>
	<header>
		<h2>Borrar matriculaciones</h2>
	</header>

	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/colegio/matriculaciones/formularioborrarmatriculaciones"
				method="post">
				<label for="idAsignatura">ID Asignatura</label> 
				<input type="text" id="idAsignatura" name="idAsignatura">
				
				<label for="nombreAsignatura">Nombre Asignatura</label> 
				<input type="text" id="nombreAsignatura" name="nombreAsignatura"> <br> 
				
				<label for="idAlumno">ID Alumno</label> 
				<input type="text" id="idAlumno" name="idAlumno">
				
				<label for="nombreAlumno">Nombre Alumno</label>
				<input type="text" id="nombreAlumno" name="nombreAlumno" > <br>
				
				<label for="fecha">Fecha</label>
				<input type="date" id="fecha" name="fecha"> <br>
				
				<label for="activo">Activo</label>
				<input type="checkbox" id="activo" name="activo">
								
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
				<th>ID MATRÍCULA</th>
				<th>ID ALUMNO</th>
				<th>ALUMNO</th>
				<th>ASIGNATURA</th>
				<th>TASA</th>
				<th>FECHA</th>
				<th>BORRAR</th>
			</tr>

			<c:forEach items="${lista}" var="matricula">
				<tr>
					<td>${matricula.idMatriculacion}</td>
					<td>${matricula.idAlumno}</td>
					<td>${matricula.nombreAlumno}</td>
					<td>${matricula.nombreAsignatura}</td>
					<td>${matricula.tasa}</td>
					<td>${matricula.fecha}</td>
					<td>
						<form action="http://localhost:8080/colegio/matriculaciones/borrarmatriculaciones" method="post">
							<input type="text" id="id" name="id" value="${matricula.idMatriculacion}" hidden="true">
							<input type="submit" value="Borrar">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<c:if test="${resultado == 1}">
		<b style="text-align:center">Matriculación borrada correctamente</b>
	</c:if>
</body>
</html>