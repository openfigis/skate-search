package org.skate.service;

/**
 * Generic skate runtime exception. skate so far does not have checked exceptions, the idea behind is that checked
 * exceptions create a lot of ugly boilerplate code, and more important, all code should be tested so that exception
 * will not occur runtime.
 * 
 * 
 * 
 * 
 * 
 * @author Erik van Ingen
 * 
 */
public class SkateException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2097071554504821684L;

	public SkateException(Exception e) {
		super(e);
	}

	public SkateException(String message) {
		super(message);
	}

}
