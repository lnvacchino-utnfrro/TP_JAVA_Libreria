package Entidades;

import java.util.Date;
import java.util.HashMap;

public class FacturaCompra {

	private int nroFacturaCompra;
	private Date fechaEmisionCompra;
	private HashMap<Integer,LineaCompra> lineasCompra= new HashMap<Integer,LineaCompra>();
	private Proveedor proveedor;
	
	public int getNroFacturaCompra() {
		return nroFacturaCompra;
	}
	public Date getFechaEmisionCompra() {
		return fechaEmisionCompra;
	}
	public void setNroFacturaCompra(int nroFacturaCompra) {
		this.nroFacturaCompra = nroFacturaCompra;
	}
	public void setFechaEmisionCompra(Date fechaEmisionCompra) {
		this.fechaEmisionCompra = fechaEmisionCompra;
	}
	
	
}
