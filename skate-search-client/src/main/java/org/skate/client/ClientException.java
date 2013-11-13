package org.skate.client;

/**
 * Generic skate runtime exception. skate so far does not have checked exceptions,
 * the idea behind is that checked exceptions create a lot of ugly boilerplate
 * code, and more important, all code should be tested so that exception will
 * not occur runtime.
 * 
 * 
 * 
 * 
 * 
 * @author Erik van Ingen
 * 
 */
public class ClientException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2642244769107080180L;

	public ClientException(Exception e) {
		super(e);
	}

	public ClientException(String message) {
		super(message);
	}

}
