package Entidades;

public class Proveedor {
	
	private int cuit;
	private String razonSocial;
	private int telefonoProveedor;
	private String mailProveedor;
	private String direccionProveedor;
	public int getCuit() {
		return cuit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public int getTelefonoProveedor() {
		return telefonoProveedor;
	}
	public String getMailProveedor() {
		return mailProveedor;
	}
	public String getDireccionProveedor() {
		return direccionProveedor;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public void setTelefonoProveedor(int telefonoProveedor) {
		this.telefonoProveedor = telefonoProveedor;
	}
	public void setMailProveedor(String mailProveedor) {
		this.mailProveedor = mailProveedor;
	}
	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}
	
	
	

}
