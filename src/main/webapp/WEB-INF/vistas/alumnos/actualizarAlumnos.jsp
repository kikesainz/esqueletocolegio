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
<title>Actualizar alumnos</title>
</head>
<body>
	<%@include file="/menu.html"%>

	<div class="container">
		<h2>Actualizar Alumnos</h2>
		
		<div class="form">
			<form action="http://localhost:8080/colegio/alumnos/formularioactualizaralumnos" method="post">
				<label for="id">Id Alumno</label>
				<input type="text" id="id" name="id">
				
				<label for="nombre">Nombre Alumno</label>
				<input type="text" id="nombre" name="nombre"> <br>
				
				<label for="apellido">Apellido Alumno</label>
				<input type="text" id="apellido" name="apellido"> <br>
				
				Familia numerosa:
				<input type="checkbox" id="famNumerosa" name="famNumerosa">
				Activo:
				<input type="checkbox" id="activo" name="activo" checked> <br>
				
				<input type="submit" value="Enviar">
			</form>
		</div>
		
		<c:forEach items="${lista}" var="alumno">
			<form action="http://localhost:8080/colegio/alumnos/actualizaralumno" method="post">
				<label for="id">Id Alumno</label>
				<input type="text" id="id" name="id" value="${alumno.id}">
				
				<label for="nombre">Nombre Alumno</label>
				<input type="text" id="nombre" name="nombre" value="${alumno.nombre}"> <br>
				
				<label for="apellido">Apellido Alumno</label>
				<input type="text" id="apellido" name="apellido" value="${alumno.apellido}"> <br>
				
				Familia numerosa:
				<c:if test="${alumno.familiaNumerosa == 1}">
					<input type="checkbox" id="famNumerosa" name="famNumerosa" checked> <br>
				</c:if>
				
				<c:if test="${alumno.familiaNumerosa == 0}">
					<input type="checkbox" id="famNumerosa" name="famNumerosa"> <br>
				</c:if>
				
				Activo:
				<c:if test="${alumno.activo == 1}">
					<input type="checkbox" id="activo" name="activo" checked> <br>
				</c:if>
				
				<c:if test="${alumno.activo == 0}">
					<input type="checkbox" id="activo" name="activo"> <br>
				</c:if>
				
				<label for="municipios">Municipio</label>
				<select name="municipios" id="municipios">
					<c:forEach items="${comboMunicipios}" var="municipio">
						<option value="${municipio.id}">${municipio.descripcion}</option>
					</c:forEach>
					
					<option value="${alumno.idMunicipio}" selected>${alumno.municipio}</option>
				</select> <br>
				
				<input type="submit" value="Modificar">
			</form>
			
			<hr>
		</c:forEach>
		
		<c:if test="${resultado == 1}">
			<b style="text-align:center">Alumno actualizado correctamente</b>
		</c:if>
	</div>
</body>
</html>