package co.com.pradalabs.odontoclinicbackend.config;

import co.com.pradalabs.odontoclinicbackend.config.ConfigManager;



/**
 * The entity manager factory interface.
 *	Coment: esta  implementacion debera ir creciendo conforme los servicios de BD crescan
 */
public interface EntityManagerFactory {

	
	
	/**
	 * Inicializacion de factory Objects
	 * 
	 */
	
	 void init(ConfigManager configManager);
}
