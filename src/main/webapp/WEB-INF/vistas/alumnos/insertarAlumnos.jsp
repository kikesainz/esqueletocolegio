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
		<h2>Inserción de nuevo alumno</h2>
	</header>

	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/colegio/alumnos/insertaralumno" method="post" id="formulario">
				<label for="id">ID Alumno</label>
				<input type="text" id="id" name="id">
				
				<label for="nombre">Nombre Alumno</label>
				<input type="text" id="nombre" name="nombre"> <br>
				
				<label for="apellido">Apellido Alumno</label>
				<input type="text" id="apellido" name="apellido"> <br>
				
				<select name="municipios" id="municipios">
					<c:forEach items="${comboMunicipios}" var="municipio">
						<option value="${municipio.id}">${municipio.descripcion}</option>
					</c:forEach>
				</select> <br>
				
				<label for="famNumerosa">Familia Numerosa</label>
				<input type="checkbox" id="famNumerosa" name="famNumerosa" >
				
				<label for="activo">Activo</label>
				<input type="checkbox" id="activo" name="activo" >
				
				<input type="submit" value="Insertar">
			</form>
		</div>
		
		<c:if test="${resultado == 1}">
			<b style="text-align:center">Alumno insertado correctamente</b>
		</c:if>
	</div>
</body>
</html>