package co.com.pradalabs.odontoclinicbackend;

import java.io.IOException;
import javax.servlet.http.*;


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
	}
}
