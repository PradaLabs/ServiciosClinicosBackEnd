package co.com.pradalabs.odontoclinicbackend.servicios;

import java.util.HashMap;
import java.util.List;

import co.com.pradalabs.odontoclinicbackend.modelo.administracion.RelacionUsuarioClinica;
import co.com.pradalabs.odontoclinicbackend.persistencia.Interface.IActulizarPM;
import co.com.pradalabs.odontoclinicbackend.persistencia.Interface.IGuardarPM;
import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;
import co.com.pradalabs.odontoclinicbackend.utils.ConstantesOdonto;

public class ServicioRelacionUsuarioClinica {

	private IGuardarPM servicioGuardarRelacionUsuarioClinica;
	private IActulizarPM servicioConsultarRelacionUsuarioClinica;
	private IActulizarPM servicioActulizarRelacionUsuarioClinica;
	
	
	public void setServicioGuardarRelacionUsuarioClinica(
			IGuardarPM servicioGuardarRelacionUsuarioClinica) {
		this.servicioGuardarRelacionUsuarioClinica = servicioGuardarRelacionUsuarioClinica;
	}
	public void setServicioConsultarRelacionUsuarioClinica(
			IActulizarPM servicioConsultarRelacionUsuarioClinica) {
		this.servicioConsultarRelacionUsuarioClinica = servicioConsultarRelacionUsuarioClinica;
	}
	public void setServicioActulizarRelacionUsuarioClinica(
			IActulizarPM servicioActulizarRelacionUsuarioClinica) {
		this.servicioActulizarRelacionUsuarioClinica = servicioActulizarRelacionUsuarioClinica;
	}
	public boolean guardarRelacionUsuarioClinica(RelacionUsuarioClinica relacionUsuarioClinica,String idUsuario) throws BussinessException{
		boolean resultado = false;
		HashMap<String, Object> datoIngresados = new HashMap<>();
		datoIngresados.put(ConstantesOdonto.RELACION_USUARIO_CLINICA, relacionUsuarioClinica);
		datoIngresados.put(ConstantesOdonto.CLAVE_RELACION_USUARIO_CLINICA,idUsuario);
		resultado=servicioGuardarRelacionUsuarioClinica.guardar(datoIngresados);
		return resultado;
	}
	public RelacionUsuarioClinica consultarRelacionUsuarioClinica(String idUsuario) throws BussinessException{
		RelacionUsuarioClinica relacionUsuarioClinica=new RelacionUsuarioClinica();
		HashMap<String, Object> datoIngresados = new HashMap<>();
		datoIngresados.put(ConstantesOdonto.CLAVE_RELACION_USUARIO_CLINICA, idUsuario);
		relacionUsuarioClinica=(RelacionUsuarioClinica) servicioConsultarRelacionUsuarioClinica.consultarObjeto(datoIngresados);
		return relacionUsuarioClinica;
	}
	public boolean adicionarClinicaUsuario(String idClinica)throws BussinessException{
		boolean resultado=false;
		HashMap<String, Object> datoIngresados = new HashMap<>();
		RelacionUsuarioClinica relacionUsuarioClinica= (RelacionUsuarioClinica)servicioActulizarRelacionUsuarioClinica.ActualizarObjeto(datoIngresados);
		List<String> listaIdCLinicas=relacionUsuarioClinica.getIdClinica();
		if(listaIdCLinicas != null){
			listaIdCLinicas.add(idClinica);
		}
		servicioActulizarRelacionUsuarioClinica.cerrarConexion();
		return resultado;
	}

	
	
}
