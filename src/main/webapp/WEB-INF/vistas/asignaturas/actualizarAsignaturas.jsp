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
<title>Actualizar asignaturas</title>
</head>
<body>
	<%@include file="/menu.html"%>

	<div class="container">
		<h2>Actualizar asignaturas</h2>
		
		<div class="form">
			<form action="http://localhost:8080/colegio/asignaturas/formularioactualizarasignaturas" method="post">
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
		
		<c:forEach items="${lista}" var="asignatura">
			<form action="http://localhost:8080/colegio/asignaturas/actualizarasignaturas" method="post">
				<label for="id">ID Asignatura</label> 
				<input type="text" id="id" name="id" value="${asignatura.id}" readonly="readonly">
				
				<label for="nombre">Nombre Asignatura</label> 
				<input type="text" id="nombre" name="nombre" value="${asignatura.nombre}"> <br> 
				
				<label for="curso">Curso Asignatura</label> 
				<input type="text" id="curso" name="curso" value="${asignatura.curso}"> <br>
				
				<label for="tasa">Tasa</label>
				<input type="text" id="tasa" name="tasa" value="${asignatura.tasa}">
				
				<label for="activa">Activa</label>
				<c:if test="${asignatura.activo == 1}">
					<input type="checkbox" id="activa" name="activa" checked> <br>
				</c:if>
				
				<c:if test="${asignatura.activo == 0}">
					<input type="checkbox" id="activa" name="activa"> <br>
				</c:if>
				
				<input type="submit" value="Modificar">
			</form>
			
			<hr>
		</c:forEach>
		
		<c:if test="${resultado == 1}">
			<b style="text-align:center">Asignatura actualizada correctamente</b>
		</c:if>
	</div>
</body>
</html>