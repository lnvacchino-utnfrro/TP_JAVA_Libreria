package Entidades;

import java.util.Date;
import java.util.HashMap;

public class Remito {

	private int nroRemito;
	private Date fechaEmisionRemito;
	private HashMap<Integer,LineaRemito> lineasRemito = new HashMap<Integer,LineaRemito>();
	private Proveedor proveedor;
	
	public int getNroRemito() {
		return nroRemito;
	}
	public Date getFechaEmisionRemito() {
		return fechaEmisionRemito;
	}
	public void setNroRemito(int nroRemito) {
		this.nroRemito = nroRemito;
	}
	public void setFechaEmisionRemito(Date fechaEmisionRemito) {
		this.fechaEmisionRemito = fechaEmisionRemito;
	}
	
	
}
