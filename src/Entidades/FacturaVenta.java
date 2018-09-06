package Entidades;

import java.util.Date;
import java.util.HashMap;

public class FacturaVenta {
   
	private int nroFacturaVenta;
	private Date fechaEmisionVenta;
	private HashMap<Integer,LineaVenta> lineasVentas= new HashMap<Integer,LineaVenta>();
	
	
	public int getNroFacturaVenta() {
		return nroFacturaVenta;
	}
	public Date getFechaEmision() {
		return fechaEmisionVenta;
	}
	public void setNroFacturaVenta(int nroFacturaVenta) {
		this.nroFacturaVenta = nroFacturaVenta;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmisionVenta = fechaEmision;
	}
	
	
}
