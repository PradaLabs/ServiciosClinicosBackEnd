package co.com.pradalabs.odontoclinicbackend.modelo;

public class Precios {

	private Integer cdProcedimiento;
	private String dsProcedimiento;
	private double Precio;
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
	
	
}
