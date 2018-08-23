package Entidades;

import java.util.Date;
import java.util.HashMap;

public class FacturaVenta {
   
	private int nroFacturaVenta;
	private Date fechaEmision;
	private HashMap<Integer,LineaVenta> lineasVentas= new HashMap<Integer,LineaVenta>();
	
	
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
