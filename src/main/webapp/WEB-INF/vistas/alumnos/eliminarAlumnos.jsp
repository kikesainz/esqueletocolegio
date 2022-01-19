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
<title>Borrar alumnos</title>
</head>
<body>
	<%@include file="/menu.html"%>
	<header>
		<h2>Borrar Alumnos</h2>
	</header>

	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/colegio/alumnos/formularioeliminaralumnos"
				method="post">
				<label for="id">Id Alumno</label> 
				<input type="text" id="id" name="id">
				
				<label for="nombre">Nombre Alumno</label> 
				<input type="text" id="nombre" name="nombre"> <br> 
				
				<label for="apellido">Apellido Alumno</label> 
				<input type="text" id="apellido" name="apellido"> <br>
				
				<label for="famNumerosa">Familia Numerosa</label>
				<input type="checkbox" id="famNumerosa" name="famNumerosa" >
				
				<label for="activo">Activo</label>
				<input type="checkbox" id="activo" name="activo" >
								
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
				<th>APELLIDO</th>
				<th>MUNICIPIO</th>
				<th>BORRAR</th>
			</tr>

			<c:forEach items="${lista}" var="alumno">
				<tr>
					<td>${alumno.id}</td>
					<td>${alumno.nombre}</td>
					<td>${alumno.apellido}</td>
					<td>${alumno.municipio}</td>
					<td>
						<form action="http://localhost:8080/colegio/alumnos/eliminaralumno" method="post">
							<input type="text" id="id" name="id" value="${alumno.id}" hidden="true">
							<input type="submit" value="Borrar">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<c:if test="${resultado == 1}">
			<b style="text-align:center">Alumno borrado correctamente</b>
		</c:if>
</body>
</html>