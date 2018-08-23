package Entidades;

public class Libro {
	
	private int idLibro;
	private String titulo;
	private int nroEdicion;
	private int isbn;
	private String descripcion;
	private float precio;
	private String editorial;
	private String genero;
	public int getIdLibro() {
		return idLibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getNroEdicion() {
		return nroEdicion;
	}
	public int getIsbn() {
		return isbn;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public String getEditorial() {
		return editorial;
	}
	public String getGenero() {
		return genero;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setNroEdicion(int nroEdicion) {
		this.nroEdicion = nroEdicion;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
