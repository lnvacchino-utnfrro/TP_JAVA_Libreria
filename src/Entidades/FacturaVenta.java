package Entidades;

import java.util.Date;

public class FacturaVenta {
   
	private int nroFacturaVenta;
	private Date fechaEmision;
	public int getNroFacturaVenta() {
		return nroFacturaVenta;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setNroFacturaVenta(int nroFacturaVenta) {
		this.nroFacturaVenta = nroFacturaVenta;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	
}
