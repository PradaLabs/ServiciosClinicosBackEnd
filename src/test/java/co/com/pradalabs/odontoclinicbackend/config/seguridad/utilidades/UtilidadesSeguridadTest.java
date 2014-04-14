package co.com.pradalabs.odontoclinicbackend.config.seguridad.utilidades;

import junit.framework.Assert;

import org.junit.Test;





public class UtilidadesSeguridadTest {

	@Test
	public void ConvertirMDA5Test(){
		
		String RespuestaMDA5="";
		try{
			UtilidadesSeguridad utilidadesSeguridad = new UtilidadesSeguridad();
			RespuestaMDA5=utilidadesSeguridad.convertirString2MDA5("PlsChgMe!");
			System.out.println(RespuestaMDA5);
		}catch(Exception e){
			e.printStackTrace();
			Assert.fail();
			
		}
		Assert.assertEquals(true, RespuestaMDA5 != null);
	}
}
