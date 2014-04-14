package co.com.pradalabs.odontoclinicbackend.config.seguridad.utilidades;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

import co.com.pradalabs.odontoclinicbackend.utils.BussinessException;




public class UtilidadesSeguridad {

	public String convertirString2MDA5(String datoConvertir) throws BussinessException {
		
		byte[] bytesOfMessage;
		byte[] thedigest=null;
		try {
			bytesOfMessage = datoConvertir.getBytes("UTF-8");
		
		MessageDigest md = MessageDigest.getInstance("MD5");
		thedigest= md.digest(bytesOfMessage);
		} catch (Exception e) {
			e.printStackTrace();
			BussinessException bussinessException =new BussinessException(e.getCause());
			throw bussinessException;
		}
		return thedigest.toString();
	}

}
