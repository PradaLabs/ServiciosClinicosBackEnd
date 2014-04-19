package co.com.pradalabs.odontoclinicbackend.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Utils {

	
	
	public Utils() {
	}

	public  String obtenerStringTrazaExcepcion(Throwable trazaExcepcion) {
		StringWriter stringWriter = new StringWriter();
		trazaExcepcion.printStackTrace(new PrintWriter(stringWriter));
		return stringWriter.toString();
	}
}
