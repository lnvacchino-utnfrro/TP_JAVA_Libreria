package Entidades;

import java.util.HashMap;
import Entidades.Libro;

public class Libreria {

	private int cuit;
	private String razonSocial;
	private int telefono;
	private String mailLibreria;
	private String direccionLibreria;
	private HashMap<Integer,Libro> libros = new HashMap<Integer,Libro>();
	
	public int getCuit() {
		return cuit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getMailLibreria() {
		return mailLibreria;
	}
	public String getDireccionLibreria() {
		return direccionLibreria;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setMailLibreria(String mailLibreria) {
		this.mailLibreria = mailLibreria;
	}
	public void setDireccionLibreria(String direccionLibreria) {
		this.direccionLibreria = direccionLibreria;
	}
	
	
}
