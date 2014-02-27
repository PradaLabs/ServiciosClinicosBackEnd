package co.com.pradalabs.odontoclinicbackend.modelo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;


@PersistenceCapable
public class Precios {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private Integer cdProcedimiento;
	@Persistent
	private String dsProcedimiento;
	@Persistent
	private double Precio;
	@Persistent
	private double descuentoAutorizado;
	
	
	
	public Integer getCdProcedimiento() {
		return cdProcedimiento;
	}
	public void setCdProcedimiento(Integer cdProcedimiento) {
		this.cdProcedimiento = cdProcedimiento;
	}
	public String getDsProcedimiento() {
		return dsProcedimiento;
	}
	public void setDsProcedimiento(String dsProcedimiento) {
		this.dsProcedimiento = dsProcedimiento;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public double getDescuentoAutorizado() {
		return descuentoAutorizado;
	}
	public void setDescuentoAutorizado(double descuentoAutorizado) {
		this.descuentoAutorizado = descuentoAutorizado;
	}
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	
	
}
