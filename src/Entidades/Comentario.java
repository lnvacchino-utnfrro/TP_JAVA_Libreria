package Entidades;

import java.util.Date;

public class Comentario {
	private String descripcion;
	private Date fechaCreacion;
	private Cliente cliente;
	private int idComentario ;
	
	public void setIdComentario( int idComentario) {
		this.idComentario = idComentario;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	

}
