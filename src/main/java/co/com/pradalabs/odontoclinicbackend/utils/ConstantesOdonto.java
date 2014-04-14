package co.com.pradalabs.odontoclinicbackend.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstantesOdonto {

	
	static public final String PATH_ADMIN="/_ah/";
	static public  final String PATH_AUTENTICACION="/AutenticacionGoogle";
	static public  final String PATH_AUTENTICACION_SERVICE="/rest/Autenticacion/AutenticacionUserPass";
	
	static public  final  List<String> RecursosSinSeguridad=Arrays.asList( ConstantesOdonto.PATH_ADMIN,
			ConstantesOdonto.PATH_AUTENTICACION,
			ConstantesOdonto.PATH_AUTENTICACION_SERVICE);
}
