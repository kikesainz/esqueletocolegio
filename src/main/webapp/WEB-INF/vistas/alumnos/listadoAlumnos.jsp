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
<title>Listado de alumnos</title>
</head>
<body>
	<%@include file="/menu.html"%>
	<header>
		<h2>Listado Alumnos</h2>
	</header>

	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/colegio/alumnos/listadoalumnos"
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
			</tr>

			<c:forEach items="${lista}" var="alumno">
				<tr>
					<td>${alumno.id}</td>
					<td>${alumno.nombre}</td>
					<td>${alumno.apellido}</td>
					<td>${alumno.municipio}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>