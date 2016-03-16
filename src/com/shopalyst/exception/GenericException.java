/**
 * 
 */
package com.shopalyst.exception;

/**
 * @author Rafne [Email: rafneesh@gmail.com]
 *
 */
import javax.xml.ws.WebFault;

@WebFault(name = "genericException")
public class GenericException extends Exception {
	private static final long serialVersionUID = 1L;

	private GenericException() {
	}

	public GenericException(String message) {
		super(message);
	}

	public GenericException(String message, Throwable cause) {
		super(message, cause);
	}
}