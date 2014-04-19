package co.com.pradalabs.odontoclinicbackend.persistencia.Interface;

import java.util.Map;

import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;

public interface IActulizarPM {
	public Object consultarObjeto(Map<String,Object> datoIngresados)throws BussinessException;
	public Boolean cerrarConexion() throws BussinessException;
}
