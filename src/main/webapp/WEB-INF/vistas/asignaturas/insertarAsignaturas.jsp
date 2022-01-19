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
		<h2>Inserción de nueva asignatura</h2>
	</header>

	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/colegio/asignaturas/insertarAsignatura" method="post" id="formulario">
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
								
				<input type="submit" value="Insertar">
			</form>
		</div>
		
		<c:if test="${resultado == 1}">
			<b style="text-align:center">Asignatura insertada correctamente</b>
		</c:if>
	</div>
</body>
</html>