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
<title>Borrar asignaturas</title>
</head>
<body>
	<%@include file="/menu.html"%>
	<header>
		<h2>Borrar Asignaturas</h2>
	</header>

	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/colegio/asignaturas/formularioborrarasignaturas"
				method="post">
				<label for="id">ID Asignatura</label> 
				<input type="text" id="id" name="id">
				
				<label for="nombre">Nombre Asignatura</label> 
				<input type="text" id="nombre" name="nombre"> <br> 
				
				<label for="curso">Curso Asignatura</label> 
				<input type="text" id="curso" name="curso"> <br>
				
				<label for="tasa">Tasa</label>
				<input type="text" id="tasa" name="tasa" >
				
				<label for="activo">Activa</label>
				<input type="checkbox" id="activa" name="activa" >
								
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
				<th>ID</th>
				<th>NOMBRE</th>
				<th>CURSO</th>
				<th>TASA</th>
				<th>BORRAR</th>
			</tr>

			<c:forEach items="${lista}" var="asignatura">
				<tr>
					<td>${asignatura.id}</td>
					<td>${asignatura.nombre}</td>
					<td>${asignatura.curso}</td>
					<td>${asignatura.tasa}</td>
					<td>
						<form action="http://localhost:8080/colegio/asignaturas/borrarasignaturas" method="post">
							<input type="text" id="id" name="id" value="${asignatura.id}" hidden="true">
							<input type="submit" value="Borrar">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<c:if test="${resultado == 1}">
		<b style="text-align:center">Asignatura borrada correctamente</b>
	</c:if>
</body>
</html>