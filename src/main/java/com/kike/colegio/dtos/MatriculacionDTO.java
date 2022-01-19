package com.kike.colegio.dtos;

import java.util.Date;

public class MatriculacionDTO {
	private Integer idMatriculacion;
	private Integer idAsignatura;
	private Integer idAlumno;
	private String nombreAlumno;
	private String nombreAsignatura;
	private Date fecha;
	private Integer activo;
	private Double tasa;
	
	public MatriculacionDTO(Integer idMatriculacion, Integer idAsignatura, Integer idAlumno, String nombreAlumno,
			String nombreAsignatura, Date fecha, Integer activo, Double tasa) {
		super();
		this.idMatriculacion = idMatriculacion;
		this.idAsignatura = idAsignatura;
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno;
		this.nombreAsignatura = nombreAsignatura;
		this.fecha = fecha;
		this.activo = activo;
		this.tasa = tasa;
	}

	public Integer getIdMatriculacion() {
		return idMatriculacion;
	}

	public void setIdMatriculacion(Integer idMatriculacion) {
		this.idMatriculacion = idMatriculacion;
	}

	public Integer getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(Integer idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Double getTasa() {
		return tasa;
	}

	public void setTasa(Double tasa) {
		this.tasa = tasa;
	}
}
