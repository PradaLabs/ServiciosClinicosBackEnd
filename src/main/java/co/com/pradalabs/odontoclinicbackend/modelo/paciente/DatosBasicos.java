package co.com.pradalabs.odontoclinicbackend.modelo.paciente;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class DatosBasicos {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
    private String primerNombre;
	
	@Persistent
	private String segundoNombre;
	
	@Persistent
    private String primerApellido;
	
	@Persistent
    private String segundoApellido;

	@Persistent
	private String numeroDocumento;
	
	@Persistent
    private String tipoDocumento;

	@Persistent
    private String direccion;

	@Persistent
    private String telefono;

	@Persistent
    private String celular;

	@Persistent
    private String ciudad;

	@Persistent
    private String departamento;

	@Persistent
    private String correoElectronico;

	@Persistent
    private String pais;
	
	@Persistent
    private String dni;
	
	@Persistent
    private String eps;

	@Persistent
    private String tipoVinculacion;
	
	@Persistent
    private Date fechaNacimiento;

	@Persistent
    private String sexo;

	@Persistent
    private String estadoCivil;

	@Persistent
    private String cdOcupacion;

	@Persistent
    private String dsOcupacion;
	
	@Persistent
    private String rH;
	
	@Persistent
	private String observacion;

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getTipoVinculacion() {
		return tipoVinculacion;
	}

	public void setTipoVinculacion(String tipoVinculacion) {
		this.tipoVinculacion = tipoVinculacion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCdOcupacion() {
		return cdOcupacion;
	}

	public void setCdOcupacion(String cdOcupacion) {
		this.cdOcupacion = cdOcupacion;
	}

	public String getDsOcupacion() {
		return dsOcupacion;
	}

	public void setDsOcupacion(String dsOcupacion) {
		this.dsOcupacion = dsOcupacion;
	}
	public String getrH() {
		return rH;
	}

	public void setrH(String rH) {
		this.rH = rH;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public DatosBasicos() {
		this.key = null;
		this.primerNombre = null;
		this.segundoNombre = null;
		this.primerApellido = null;
		this.segundoApellido = null;
		this.numeroDocumento = null;
		this.tipoDocumento = null;
		this.direccion = null;
		this.telefono = null;
		this.celular = null;
		this.ciudad = null;
		this.departamento = null;
		this.correoElectronico = null;
		this.pais = null;
		this.dni = null;
		this.eps = null;
		this.tipoVinculacion = null;
		this.fechaNacimiento = null;
		this.sexo = null;
		this.estadoCivil = null;
		this.cdOcupacion = null;
		this.dsOcupacion = null;
		this.rH = null;
		this.observacion=null;
	}

   

	
    
}

