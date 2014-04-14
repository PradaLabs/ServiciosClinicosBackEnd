package co.com.pradalabs.odontoclinicbackend.utils;

public class BussinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BussinessException() {
		super();
	}

	public BussinessException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BussinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BussinessException(String message) {
		super(message);
		
	}

	public BussinessException(Throwable cause) {
		super(cause);
	}
	
}
