package co.com.pradalabs.odontoclinicbackend.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OdontoclinicbackendServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Este si toma cambios para que vea, quiero publish fast");
		System.out.println("hola mundo cruel2");
//		try{
//			String name = "Andres";
//			PersistenceManager pm = PMF.get().getPersistenceManager();
//			Key key = KeyFactory.createKey(Prueba.class.getSimpleName(), "orthodental@gmail.com");
//			Prueba prueba = new Prueba(key, 501, "asdasd");
//			 pm.makePersistent(prueba);
//		    String outMsg = "Se guardo con exito la clinica  " + name +"!";
//			System.out.println(outMsg);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
	}
}
