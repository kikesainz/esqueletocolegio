package com.kike.colegio.dtos;

import java.util.Date;

public class NotaDTO {
	private Integer idNota;
	private Integer idAlumno;
	private Integer idAsignatura;
	private String nombreAlumno;
	private String nombreAsignatura;
	private String nota;
	private Date fecha;

	public NotaDTO(Integer idNota, Integer idAlumno, Integer idAsignatura, String nombreAlumno,
			String nombreAsignatura, String nota, Date fecha) {
		super();
		this.idNota = idNota;
		this.idAlumno = idAlumno;
		this.idAsignatura = idAsignatura;
		this.nombreAlumno = nombreAlumno;
		this.nombreAsignatura = nombreAsignatura;
		this.nota = nota;
		this.fecha = fecha;
	}

	public Integer getIdNota() {
		return idNota;
	}

	public void setIdNota(Integer idNota) {
		this.idNota = idNota;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Integer getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(Integer idAsignatura) {
		this.idAsignatura = idAsignatura;
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

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}