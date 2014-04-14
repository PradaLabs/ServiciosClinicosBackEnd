package co.com.pradalabs.odontoclinicbackend.config;




/*
 * Entity manager factory implementacion para NoSQL.
 *
 */
public class EntityManagerNoSqlFactory implements EntityManagerFactory{
	  private boolean initialized;

	public void init(ConfigManager configManager) {
		if (!initialized) {
		      /*TODO se inicializan los objetos que se van usar en el backEnd*/
			
		    } else {
		      throw new IllegalStateException("Solo se puede iniciar las instancias una sola vez ");
		    }
		  }

}
