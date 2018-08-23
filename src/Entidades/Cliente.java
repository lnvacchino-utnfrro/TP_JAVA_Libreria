package Entidades;

public class Cliente {

	private int idCliente;
	private String usuario;
	private String contraseña;
	private String nombreApellido;
	private int dni;
	private String direccion;
	private int telefono;
	private String mail;
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public int getDni() {
		return dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
