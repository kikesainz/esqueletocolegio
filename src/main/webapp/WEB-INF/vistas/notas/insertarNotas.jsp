<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/colegio/css/index.css">
<link rel="stylesheet" type="text/css" href="/colegio/css/formularios.css">
</head>
<body>
	<%@include file="/menu.html"%>
	<header>
		<h2>Inserción de notas</h2>
	</header>

	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/colegio/notas/insertarnotas" method="post" id="formulario">
				<label for="idAlumno">Alumnos</label> 
				<select name="idAlumno" id="idAlumno">
					<c:forEach items="${comboAlumnos}" var="alumno">
						<option value="${alumno.id}">${alumno.id}-${alumno.descripcion}</option>
					</c:forEach>
				</select>
				
				<label for="idAsignatura">Asignaturas</label> 
				<select name="idAsignatura" id="idAsignatura">
					<c:forEach items="${comboAsignaturas}" var="asignatura">
						<option value="${asignatura.id}">${asignatura.descripcion}</option>
					</c:forEach>
				</select> <br>
				
				<label for="nota">Nota</label>
				<input type="text" id="nota" name="nota" >
				
				<label for="fecha">Fecha</label>
				<input type="date" id="fecha" name="fecha" > <br>
				
				<input type="submit" value="Insertar">
			</form>
		</div>
		
		<c:if test="${resultado == 1}">
			<b style="text-align:center">Nota insertada correctamente</b>
		</c:if>
	</div>
</body>
</html>